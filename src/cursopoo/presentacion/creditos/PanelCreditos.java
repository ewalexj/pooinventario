package cursopoo.presentacion.creditos;

/*
 * =====================================================================
 * PanelCreditos  (capa: PRESENTACIÓN)
 * =====================================================================
 * RESPONSABILIDAD
 *   Tarjeta "Créditos": lista las ventas a crédito con saldo pendiente,
 *   muestra sus abonos y permite registrar un abono nuevo.
 *
 * REGLA DE CAPA
 *   NUNCA escribe SQL: usa RegistroVenta y RegistroAbono.
 *
 * ATRIBUTOS
 *   - tablaCreditos + modelo (columnas: ID venta, Fecha, Cliente, Total,
 *     Pagado, Saldo).
 *   - tablaAbonos + modelo (columnas: Fecha, Monto) de la venta elegida.
 *   - btnAbonar.
 *   - registroVenta, registroAbono.
 *
 * MÉTODOS
 *   - Constructor.
 *   - recargar()       : registroVenta.listarCreditosPendientes().
 *   - mostrarAbonos()  : al seleccionar una venta.
 *   - abonar()         : abre DialogoAbono con la venta seleccionada; si
 *                        se guardó, recargar().
 *
 * RELACIONES
 *   - Vive en VentanaPrincipal.
 *   - Abre DialogoAbono.
 *   - Usa Venta, Abono, RegistroVenta, RegistroAbono, FormatoMoneda.
 *
 * TODO (en este orden)  -- paso 8 del plan
 *   1. tablaCreditos + recargar().
 *   2. tablaAbonos al seleccionar.
 *   3. Botón Abonar con DialogoAbono.
 * =====================================================================
 */
public class PanelCreditos {

}
