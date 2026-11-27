package cursopoo.presentacion.util;

/*
 * =====================================================================
 * Validador  (capa: PRESENTACIÓN, utilería)
 * =====================================================================
 * RESPONSABILIDAD
 *   Métodos static para validar lo que el usuario escribe en los
 *   formularios ANTES de mandarlo a persistencia o servicio. Así no se
 *   repite el mismo try/catch en cada diálogo.
 *
 * MÉTODOS (todos static; pueden devolver boolean o lanzar una excepción
 * con un mensaje para mostrar en JOptionPane; elige un estilo y úsalo
 * siempre igual)
 *   - noVacio(texto, nombreCampo)       : campo no vacío (usa trim()).
 *   - leerEntero(texto, nombreCampo)    : Integer.parseInt con captura de
 *                                         NumberFormatException.
 *   - leerDecimal(texto, nombreCampo)   : Double.parseDouble con captura
 *                                         de NumberFormatException.
 *   - noNegativo(valor, nombreCampo)    : cantidad y precios >= 0.
 *   - positivo(valor, nombreCampo)      : > 0 (cantidad a vender, abono).
 *   - stockSuficiente(pedido, stock)    : pedido <= stock.
 *   - efectivoSuficiente(efectivo, total): en CONTADO, efectivo >= total.
 *   - abonoValido(monto, saldo)         : monto > 0 y monto <= saldo.
 *   - (Regla de crédito) crédito solo con cliente registrado: puede
 *     validarse aquí recibiendo el Cliente, o en DialogoCobro.
 *
 * RELACIONES
 *   - La usan DialogoProducto, DialogoCliente, PanelNuevaVenta,
 *     DialogoCobro y DialogoAbono.
 *   - No toca SQL ni la BD.
 *
 * TODO (en este orden)
 *   1. noVacio.
 *   2. leerEntero y leerDecimal (NumberFormatException).
 *   3. noNegativo y positivo.
 *   4. stockSuficiente (paso 6).
 *   5. efectivoSuficiente (paso 6).
 *   6. abonoValido (paso 8).
 * =====================================================================
 */
public class Validador {

}
