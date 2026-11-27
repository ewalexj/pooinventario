package cursopoo.modelo.productos;

/*
 * =====================================================================
 * Producto  (capa: MODELO)
 * =====================================================================
 * RESPONSABILIDAD
 *   Representa un producto de la tienda tal como existe en la tabla
 *   "producto". Es un objeto de datos (POJO): guarda valores, no sabe
 *   nada de SQL ni de Swing.
 *
 * REGLA DE CAPA
 *   El modelo NO importa nada de java.sql ni de javax.swing.
 *
 * ATRIBUTOS (privados)
 *   - idProd     : identificador (PK). 0 mientras no se haya guardado.
 *   - nombre     : nombre del producto.
 *   - cantidad   : unidades en existencia (stock).
 *   - precioC    : precio de compra (lo que le cuesta a la tienda).
 *   - precioV    : precio de venta (lo que paga el cliente).
 *   - activo     : true si no ha sido dado de baja (baja lógica).
 *
 * MÉTODOS
 *   - Constructor vacío.
 *   - Constructor con todos los campos (útil al leer de la BD).
 *   - Constructor sin id (útil al crear uno nuevo antes de insertarlo).
 *   - Getters y setters de cada atributo.
 *   - getGananciaUnitaria() : precioV - precioC (opcional, ayuda).
 *   - toString()            : devuelve el nombre (así se ve bien en un
 *                             JComboBox o JList).
 *
 * RELACIONES
 *   - Inventario la contiene en una lista.
 *   - DetalleVenta guarda una referencia (o el id) del producto vendido.
 *   - RegistroInventario la lee y escribe en SQLite.
 *   - PanelProductos / DialogoProducto la muestran y editan.
 *
 * TODO (en este orden)
 *   1. Declarar los atributos privados.
 *   2. Escribir los constructores.
 *   3. Generar getters y setters.
 *   4. Sobrescribir toString().
 *   5. (Opcional) getGananciaUnitaria().
 *   6. Probarla en un main de prueba creando un par de objetos.
 * =====================================================================
 */
public class Producto {

}
