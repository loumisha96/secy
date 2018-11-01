
package secy;

/**
 *
 * @author lourd
 */
public class Secy {

    /**d
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista_estudiante lista = new Lista_estudiante();
        estudiante estudiante = new estudiante(1, 1, 1, 1, "nombre", "correo", "direccion"," usuario") ;
        estudiante estudiante1 = new estudiante(2, 2, 2, 2, "nombre2", "correo2", "direccion2"," usuario2") ;
        
        
        
        lista.insertar(estudiante1);
        lista.insertar(estudiante1);
        lista.insertar(estudiante);
      
        lista.mostrar();
        estudiante1.carnet = 3;     
        lista.modificar(estudiante);
        lista.mostrar();
        
    }

    
}
