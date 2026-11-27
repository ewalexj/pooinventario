package cursopoo.presentacion.productos;

/*
 * =====================================================================
 * PanelProductos  (capa: PRESENTACIÓN)
 * =====================================================================
 * RESPONSABILIDAD
 *   Tarjeta "Productos" de VentanaPrincipal. Muestra el catálogo en una
 *   JTable y permite agregar, editar y dar de baja productos.
 *
 * REGLA DE CAPA
 *   NUNCA escribe SQL: todo pasa por RegistroInventario.
 *
 * ATRIBUTOS
 *   - tabla        : JTable dentro de un JScrollPane.
 *   - modelo       : DefaultTableModel (columnas: ID, Nombre, Cantidad,
 *                    Precio compra, Precio venta). Hazlo no editable.
 *   - txtBuscar    : JTextField para filtrar por nombre (opcional).
 *   - btnAgregar, btnEditar, btnEliminar : JButton.
 *   - registro     : RegistroInventario.
 *
 * MÉTODOS
 *   - Constructor: arma la interfaz (BorderLayout: botones arriba o
 *     abajo, tabla al centro).
 *   - recargar()   : limpia el modelo (setRowCount(0)) y vuelve a llenar
 *                    con registro.listar(). Lo llama VentanaPrincipal al
 *                    mostrar este panel.
 *   - agregar()    : abre DialogoProducto vacío; si se guardó, recargar().
 *   - editar()     : toma la fila seleccionada, consulta el Producto y
 *                    abre DialogoProducto con sus datos.
 *   - eliminar()   : confirma con JOptionPane y hace la baja lógica.
 *   - productoSeleccionado(): devuelve el id de la fila elegida o avisa
 *                    si no hay selección.
 *
 * RELACIONES
 *   - Vive dentro de VentanaPrincipal.
 *   - Abre DialogoProducto.
 *   - Usa RegistroInventario, Producto y FormatoMoneda.
 *
 * TODO (en este orden)  -- paso 4 del plan
 *   1. Tabla con columnas y recargar() llenándola.
 *   2. Agregarlo a VentanaPrincipal y ver los productos de prueba.
 *   3. Botón Agregar + DialogoProducto.
 *   4. Botón Editar.
 *   5. Botón Eliminar (con confirmación).
 *   6. (Opcional) buscador.
 * =====================================================================
 */
public class PanelProductos {

}
