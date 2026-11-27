package cursopoo.modelo.ventas;

/*
 * =====================================================================
 * DetalleVenta  (capa: MODELO)
 * =====================================================================
 * RESPONSABILIDAD
 *   Un renglón de una venta (tabla "detalle_venta"): qué producto, cuántas
 *   unidades y a qué precios. Los precios se COPIAN del producto en el
 *   momento de la venta, para que el historial no cambie si después se
 *   modifica el precio del producto.
 *
 * REGLA DE CAPA
 *   El modelo NO importa nada de java.sql ni de javax.swing.
 *
 * ATRIBUTOS (privados)
 *   - idVenta  : FK a venta (se conoce hasta que la venta se inserta).
 *   - producto : Producto vendido (o idProd + nombre para mostrar).
 *   - cantidad : unidades vendidas (NO es el stock).
 *   - precioC  : precio de compra copiado al vender.
 *   - precioV  : precio de venta copiado al vender.
 *
 * MÉTODOS
 *   - Constructor que recibe un Producto y una cantidad y copia sus
 *     precios.
 *   - Getters y setters.
 *   - getImporte()  : cantidad * precioV (lo que se muestra en el ticket).
 *   - getGanancia() : cantidad * (precioV - precioC).
 *
 * RELACIONES
 *   - Pertenece a una Venta.
 *   - Se refiere a un Producto.
 *   - ServicioVenta inserta cada uno en detalle_venta.
 *   - DialogoTicket imprime un renglón por cada uno.
 *
 * TODO (en este orden)
 *   1. Atributos.
 *   2. Constructor (Producto, cantidad) que copia precios.
 *   3. Getters y setters.
 *   4. getImporte y getGanancia.
 * =====================================================================
 */
public class DetalleVenta {

}
