
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
        lista_semestre semestre = new lista_semestre();
        Curso curso = new Curso(5, 5, 77, 88, "carlos", "Si");
        Lista_curso listacurso = new Lista_curso();
        estudiante estudiante = new estudiante(1, 1, 1, 1, "nombre", "correo", "direccion"," usuario", semestre) ;
        estudiante estudiante1 = new estudiante(2, 2, 2, 2, "nombre2", "correo2", "direccion2"," usuario2", semestre) ;
        
        
        
        lista.insertar(estudiante1);
        //lista.insertar(estudiante1);
        lista.insertar(estudiante);
      
        lista.mostrar();
        estudiante1.carnet = 3;     
        lista.modificar(estudiante);
        lista.mostrar();
        
    }

    
}
