package cursopoo.presentacion.clientes;

/*
 * =====================================================================
 * PanelClientes  (capa: PRESENTACIÓN)
 * =====================================================================
 * RESPONSABILIDAD
 *   Tarjeta "Clientes" de VentanaPrincipal: JTable con los clientes y
 *   botones para agregar, editar y dar de baja.
 *
 * REGLA DE CAPA
 *   NUNCA escribe SQL: todo pasa por RegistroCliente.
 *
 * ATRIBUTOS
 *   - tabla, modelo (columnas: ID, Nombre, Dirección).
 *   - btnAgregar, btnEditar, btnEliminar.
 *   - registro : RegistroCliente.
 *
 * MÉTODOS
 *   - Constructor (arma la interfaz).
 *   - recargar() : se llama al mostrarse el panel.
 *   - agregar(), editar(), eliminar() (con confirmación).
 *   - No permitir editar/eliminar "Público general".
 *
 * RELACIONES
 *   - Vive en VentanaPrincipal; abre DialogoCliente.
 *   - Usa RegistroCliente y Cliente.
 *
 * TODO (en este orden)  -- paso 5 del plan
 *   1. Es casi igual a PanelProductos: reutiliza la misma estructura.
 *   2. recargar() con la tabla.
 *   3. Agregar / Editar con DialogoCliente.
 *   4. Eliminar (bloqueando "Público general").
 * =====================================================================
 */
public class PanelClientes {

}
