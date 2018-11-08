
package secy;

/**
 *
 * @author lourd
 */
public class estudiante {
    int   credito, contraseña;
    String carnet,dpi,nombre, correo, direccion, usuario;
    estudiante estudiante_sig, estudiante_anterior;
    lista_semestre semestre;
    
    public estudiante( String carnet, String dpi, String nombre,String correo,String direccion,int credito, 
                         lista_semestre semestre){
        this.carnet = carnet;
        this.dpi = dpi;
        this.credito = credito;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
        this.usuario = carnet;
        estudiante_sig = null;
        estudiante_anterior = null;
        this.semestre = semestre;
    }
}
