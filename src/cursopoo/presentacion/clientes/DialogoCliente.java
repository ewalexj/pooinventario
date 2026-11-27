package cursopoo.presentacion.clientes;

/*
 * =====================================================================
 * DialogoCliente  (capa: PRESENTACIÓN)
 * =====================================================================
 * RESPONSABILIDAD
 *   JDialog modal para crear o editar un Cliente.
 *
 * REGLA DE CAPA
 *   NUNCA escribe SQL: guarda con RegistroCliente.
 *
 * ATRIBUTOS
 *   - txtNombre, txtDireccion : JTextField.
 *   - btnGuardar, btnCancelar.
 *   - cliente  : el Cliente que se edita (null si es nuevo).
 *   - guardado : boolean.
 *
 * MÉTODOS
 *   - Constructor(ventanaPadre, cliente).
 *   - guardar(): valida -> insertar o actualizar -> dispose().
 *   - isGuardado().
 *
 * VALIDACIONES
 *   - Nombre no vacío (dirección puede ser opcional; tú decides).
 *
 * RELACIONES
 *   - Lo abre PanelClientes.
 *   - Usa Cliente, RegistroCliente y Validador.
 *
 * TODO (en este orden)  -- paso 5 del plan
 *   1. Copiar la estructura de DialogoProducto con menos campos.
 *   2. Modo nuevo.
 *   3. Modo editar.
 * =====================================================================
 */
public class DialogoCliente {

}
