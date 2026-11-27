package cursopoo.modelo.ganancias;

/*
 * =====================================================================
 * Ganancia  (capa: MODELO)
 * =====================================================================
 * RESPONSABILIDAD
 *   Registro de la ganancia obtenida en una venta (tabla "ganancia").
 *   Se genera automáticamente al registrar la venta.
 *
 * REGLA DE CAPA
 *   El modelo NO importa nada de java.sql ni de javax.swing.
 *
 * ATRIBUTOS (privados)
 *   - idGanancia : PK.
 *   - idVenta    : FK a venta.
 *   - fecha      : fecha de la venta (para filtrar por día/mes).
 *   - ganancia   : suma de (precioV - precioC) * cantidad de los detalles.
 *
 * MÉTODOS
 *   - Constructores, getters y setters.
 *
 * RELACIONES
 *   - Una por cada Venta.
 *   - ServicioVenta la inserta dentro de la transacción de la venta
 *     usando venta.getGananciaTotal().
 *   - RegistroGanancia la consulta; PanelGanancias la muestra.
 *
 * TODO (en este orden)
 *   1. Atributos.
 *   2. Constructores.
 *   3. Getters y setters.
 * =====================================================================
 */
public class Ganancia {

}
