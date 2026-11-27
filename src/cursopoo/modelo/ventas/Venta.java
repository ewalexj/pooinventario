package cursopoo.modelo.ventas;

/*
 * =====================================================================
 * Venta  (capa: MODELO)
 * =====================================================================
 * RESPONSABILIDAD
 *   Representa una venta completa (tabla "venta") junto con sus
 *   renglones. Calcula su total a partir de los detalles.
 *
 * DECISIÓN DE DISEÑO
 *   Usa ArrayList<DetalleVenta> en lugar de ArrayList<Producto> (como en
 *   el diagrama del profe). Motivo: Producto.cantidad es el STOCK, y en
 *   una venta necesitamos la CANTIDAD VENDIDA y el precio de ese momento.
 *   DetalleVenta guarda justo eso, sin confundir ambos conceptos.
 *
 * REGLA DE CAPA
 *   El modelo NO importa nada de java.sql ni de javax.swing.
 *
 * ATRIBUTOS (privados)
 *   - idVenta  : PK.
 *   - cliente  : Cliente (o solo idCte) al que se le vendió.
 *   - fecha    : fecha/hora de la venta (String "yyyy-MM-dd HH:mm:ss"
 *                o LocalDateTime; SQLite lo guarda como TEXT).
 *   - total    : suma de los importes de los detalles.
 *   - tipoPago : "CONTADO" o "CREDITO" (puedes usar constantes o enum).
 *   - pagado   : cuánto se ha pagado (en contado = total).
 *   - saldo    : lo que falta por pagar (total - pagado).
 *   - detalles : ArrayList<DetalleVenta>.
 *
 * MÉTODOS
 *   - Constructores y getters/setters.
 *   - agregarDetalle(detalle) : añade un renglón; si el producto ya está,
 *                               podría sumar la cantidad.
 *   - quitarDetalle(indice)   : elimina un renglón del carrito.
 *   - calcularTotal()         : recorre detalles y suma importes.
 *   - estaLiquidada()         : saldo == 0.
 *   - getGananciaTotal()      : suma de la ganancia de cada detalle
 *                               (la usa ServicioVenta para la tabla
 *                               "ganancia").
 *
 * RELACIONES
 *   - Tiene muchos DetalleVenta (composición).
 *   - Pertenece a un Cliente.
 *   - Puede tener muchos Abono (si es a crédito).
 *   - ServicioVenta la registra; RegistroVenta la consulta.
 *   - PanelNuevaVenta la arma; DialogoCobro y DialogoTicket la usan.
 *
 * TODO (en este orden)
 *   1. Atributos y constantes CONTADO / CREDITO.
 *   2. Inicializar la lista de detalles en el constructor.
 *   3. Getters y setters.
 *   4. agregarDetalle / quitarDetalle.
 *   5. calcularTotal.
 *   6. getGananciaTotal.
 *   7. estaLiquidada.
 * =====================================================================
 */
public class Venta {

}
