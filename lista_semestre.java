
package secy;

/**
 *
 * @author lourd
 */
public class lista_semestre {
  int tamaño;
  semestre raiz;
  
  public lista_semestre(){
      tamaño = 0;
      raiz = null;
  }
  public boolean vacia(){
      if( raiz == null)
          return true;
      else
          return false;
  }
  public void insertar(int año, Lista_curso curso){
      semestre nuevo = new semestre(año, curso);
      if( vacia()){
         raiz = nuevo;
         tamaño++;
      }
      else{
        semestre temp = raiz;
        while(temp.siguiente != null){
         temp = temp.siguiente;
         tamaño++;
        }
        nuevo.año = temp.año +1;
        temp.siguiente = nuevo;
        nuevo.anterior = temp;
        nuevo.siguiente = null;
        tamaño++;
      }
  }
  
}
