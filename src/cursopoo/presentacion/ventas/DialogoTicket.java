package cursopoo.presentacion.ventas;

/*
 * =====================================================================
 * DialogoTicket  (capa: PRESENTACIÓN)
 * =====================================================================
 * RESPONSABILIDAD
 *   JDialog que muestra el ticket de la venta, con el formato del PDF:
 *
 *         NOMBRE DE LA TIENDA
 *         Cajero: ________
 *         Fecha:  ________     Ticket #: ___
 *         ----------------------------------
 *         CANT  PRODUCTO            IMPORTE
 *          2    Refresco 600ml       $36.00
 *          1    Pan dulce            $12.00
 *         ----------------------------------
 *         TOTAL:                     $48.00
 *         EFECTIVO:                 $100.00
 *         CAMBIO:                    $52.00
 *
 *         ¡Gracias por su compra!
 *
 * ATRIBUTOS
 *   - areaTicket : JTextArea NO editable con fuente monoespaciada
 *                  (Font.MONOSPACED) para que las columnas se alineen.
 *   - btnCerrar  : JButton.
 *   - Constantes: NOMBRE_TIENDA, CAJERO (o recibir el cajero como
 *     parámetro).
 *
 * MÉTODOS
 *   - Constructor(ventanaPadre, venta, efectivo, cambio).
 *   - generarTexto(): arma el String del ticket con String.format o
 *                     StringBuilder (ej. "%-4d %-20s %10s%n").
 *   - (Opcional) reimprimir desde PanelHistorialVentas sin efectivo.
 *
 * RELACIONES
 *   - Lo abre PanelNuevaVenta tras un cobro exitoso.
 *   - Puede abrirlo PanelHistorialVentas para ver un ticket viejo.
 *   - Usa Venta, DetalleVenta y FormatoMoneda.
 *
 * TODO (en este orden)  -- paso 6 del plan
 *   1. JDialog con JTextArea monoespaciada.
 *   2. Encabezado (tienda, cajero, fecha, número).
 *   3. Renglones (for-each sobre los detalles).
 *   4. Total, efectivo, cambio y mensaje final.
 * =====================================================================
 */
public class DialogoTicket {

}
