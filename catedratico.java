
package secy;

/**
 *
 * @author lourd
 */
public class catedratico {
    String nombre, usuario, contraseña;
    catedratico siguiente;
    lista_semestre semestre;
    public catedratico(String nombre, lista_semestre semestre) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contraseña = contraseña;
        siguiente = null;
        this.semestre = semestre;
    }
    
}
