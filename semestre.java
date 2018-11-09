
package secy;

/**
 *
 * @author lourd
 */
public class semestre {
    int año;
    semestre siguiente;
    semestre anterior;
    Lista_curso curso;
    public semestre( int año, Lista_curso curso){
        this.año =2018 ; 
        this.curso = curso;
        siguiente = null;
        anterior = null;
        curso = null;
    }
    
}
