package cursopoo.modelo.clientes;

/*
 * =====================================================================
 * Cliente  (capa: MODELO)
 * =====================================================================
 * RESPONSABILIDAD
 *   Representa a un cliente de la tienda (tabla "cliente").
 *   Existe un cliente especial "Público general" que ConexionBD crea al
 *   iniciar; se usa en ventas de contado sin cliente registrado.
 *
 * REGLA DE CAPA
 *   El modelo NO importa nada de java.sql ni de javax.swing.
 *
 * ATRIBUTOS (privados)
 *   - idCte     : identificador (PK).
 *   - nombre    : nombre del cliente.
 *   - direccion : dirección.
 *   - activo    : true si no ha sido dado de baja (baja lógica).
 *
 * MÉTODOS
 *   - Constructores (vacío, completo, sin id).
 *   - Getters y setters.
 *   - esPublicoGeneral() : true si es el cliente genérico (sirve para la
 *                          regla "crédito solo con cliente registrado").
 *   - toString()         : devuelve el nombre (para JComboBox).
 *
 * RELACIONES
 *   - Una Venta pertenece a un Cliente (venta.id_cte -> cliente.id_cte).
 *   - RegistroCliente lo lee y escribe en SQLite.
 *   - PanelClientes / DialogoCliente lo muestran y editan.
 *   - PanelNuevaVenta lo elige en un JComboBox.
 *
 * TODO (en este orden)
 *   1. Atributos privados.
 *   2. Constructores.
 *   3. Getters y setters.
 *   4. toString().
 *   5. esPublicoGeneral() (decide cómo identificarlo: por id o nombre).
 * =====================================================================
 */
public class Cliente {

}
