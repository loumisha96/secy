
package secy;

/**
 *
 * @author lourd
 */
public class estudiante {
    int   credito;
    String carnet,dpi,nombre, correo, direccion, usuario,  contraseña;
    estudiante estudiante_sig, estudiante_anterior;
    lista_semestre semestre;
    
    public estudiante( String carnet, String dpi, String nombre,String correo,String direccion,int credito, 
                         lista_semestre semestre){
        this.carnet = carnet;
        this.dpi = dpi;
        this.credito = credito;
        int ale = 0;
        for ( int i =0; i<10; i++){
            ale = (int)( Math.random()*150)+50; 
        }
        this.contraseña = carnet + ale;
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
        this.usuario = carnet;
        estudiante_sig = null;
        estudiante_anterior = null;
        this.semestre = semestre;
    }
    
}
