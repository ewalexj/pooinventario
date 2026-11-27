package cursopoo.persistencia.ventas;

/*
 * =====================================================================
 * RegistroVenta  (capa: PERSISTENCIA)
 * =====================================================================
 * RESPONSABILIDAD
 *   CONSULTAR ventas y sus detalles (tablas "venta" y "detalle_venta").
 *   Registrar una venta NUEVA no se hace aquí: lo hace ServicioVenta,
 *   porque requiere una transacción que toca varias tablas.
 *
 * REGLAS DE ARQUITECTURA
 *   - La presentación llama a esta clase; nunca escribe SQL ella misma.
 *   - Usa PreparedStatement y ConexionBD.getConexion().
 *
 * MÉTODOS
 *   - listar()                 : todas las ventas (más recientes primero).
 *                                Útil hacer JOIN con cliente para traer el
 *                                nombre.
 *   - consultar(idVenta)       : una venta CON su lista de detalles.
 *   - listarDetalles(idVenta)  : SELECT de detalle_venta JOIN producto
 *                                (para mostrar el nombre del producto).
 *   - listarPorFecha(ini, fin) : filtro por rango (opcional).
 *   - listarCreditosPendientes(): ventas con tipo_pago = 'CREDITO' y
 *                                saldo > 0 (las usa PanelCreditos).
 *   - actualizarPago(idVenta, pagado, saldo) : lo usa RegistroAbono.
 *   - Variantes que reciban un Connection como parámetro (por ejemplo
 *     insertar(con, venta)) son opcionales, por si quieres que
 *     ServicioVenta las reutilice dentro de su transacción.
 *
 * RELACIONES
 *   - Usa Venta, DetalleVenta, Cliente, Producto y ConexionBD.
 *   - La usan PanelHistorialVentas, PanelCreditos y DialogoTicket
 *     (para reimprimir un ticket).
 *
 * TODO (en este orden)  -- se hace en el paso 7 del plan
 *   1. listar() mostrando id, fecha, cliente, total, tipo de pago.
 *   2. listarDetalles(idVenta).
 *   3. consultar(idVenta) usando listarDetalles.
 *   4. listarCreditosPendientes() (paso 8).
 *   5. actualizarPago(...) (paso 8).
 * =====================================================================
 */
public class RegistroVenta {

}
