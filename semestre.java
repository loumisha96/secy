
package secy;

/**
 *
 * @author lourd
 */
public class semestre {
    int año;
    semestre siguiente;
    Lista_curso curso;
    public semestre( int año){
        this.año = año;
        siguiente = null;
        curso = null;
    }
    
}
