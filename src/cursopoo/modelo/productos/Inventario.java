package cursopoo.modelo.productos;

/*
 * =====================================================================
 * Inventario  (capa: MODELO)
 * =====================================================================
 * RESPONSABILIDAD
 *   Agrupa la colección de productos de la tienda en memoria y ofrece
 *   operaciones de consulta sobre ella (buscar, filtrar, totales).
 *   No guarda nada en la BD por sí misma: eso es trabajo de
 *   RegistroInventario.
 *
 * REGLA DE CAPA
 *   El modelo NO importa nada de java.sql ni de javax.swing.
 *
 * ATRIBUTOS
 *   - productos : ArrayList<Producto> con los productos cargados.
 *
 * MÉTODOS
 *   - Constructor (inicializa la lista vacía).
 *   - setProductos(lista) / getProductos().
 *   - buscarPorId(id)          : devuelve el Producto o null.
 *   - buscarPorNombre(texto)   : lista de productos cuyo nombre contiene
 *                                el texto (para el buscador de la tabla).
 *   - getValorInventario()     : suma de cantidad * precioC (cuánto vale
 *                                lo que hay en bodega).
 *   - getProductosBajoStock(n) : productos con cantidad < n (opcional).
 *
 * RELACIONES
 *   - Contiene muchos Producto (composición/agregación).
 *   - RegistroInventario.listar() le da la lista inicial.
 *   - PanelProductos puede usarlo para filtrar sin volver a la BD.
 *
 * TODO (en este orden)
 *   1. Declarar la lista e inicializarla en el constructor.
 *   2. getProductos / setProductos.
 *   3. buscarPorId (recorrer con for-each).
 *   4. buscarPorNombre (ignorar mayúsculas/minúsculas).
 *   5. getValorInventario.
 *   6. (Opcional) getProductosBajoStock.
 * =====================================================================
 */
public class Inventario {

}
