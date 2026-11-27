# Tablas de la base de datos (guía temporal)

> Archivo de apoyo. Bórralo cuando ya tengas `ConexionBD.crearTablas()` funcionando.
> Tipos de SQLite: `INTEGER`, `REAL` (decimales), `TEXT`. SQLite no tiene `BOOLEAN` ni `DATE`:
> usa `INTEGER` 1/0 para booleanos y `TEXT` con formato `yyyy-MM-dd HH:mm:ss` para fechas.

## producto
Catálogo de productos y su existencia.

| Columna   | Tipo aprox.            | Nota |
|-----------|------------------------|------|
| id_prod   | INTEGER PK autoincrem. | Identificador |
| nombre    | TEXT, no nulo          | Nombre del producto |
| cantidad  | INTEGER                | **Stock** actual (baja al vender) |
| precio_c  | REAL                   | Precio de compra |
| precio_v  | REAL                   | Precio de venta |
| activo    | INTEGER (1/0)          | Baja lógica: 0 = eliminado |

## cliente
Clientes de la tienda. Incluye "Público general" (se crea al iniciar).

| Columna   | Tipo aprox.            | Nota |
|-----------|------------------------|------|
| id_cte    | INTEGER PK autoincrem. | Identificador |
| nombre    | TEXT, no nulo          | Nombre |
| direccion | TEXT                   | Dirección |
| activo    | INTEGER (1/0)          | Baja lógica |

## venta
Encabezado de cada venta.

| Columna   | Tipo aprox.            | Nota |
|-----------|------------------------|------|
| id_venta  | INTEGER PK autoincrem. | Número de ticket |
| id_cte    | INTEGER FK → cliente   | A quién se vendió |
| fecha     | TEXT                   | Fecha y hora de la venta |
| total     | REAL                   | Suma de importes de los detalles |
| tipo_pago | TEXT                   | `'CONTADO'` o `'CREDITO'` (puedes usar `CHECK`) |
| pagado    | REAL                   | Cuánto se ha pagado |
| saldo     | REAL                   | Cuánto falta (total − pagado) |

## detalle_venta
Renglones de cada venta. **PK compuesta** (id_venta, id_prod).
Los precios se **copian** del producto al momento de vender, para que el historial no cambie.

| Columna   | Tipo aprox.            | Nota |
|-----------|------------------------|------|
| id_venta  | INTEGER FK → venta     | Parte de la PK |
| id_prod   | INTEGER FK → producto  | Parte de la PK |
| cantidad  | INTEGER                | Unidades **vendidas** (no el stock) |
| precio_c  | REAL                   | Precio de compra en ese momento |
| precio_v  | REAL                   | Precio de venta en ese momento |

> Como la PK es (id_venta, id_prod), un producto aparece una sola vez por venta:
> si lo agregan dos veces al carrito, suma las cantidades.

## ganancia
Ganancia de cada venta (una fila por venta).

| Columna     | Tipo aprox.            | Nota |
|-------------|------------------------|------|
| id_ganancia | INTEGER PK autoincrem. | Identificador |
| id_venta    | INTEGER FK → venta     | Venta que la generó |
| fecha       | TEXT                   | Para filtrar por día/mes |
| ganancia    | REAL                   | Σ (precio_v − precio_c) × cantidad |

## abono *(opcional, para créditos)*
Pagos parciales de ventas a crédito.

| Columna  | Tipo aprox.            | Nota |
|----------|------------------------|------|
| id_abono | INTEGER PK autoincrem. | Identificador |
| id_venta | INTEGER FK → venta     | Venta a crédito que se paga |
| fecha    | TEXT                   | Cuándo se abonó |
| monto    | REAL                   | > 0 y ≤ saldo de la venta |

---

## Relaciones

```
  cliente 1 ──────< N venta 1 ──────< N detalle_venta N >────── 1 producto
                       │
                       ├── 1 ──────< 1 ganancia
                       │
                       └── 1 ──────< N abono   (solo si tipo_pago = 'CREDITO')
```

## Qué tablas toca cada operación

```
Operación                     Tablas (L = lee, E = escribe)
---------------------------   ---------------------------------------------------
Inicializar (ConexionBD)      CREATE de todas · cliente (L/E "Público general")
CRUD productos                producto (L/E)
CRUD clientes                 cliente (L/E)

REGISTRAR VENTA (ServicioVenta, UNA transacción)
  0. validar stock            producto (L)
  1. INSERT encabezado        venta (E)            → obtener id_venta
  2. INSERT renglones         detalle_venta (E)    × cada producto
  3. restar stock             producto (E)         × cada producto
  4. INSERT ganancia          ganancia (E)
  → commit  /  rollback si falla cualquier paso

Historial de ventas           venta (L) ⨝ cliente (L) · detalle_venta (L) ⨝ producto (L)
Ganancias                     ganancia (L)
Créditos pendientes           venta (L, tipo_pago='CREDITO' y saldo > 0) ⨝ cliente
REGISTRAR ABONO (transacción) abono (E) · venta (E: pagado += monto, saldo -= monto)
```
