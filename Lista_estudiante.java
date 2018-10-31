
package secy;

/**
 *
 * @author lourd
 */
public class Lista_estudiante {
  int tamaño;
  estudiante estudiante_raiz; 
  public Lista_estudiante(){
      tamaño = 0;
      estudiante_raiz = null;
  }
  public boolean vacia(){
      if(estudiante_raiz == null)
          return true;
      else
          return false;
  }
  public void insertar(estudiante estudiante){
      if(vacia()){
          estudiante_raiz = estudiante;
          estudiante.estudiante_sig = estudiante_raiz;
          estudiante.estudiante_anterior = estudiante_raiz;
          tamaño++;
      }
      else{
          estudiante temp = estudiante_raiz;
          while(temp.estudiante_sig != estudiante_raiz ){
              temp = temp.estudiante_sig;
          }
          estudiante.estudiante_sig = temp;
          temp.estudiante_sig = estudiante;
          estudiante.estudiante_anterior = temp;
          estudiante.estudiante_sig = estudiante_raiz;
          estudiante_raiz.estudiante_anterior = estudiante;
          tamaño++;
      }
  }
  public void mostrar(){
      estudiante temp = estudiante_raiz;
      for(int i=0; i< tamaño; i++){
          System.out.println(temp.carnet);
          temp = temp.estudiante_sig;
      }
  }
}
