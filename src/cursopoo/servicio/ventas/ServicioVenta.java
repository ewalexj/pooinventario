package cursopoo.servicio.ventas;

/*
 * =====================================================================
 * ServicioVenta  (capa: SERVICIO)
 * =====================================================================
 * RESPONSABILIDAD
 *   Contiene la LÓGICA DE NEGOCIO de vender: valida y registra una venta
 *   completa en UNA SOLA TRANSACCIÓN, para que nunca quede una venta a
 *   medias (por ejemplo, venta guardada pero stock sin restar).
 *
 * REGLAS DE ARQUITECTURA
 *   - Capas: presentacion -> servicio -> persistencia -> SQLite.
 *   - PanelNuevaVenta / DialogoCobro llaman a este servicio; ellos no
 *     escriben SQL.
 *   - Obtiene la conexión con ConexionBD.getConexion() y la usa para
 *     TODAS las sentencias de la transacción (la misma conexión).
 *
 * MÉTODOS
 *   - validarStock(venta)     : para cada DetalleVenta, consulta el stock
 *                               actual del producto; si cantidad > stock,
 *                               lanza una excepción con mensaje claro.
 *   - registrarVenta(venta)   : devuelve el id de la venta generada.
 *       Pasos:
 *         0. validarStock(venta)  (ANTES de empezar la transacción)
 *         1. con.setAutoCommit(false)
 *         2. INSERT INTO venta ...  -> obtener id_venta generado
 *         3. por cada detalle: INSERT INTO detalle_venta ...
 *         4. por cada detalle: UPDATE producto SET cantidad = cantidad - ?
 *            WHERE id_prod = ?
 *         5. INSERT INTO ganancia (id_venta, fecha, venta.getGananciaTotal())
 *         6. con.commit()
 *         Si cualquier paso lanza SQLException -> con.rollback() y avisar.
 *         Al final (finally) -> setAutoCommit(true) y cerrar la conexión.
 *   - Reglas de cobro (pueden vivir aquí o en DialogoCobro):
 *       * CONTADO: efectivo >= total; pagado = total; saldo = 0.
 *       * CREDITO: solo con cliente registrado (no "Público general");
 *                  pagado = enganche (o 0); saldo = total - pagado.
 *
 * RELACIONES
 *   - Usa Venta, DetalleVenta, Producto, Cliente, Ganancia (modelo).
 *   - Usa ConexionBD (y opcionalmente RegistroInventario para consultar
 *     stock).
 *   - Lo usan PanelNuevaVenta y DialogoCobro.
 *
 * TODO (en este orden)  -- paso 6 del plan
 *   1. validarStock(venta).
 *   2. registrarVenta: solo el INSERT de venta, sin transacción, y
 *      verificar en la BD.
 *   3. Agregar INSERT de detalles.
 *   4. Agregar UPDATE de stock.
 *   5. Agregar INSERT de ganancia.
 *   6. Envolver todo en la transacción (autoCommit/commit/rollback).
 *   7. Probar un fallo a propósito (p. ej. lanzar una excepción después
 *      del paso 3) y comprobar que el rollback no dejó nada guardado.
 *   8. Reglas de CONTADO / CREDITO.
 * =====================================================================
 */
public class ServicioVenta {

}
