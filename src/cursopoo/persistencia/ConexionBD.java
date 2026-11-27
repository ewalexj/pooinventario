package cursopoo.persistencia;

/*
 * =====================================================================
 * ConexionBD  (capa: PERSISTENCIA)
 * =====================================================================
 * RESPONSABILIDAD
 *   Único lugar que sabe CÓMO conectarse a SQLite. Entrega objetos
 *   java.sql.Connection al resto de la capa de persistencia y prepara la
 *   base de datos la primera vez (crea las tablas y datos iniciales).
 *
 * REGLAS DE ARQUITECTURA
 *   - Capas: presentacion -> servicio -> persistencia -> SQLite.
 *   - Solo la capa de persistencia (y ServicioVenta para la transacción)
 *     usa java.sql. La presentación NUNCA escribe SQL.
 *   - Driver: sqlite-jdbc de xerial (lib/sqlite-jdbc-*.jar).
 *
 * ATRIBUTOS
 *   - URL : constante "jdbc:sqlite:inventario.db" (el archivo se crea solo
 *           en la carpeta desde donde se ejecuta el programa).
 *
 * MÉTODOS
 *   - getConexion()       : static; devuelve DriverManager.getConnection(URL).
 *                           Recomendado: activar llaves foráneas con
 *                           "PRAGMA foreign_keys = ON" en cada conexión.
 *   - inicializar()       : static; se llama UNA vez desde Main. Ejecuta
 *                           crearTablas() y crearPublicoGeneral().
 *   - crearTablas()       : CREATE TABLE IF NOT EXISTS para producto,
 *                           cliente, venta, detalle_venta, ganancia, abono
 *                           (ver TABLAS_TEMP.md).
 *   - crearPublicoGeneral(): si no existe un cliente "Público general",
 *                           lo inserta.
 *
 * RELACIONES
 *   - Todos los Registro* y ServicioVenta piden su conexión aquí.
 *   - Main llama a inicializar() antes de abrir la ventana.
 *
 * BUENAS PRÁCTICAS
 *   - Usa try-with-resources para cerrar Connection/Statement/ResultSet.
 *   - Captura SQLException y muestra un mensaje claro (o relánzala).
 *
 * TODO (en este orden)
 *   1. Constante URL.
 *   2. getConexion() y probarlo con un main temporal (que no truene).
 *   3. crearTablas() con un Statement y un String por tabla.
 *   4. Abrir inventario.db con un visor (DB Browser for SQLite) y
 *      verificar que existan las tablas.
 *   5. crearPublicoGeneral() (SELECT para ver si existe; si no, INSERT).
 *   6. inicializar() que llame a los dos anteriores.
 * =====================================================================
 */
public class ConexionBD {

}
