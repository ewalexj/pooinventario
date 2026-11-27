package cursopoo.presentacion.creditos;

/*
 * =====================================================================
 * DialogoAbono  (capa: PRESENTACIÓN)
 * =====================================================================
 * RESPONSABILIDAD
 *   JDialog modal para capturar el monto de un abono a una venta a
 *   crédito.
 *
 * REGLA DE CAPA
 *   NUNCA escribe SQL: guarda con RegistroAbono.insertar(abono).
 *
 * ATRIBUTOS
 *   - lblCliente, lblTotal, lblSaldo : información de la venta.
 *   - txtMonto : monto a abonar.
 *   - btnGuardar, btnCancelar.
 *   - venta    : la Venta a la que se abona.
 *   - guardado : boolean.
 *
 * MÉTODOS
 *   - Constructor(ventanaPadre, venta).
 *   - guardar(): valida -> crea Abono -> registroAbono.insertar(...) ->
 *                guardado = true -> dispose().
 *   - isGuardado().
 *
 * VALIDACIONES
 *   - Monto numérico válido (NumberFormatException).
 *   - Monto > 0 y monto <= saldo.
 *
 * RELACIONES
 *   - Lo abre PanelCreditos.
 *   - Usa Venta, Abono, RegistroAbono, Validador, FormatoMoneda.
 *
 * TODO (en este orden)  -- paso 8 del plan
 *   1. Formulario con la info de la venta.
 *   2. Validación del monto.
 *   3. Guardar con RegistroAbono.
 * =====================================================================
 */
public class DialogoAbono {

}
