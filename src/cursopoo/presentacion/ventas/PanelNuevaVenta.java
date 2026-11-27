package cursopoo.presentacion.ventas;

/*
 * =====================================================================
 * PanelNuevaVenta  (capa: PRESENTACIÓN)
 * =====================================================================
 * RESPONSABILIDAD
 *   Tarjeta "Nueva venta": funciona como la caja registradora. Permite
 *   elegir cliente, agregar productos con su cantidad a un "carrito",
 *   ver el total y pasar a cobrar.
 *
 * REGLA DE CAPA
 *   NUNCA escribe SQL. Lee productos/clientes con los Registro* y
 *   registra la venta con ServicioVenta (a través de DialogoCobro).
 *
 * ATRIBUTOS
 *   - cboCliente   : JComboBox<Cliente> ("Público general" por defecto).
 *   - cboProducto  : JComboBox<Producto> (o una tabla con buscador).
 *   - txtCantidad  : JTextField o JSpinner.
 *   - btnAgregar, btnQuitar, btnCobrar, btnCancelar.
 *   - tablaCarrito + modelo (columnas: Cantidad, Producto, Precio,
 *                    Importe).
 *   - lblTotal     : JLabel con el total (usa FormatoMoneda).
 *   - venta        : Venta en construcción (con su lista de DetalleVenta).
 *
 * MÉTODOS
 *   - Constructor (arma la interfaz).
 *   - recargar()        : vuelve a cargar combos de clientes y productos
 *                         (por si cambiaron) y limpia el carrito.
 *   - agregarAlCarrito(): valida cantidad (entero > 0) y stock suficiente
 *                         (considerando lo que ya está en el carrito),
 *                         crea DetalleVenta y lo agrega a la venta.
 *   - quitarDelCarrito(): elimina el renglón seleccionado.
 *   - refrescarCarrito(): redibuja la tabla y el total.
 *   - cobrar()          : si el carrito no está vacío, abre DialogoCobro;
 *                         si la venta se registró, abre DialogoTicket y
 *                         reinicia el panel.
 *
 * RELACIONES
 *   - Vive en VentanaPrincipal.
 *   - Usa Venta, DetalleVenta, Producto, Cliente (modelo).
 *   - Usa RegistroInventario, RegistroCliente (persistencia).
 *   - Abre DialogoCobro y luego DialogoTicket.
 *   - Usa Validador y FormatoMoneda.
 *
 * TODO (en este orden)  -- paso 6 del plan
 *   1. Interfaz: combos, cantidad, botones, tabla, total.
 *   2. recargar() llenando los combos.
 *   3. agregarAlCarrito + refrescarCarrito.
 *   4. quitarDelCarrito.
 *   5. cobrar() conectado a DialogoCobro y DialogoTicket.
 * =====================================================================
 */
public class PanelNuevaVenta {

}
