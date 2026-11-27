package cursopoo.presentacion.util;

/*
 * =====================================================================
 * FormatoMoneda  (capa: PRESENTACIÓN, utilería)
 * =====================================================================
 * RESPONSABILIDAD
 *   Convertir números a texto de dinero de forma uniforme en toda la
 *   aplicación (tablas, totales, ticket). Ejemplo de salida: "$1,234.50".
 *
 * ATRIBUTOS
 *   - Un formateador static (NumberFormat o DecimalFormat) configurado
 *     una sola vez (por ejemplo con Locale de México o patrón "$#,##0.00").
 *
 * MÉTODOS (static)
 *   - formatear(double)  : double -> "$1,234.50".
 *   - (Opcional) formatearFecha(...) si quieres centralizar también el
 *     formato de fechas.
 *
 * RELACIONES
 *   - La usan todos los paneles y diálogos que muestran dinero,
 *     especialmente DialogoTicket y PanelGanancias.
 *
 * TODO (en este orden)
 *   1. Crear el formateador static.
 *   2. formatear(double) y probarlo en consola con varios valores.
 * =====================================================================
 */
public class FormatoMoneda {

}
