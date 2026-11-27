package cursopoo.presentacion;

/*
 * =====================================================================
 * VentanaPrincipal  (capa: PRESENTACIÓN)
 * =====================================================================
 * RESPONSABILIDAD
 *   JFrame principal. A la izquierda un menú lateral con botones; a la
 *   derecha un panel con CardLayout que muestra la sección elegida.
 *
 * REGLAS DE ARQUITECTURA
 *   - La presentación NUNCA escribe SQL: usa Registro* y ServicioVenta.
 *   - Cada panel recarga su tabla al mostrarse (ver método mostrar).
 *
 * ATRIBUTOS
 *   - panelMenu      : JPanel lateral con un JButton por sección:
 *                      Productos, Clientes, Nueva venta, Ventas,
 *                      Ganancias, Créditos.
 *   - panelContenido : JPanel con CardLayout.
 *   - cardLayout     : referencia al CardLayout para cambiar de tarjeta.
 *   - Una referencia a cada panel: PanelProductos, PanelClientes,
 *     PanelNuevaVenta, PanelHistorialVentas, PanelGanancias,
 *     PanelCreditos.
 *   - Constantes String con el nombre de cada tarjeta.
 *
 * MÉTODOS
 *   - Constructor: título, tamaño, setDefaultCloseOperation,
 *     setLocationRelativeTo(null), arma menú y contenido.
 *   - crearMenu()     : crea los botones y sus ActionListener.
 *   - crearContenido(): agrega cada panel al CardLayout con su nombre.
 *   - mostrar(nombre) : cardLayout.show(...) y luego pide al panel
 *                       correspondiente que recargue sus datos (por
 *                       ejemplo un método recargar() en cada panel).
 *
 * RELACIONES
 *   - La crea Main.
 *   - Contiene todos los Panel* de los subpaquetes.
 *
 * TODO (en este orden)
 *   1. (Paso 3) JFrame vacío que se abra centrado.
 *   2. (Paso 3) Menú lateral con los 6 botones (BorderLayout.WEST).
 *   3. (Paso 3) CardLayout con JLabels de prueba en cada tarjeta.
 *   4. (Paso 4 en adelante) Ir reemplazando cada JLabel por su panel
 *      real conforme lo vayas terminando.
 *   5. Llamar a recargar() del panel al mostrarlo.
 * =====================================================================
 */
public class VentanaPrincipal {

}
