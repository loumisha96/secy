
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
        lista_semestre lista = new lista_semestre();
        estudiante es = new estudiante("2016", "3009", "nombre", "correo", "direccion", 0, lista);
        estudiante es1 = new estudiante("2017", "3008", "nombr1e", "correo1", "direccion", 0, lista);
        estudiante es2 = new estudiante("2018", "3008", "nombr1e", "correo1", "direccion", 0, lista);
        Lista_estudiante listaE = new Lista_estudiante();
        listaE.insertar(es);
        listaE.insertar(es1);
        listaE.insertar(es2);
        listaE.mostrar();
        listaE.eliminar("2016");
        listaE.mostrar();
        
        
    }

    
}
