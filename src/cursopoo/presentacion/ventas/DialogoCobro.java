package cursopoo.presentacion.ventas;

/*
 * =====================================================================
 * DialogoCobro  (capa: PRESENTACIÓN)
 * =====================================================================
 * RESPONSABILIDAD
 *   JDialog modal que muestra el total, permite elegir el tipo de pago
 *   (CONTADO / CREDITO), captura el efectivo, calcula el cambio y manda
 *   registrar la venta con ServicioVenta.
 *
 * REGLA DE CAPA
 *   NUNCA escribe SQL: llama a ServicioVenta.registrarVenta(venta).
 *
 * ATRIBUTOS
 *   - lblTotal     : total a pagar.
 *   - rbContado, rbCredito : JRadioButton en un ButtonGroup.
 *   - txtEfectivo  : efectivo recibido (en crédito puede ser el enganche).
 *   - lblCambio    : se actualiza al escribir (DocumentListener o al
 *                    presionar un botón "Calcular").
 *   - btnCobrar, btnCancelar.
 *   - venta        : la Venta que llega de PanelNuevaVenta.
 *   - efectivo, cambio : para pasárselos al ticket.
 *   - registrada   : boolean; true si la venta se guardó.
 *
 * MÉTODOS
 *   - Constructor(ventanaPadre, venta).
 *   - calcularCambio().
 *   - cobrar(): valida -> llena tipoPago/pagado/saldo en la venta ->
 *               servicio.registrarVenta(venta) -> registrada = true ->
 *               dispose(). Si el servicio falla, mostrar el mensaje.
 *   - isRegistrada(), getEfectivo(), getCambio().
 *
 * VALIDACIONES
 *   - Efectivo numérico válido (NumberFormatException).
 *   - CONTADO: efectivo >= total.
 *   - CREDITO: solo si el cliente NO es "Público general".
 *
 * RELACIONES
 *   - Lo abre PanelNuevaVenta.
 *   - Usa Venta, Cliente, ServicioVenta, Validador, FormatoMoneda.
 *
 * TODO (en este orden)  -- paso 6 del plan
 *   1. Interfaz con total, efectivo y cambio (solo CONTADO).
 *   2. calcularCambio y validación efectivo >= total.
 *   3. Llamar a ServicioVenta y marcar registrada.
 *   4. Agregar la opción CREDITO con su validación.
 * =====================================================================
 */
public class DialogoCobro {

}
