package cursopoo.persistencia.ganancias;

/*
 * =====================================================================
 * RegistroGanancia  (capa: PERSISTENCIA)
 * =====================================================================
 * RESPONSABILIDAD
 *   Consultar la tabla "ganancia". El INSERT de la ganancia lo hace
 *   ServicioVenta dentro de la transacción de la venta.
 *
 * REGLAS DE ARQUITECTURA
 *   - La presentación llama a esta clase; nunca escribe SQL ella misma.
 *   - Usa PreparedStatement y ConexionBD.getConexion().
 *
 * MÉTODOS
 *   - listar()                  : todas las ganancias (fecha, venta, monto).
 *   - listarPorFecha(ini, fin)  : filtro por rango de fechas.
 *   - totalPorFecha(ini, fin)   : SELECT SUM(ganancia) ... (un double).
 *   - totalDelDia(fecha)        : atajo para "ganancia de hoy" (opcional).
 *
 * RELACIONES
 *   - Usa Ganancia y ConexionBD.
 *   - La usa PanelGanancias.
 *
 * TODO (en este orden)  -- paso 7 del plan
 *   1. listar().
 *   2. totalPorFecha(ini, fin) con SUM.
 *   3. listarPorFecha(ini, fin).
 * =====================================================================
 */
public class RegistroGanancia {

}
