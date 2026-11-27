package cursopoo.persistencia.ventas;

/*
 * =====================================================================
 * RegistroAbono  (capa: PERSISTENCIA)
 * =====================================================================
 * RESPONSABILIDAD
 *   Guardar y consultar abonos (tabla "abono") de ventas a crédito.
 *
 * REGLAS DE ARQUITECTURA
 *   - La presentación llama a esta clase; nunca escribe SQL ella misma.
 *   - Usa PreparedStatement y ConexionBD.getConexion().
 *
 * MÉTODOS
 *   - insertar(abono)        : en UNA transacción (setAutoCommit(false)):
 *                              INSERT abono -> UPDATE venta SET
 *                              pagado = pagado + monto,
 *                              saldo  = saldo  - monto
 *                              -> commit (o rollback si algo falla).
 *   - listarPorVenta(idVenta): historial de abonos de una venta.
 *   - (No necesita actualizar/eliminar: un abono registrado no se borra.)
 *
 * VALIDACIÓN (antes de insertar; puede hacerse en DialogoAbono con
 * Validador, pero conviene revisarla aquí también)
 *   - monto > 0  y  monto <= saldo actual de la venta.
 *
 * RELACIONES
 *   - Usa Abono, Venta y ConexionBD.
 *   - La usan DialogoAbono y PanelCreditos.
 *
 * TODO (en este orden)  -- paso 8 del plan
 *   1. listarPorVenta(idVenta).
 *   2. insertar(abono) con transacción.
 *   3. Verificar en la BD que pagado + saldo siga sumando el total.
 * =====================================================================
 */
public class RegistroAbono {

}
