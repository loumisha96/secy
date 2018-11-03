
package secy;

/**
 *
 * @author lourd
 */
public class estudiante {
    int carnet, dpi, credito, contraseña;
    String nombre, correo, direccion, usuario;
    estudiante semestre, estudiante_sig, estudiante_anterior;
    
    public estudiante( int carnet, int dpi, int credito, int contraseña, String nombre, String correo, String direccion, String usuario){
        this.carnet = carnet;
        this.dpi = dpi;
        this.credito = credito;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
        this.usuario = usuario;
        estudiante_sig = null;
        estudiante_anterior = null;
    }
}
