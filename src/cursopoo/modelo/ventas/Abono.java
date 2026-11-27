package cursopoo.modelo.ventas;

/*
 * =====================================================================
 * Abono  (capa: MODELO)
 * =====================================================================
 * RESPONSABILIDAD
 *   Representa un pago parcial a una venta a crédito (tabla "abono").
 *
 * REGLA DE CAPA
 *   El modelo NO importa nada de java.sql ni de javax.swing.
 *
 * ATRIBUTOS (privados)
 *   - idAbono : PK.
 *   - idVenta : FK a la venta que se está pagando.
 *   - fecha   : cuándo se hizo el abono.
 *   - monto   : cantidad abonada (debe ser > 0 y <= saldo de la venta).
 *
 * MÉTODOS
 *   - Constructores, getters y setters.
 *   - toString() opcional para mostrar en listas.
 *
 * RELACIONES
 *   - Pertenece a una Venta (de tipo CREDITO).
 *   - RegistroAbono lo inserta y lista; al insertar también se debe
 *     actualizar pagado/saldo de la venta (idealmente en una transacción).
 *   - DialogoAbono lo captura; PanelCreditos muestra el historial.
 *
 * TODO (en este orden)
 *   1. Atributos.
 *   2. Constructores.
 *   3. Getters y setters.
 * =====================================================================
 */
public class Abono {

}
