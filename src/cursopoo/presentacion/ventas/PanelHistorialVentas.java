package cursopoo.presentacion.ventas;

/*
 * =====================================================================
 * PanelHistorialVentas  (capa: PRESENTACIÓN)
 * =====================================================================
 * RESPONSABILIDAD
 *   Tarjeta "Ventas": lista las ventas realizadas y permite ver el
 *   detalle (o el ticket) de una venta seleccionada.
 *
 * REGLA DE CAPA
 *   NUNCA escribe SQL: usa RegistroVenta.
 *
 * ATRIBUTOS
 *   - tablaVentas + modelo (columnas: ID, Fecha, Cliente, Total,
 *     Tipo pago, Saldo).
 *   - tablaDetalle + modelo (columnas: Cantidad, Producto, Precio,
 *     Importe) que se llena al seleccionar una venta.
 *   - btnVerTicket (opcional).
 *   - Filtro por fecha (opcional).
 *   - registro : RegistroVenta.
 *
 * MÉTODOS
 *   - Constructor.
 *   - recargar()          : llena tablaVentas con registro.listar().
 *   - mostrarDetalle()    : ListSelectionListener en tablaVentas; llena
 *                           tablaDetalle con registro.listarDetalles(id).
 *   - verTicket()         : abre DialogoTicket con la venta seleccionada.
 *
 * RELACIONES
 *   - Vive en VentanaPrincipal.
 *   - Usa RegistroVenta, Venta, DetalleVenta, FormatoMoneda.
 *   - Puede abrir DialogoTicket.
 *
 * TODO (en este orden)  -- paso 7 del plan
 *   1. tablaVentas + recargar().
 *   2. tablaDetalle al seleccionar una fila (JSplitPane arriba/abajo).
 *   3. (Opcional) ver ticket y filtro por fecha.
 * =====================================================================
 */
public class PanelHistorialVentas {

}
