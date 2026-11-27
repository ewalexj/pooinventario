package cursopoo.presentacion.ganancias;

/*
 * =====================================================================
 * PanelGanancias  (capa: PRESENTACIÓN)
 * =====================================================================
 * RESPONSABILIDAD
 *   Tarjeta "Ganancias": muestra la ganancia por venta y el total en un
 *   rango de fechas.
 *
 * REGLA DE CAPA
 *   NUNCA escribe SQL: usa RegistroGanancia.
 *
 * ATRIBUTOS
 *   - txtDesde, txtHasta : fechas "yyyy-MM-dd" (o JSpinner con fecha).
 *   - btnFiltrar.
 *   - tabla + modelo (columnas: ID venta, Fecha, Ganancia).
 *   - lblTotal : ganancia total del rango.
 *   - registro : RegistroGanancia.
 *
 * MÉTODOS
 *   - Constructor.
 *   - recargar() : muestra todas (o las del día) al entrar al panel.
 *   - filtrar()  : valida fechas y llena tabla + total.
 *
 * RELACIONES
 *   - Vive en VentanaPrincipal.
 *   - Usa RegistroGanancia, Ganancia y FormatoMoneda.
 *
 * TODO (en este orden)  -- paso 7 del plan
 *   1. Tabla + recargar() con todas las ganancias.
 *   2. lblTotal.
 *   3. Filtro por fechas.
 * =====================================================================
 */
public class PanelGanancias {

}
