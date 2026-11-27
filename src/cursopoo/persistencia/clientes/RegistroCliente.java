package cursopoo.persistencia.clientes;

/*
 * =====================================================================
 * RegistroCliente  (capa: PERSISTENCIA)
 * =====================================================================
 * RESPONSABILIDAD
 *   Guardar y leer objetos Cliente en la tabla "cliente".
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
 *   - mapear(ResultSet)     : private; fila -> Cliente.
 *   - getPublicoGeneral()   : devuelve el cliente "Público general"
 *                             (lo usa PanelNuevaVenta como opción por
 *                             defecto).
 *   - Evitar que "Público general" pueda eliminarse.
 *
 * RELACIONES
 *   - Usa Cliente y ConexionBD.
 *   - La usan PanelClientes, DialogoCliente y PanelNuevaVenta.
 *
 * TODO (en este orden)
 *   1. Copiar la idea de RegistroInventario (misma estructura).
 *   2. insertar, mapear, listar.
 *   3. consultar, actualizar, eliminar (baja lógica).
 *   4. getPublicoGeneral y protección contra borrarlo.
 * =====================================================================
 */
public class RegistroCliente {

}
