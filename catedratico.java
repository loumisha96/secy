
package secy;

/**
 *
 * @author lourd
 */
public class catedratico {
    String nombre, usuario, contraseña;
    catedratico siguiente;
    public catedratico(String nombre, String usuario, String contraseña) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contraseña = contraseña;
        siguiente = null;
    }
    
}
