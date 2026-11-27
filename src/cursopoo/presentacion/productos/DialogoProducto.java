package cursopoo.presentacion.productos;

/*
 * =====================================================================
 * DialogoProducto  (capa: PRESENTACIÓN)
 * =====================================================================
 * RESPONSABILIDAD
 *   JDialog modal con el formulario para crear o editar un Producto.
 *   Si recibe un Producto existente, está en modo "editar"; si no, en
 *   modo "nuevo".
 *
 * REGLA DE CAPA
 *   NUNCA escribe SQL: guarda con RegistroInventario.
 *
 * ATRIBUTOS
 *   - txtNombre, txtCantidad, txtPrecioC, txtPrecioV : JTextField.
 *   - btnGuardar, btnCancelar : JButton.
 *   - producto  : el Producto que se edita (null si es nuevo).
 *   - guardado  : boolean; true si el usuario guardó (lo consulta
 *                 PanelProductos para saber si recargar).
 *
 * MÉTODOS
 *   - Constructor(ventanaPadre, producto): modal, arma el formulario
 *     (GridLayout o GridBagLayout), llena campos si es edición.
 *   - guardar(): valida con Validador -> arma/actualiza el Producto ->
 *                registro.insertar(...) o registro.actualizar(...) ->
 *                guardado = true -> dispose().
 *   - isGuardado().
 *
 * VALIDACIONES
 *   - Nombre no vacío.
 *   - Cantidad entera y precios decimales válidos (NumberFormatException).
 *   - Cantidad y precios >= 0.
 *   - (Sugerencia) avisar si precio de venta < precio de compra.
 *
 * RELACIONES
 *   - Lo abre PanelProductos.
 *   - Usa Producto, RegistroInventario y Validador.
 *
 * TODO (en este orden)  -- paso 4 del plan
 *   1. Formulario visual (sin lógica) que abra y cierre.
 *   2. Modo nuevo: validar e insertar.
 *   3. Modo editar: llenar campos y actualizar.
 * =====================================================================
 */
public class DialogoProducto {

}
