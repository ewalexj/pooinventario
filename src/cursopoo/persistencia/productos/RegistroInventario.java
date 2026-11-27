package cursopoo.persistencia.productos;

/*
 * =====================================================================
 * RegistroInventario  (capa: PERSISTENCIA)
 * =====================================================================
 * RESPONSABILIDAD
 *   Guardar y leer objetos Producto en la tabla "producto".
 *   Traduce entre filas (ResultSet) y objetos (Producto).
 *
 * REGLAS DE ARQUITECTURA
 *   - La presentación llama a esta clase; nunca escribe SQL ella misma.
 *   - Obtiene la conexión con ConexionBD.getConexion().
 *
 * CRUD ESTÁNDAR (todos con PreparedStatement, nunca concatenando texto):
 *   - insertar(obj)    : INSERT; idealmente recupera el id generado.
 *   - listar()         : SELECT de todos los registros con activo = 1.
 *   - consultar(id)    : SELECT de uno; devuelve el objeto o null.
 *   - actualizar(obj)  : UPDATE por id.
 *   - eliminar(id)     : BAJA LÓGICA -> UPDATE ... SET activo = 0
 *                        (no se usa DELETE, porque las ventas antiguas
 *                        siguen haciendo referencia al registro).
 *
 * MÉTODOS EXTRA
 *   - buscarPorNombre(texto) : SELECT ... WHERE nombre LIKE ? (opcional).
 *   - mapear(ResultSet)      : private; convierte la fila actual en un
 *                              Producto (evita repetir código).
 *   - cargarInventario()     : devuelve un Inventario con listar().
 *
 * RELACIONES
 *   - Usa Producto, Inventario y ConexionBD.
 *   - La usan PanelProductos, DialogoProducto y PanelNuevaVenta.
 *   - OJO: restar stock al vender NO se hace aquí por separado; lo hace
 *     ServicioVenta dentro de su transacción.
 *
 * TODO (en este orden)
 *   1. insertar(Producto) y probarlo desde un main de consola.
 *   2. mapear(ResultSet) + listar(); imprimir la lista en consola.
 *   3. consultar(id).
 *   4. actualizar(Producto).
 *   5. eliminar(id) como baja lógica; verificar que listar() ya no lo
 *      muestre.
 *   6. (Opcional) buscarPorNombre y cargarInventario.
 * =====================================================================
 */
public class RegistroInventario {

}
