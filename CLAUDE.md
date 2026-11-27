# Sistema de Inventarios (proyecto escolar de POO en Java)

## Modo de trabajo: soy estudiante y quiero APRENDER
- **NO escribas ni edites el código de mis clases por mí.** Puedes leerlo para ayudarme.
- Explícame qué hacer en cada paso y **por qué**, con ejemplos cortos y **genéricos** de sintaxis
  (por ejemplo con una clase `Persona` o `Libro`, no con mi código ya resuelto).
- Si tengo un error: señala **dónde** está (archivo y línea) y dame **pistas** primero.
  Solo dame la solución si la pido después de intentarlo.
- Los archivos que sí puedes editar: este CLAUDE.md, `TABLAS_TEMP.md`, `lib/README.txt` y
  `.vscode/settings.json`, si te lo pido.

## Tecnologías
- Java + SQLite (driver `sqlite-jdbc` de xerial) + Swing con FlatLaf.
- Sin Maven ni Gradle: los `.jar` van en `lib/` (ver `lib/README.txt`).
- Editor: VS Code (Extension Pack for Java). El profesor revisa en **Eclipse**: no usar nada
  exclusivo de VS Code; los archivos van en UTF-8.
- Código fuente en `src/cursopoo/...`; base de datos: `inventario.db` en la carpeta de ejecución.

## Arquitectura (respetarla siempre)
- Capas: `presentacion → servicio → persistencia → SQLite`. Todas usan las clases de `modelo`.
- `presentacion` **nunca** escribe SQL. `modelo` **no importa** nada de Swing ni de `java.sql`.
- Clases `Registro*` hacen el CRUD con `PreparedStatement`:
  `insertar(obj)`, `listar()`, `consultar(id)`, `actualizar(obj)`,
  `eliminar(id)` = **baja lógica** (`activo = 0`, no `DELETE`).
- `ConexionBD`: entrega la conexión a `inventario.db`, crea las tablas con
  `CREATE TABLE IF NOT EXISTS` y, al iniciar, crea el cliente "Público general" si no existe.
- `ServicioVenta`: registra una venta en **una transacción** (`setAutoCommit(false)`,
  `commit`, `rollback`): INSERT venta → INSERT detalle_venta por producto →
  UPDATE producto (restar stock) → INSERT ganancia. Valida stock suficiente **antes** de empezar.
- `Venta` tiene `ArrayList<DetalleVenta>` (no `ArrayList<Producto>`), para no confundir el stock
  con la cantidad vendida. Los precios se copian al detalle al momento de vender.
- `Main` (en `cursopoo.presentacion`): activa FlatLaf **antes** de crear ventanas y abre
  `VentanaPrincipal` con `SwingUtilities.invokeLater`.
- `VentanaPrincipal`: `JFrame` con menú lateral (Productos, Clientes, Nueva venta, Ventas,
  Ganancias, Créditos) y `CardLayout` a la derecha. Cada panel recarga su tabla al mostrarse.
- Ticket (como el PDF): nombre de la tienda, cajero, renglones (cantidad, nombre, importe),
  total, efectivo, cambio y "¡Gracias por su compra!".
- Validaciones: campos vacíos; números inválidos (`NumberFormatException`); cantidad y precios
  `>= 0`; stock suficiente; efectivo `>=` total en contado; crédito solo con cliente registrado;
  abono `> 0` y `<=` saldo.

## Tablas
producto, cliente, venta, detalle_venta (PK compuesta), ganancia, abono.
Detalle en `TABLAS_TEMP.md` (temporal; si ya no existe, deducirlo de `ConexionBD`).

## Orden de trabajo
1. `ConexionBD` + tablas.
2. Productos: `Producto` + `RegistroInventario`, probado en consola.
3. `Main` + FlatLaf + `VentanaPrincipal` vacía.
4. `PanelProductos` + `DialogoProducto`.
5. Clientes (`Cliente`, `RegistroCliente`, `PanelClientes`, `DialogoCliente`).
6. `ServicioVenta` + `PanelNuevaVenta` + `DialogoCobro` + `DialogoTicket`.
7. Historial de ventas y ganancias.
8. Créditos y abonos.

Cada clase tiene arriba un comentario con su responsabilidad, atributos, métodos, relaciones y
TODOs en orden: úsalo como guía al explicarme cada paso.
