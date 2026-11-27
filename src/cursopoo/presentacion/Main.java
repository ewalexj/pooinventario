package cursopoo.presentacion;

/*
 * =====================================================================
 * Main  (capa: PRESENTACIÓN)  -- punto de entrada del programa
 * =====================================================================
 * RESPONSABILIDAD
 *   Arrancar la aplicación en el orden correcto.
 *
 * MÉTODOS
 *   - main(String[] args) que haga, en este orden:
 *       1. ConexionBD.inicializar()  -> crea tablas y "Público general".
 *       2. Activar FlatLaf ANTES de crear cualquier ventana
 *          (por ejemplo FlatLightLaf.setup()). Si se crea una ventana
 *          antes, esa ventana se verá con el look por defecto.
 *       3. SwingUtilities.invokeLater(...) para crear y mostrar
 *          VentanaPrincipal en el hilo de eventos de Swing (EDT).
 *
 * RELACIONES
 *   - Llama a ConexionBD (persistencia) y crea VentanaPrincipal.
 *   - Requiere lib/flatlaf-*.jar en el classpath.
 *
 * TODO (en este orden)  -- paso 3 del plan
 *   1. Escribir main con un System.out.println para probar que corre.
 *   2. Llamar a ConexionBD.inicializar().
 *   3. Activar FlatLaf.
 *   4. Abrir VentanaPrincipal con SwingUtilities.invokeLater.
 * =====================================================================
 */
public class Main {

}
