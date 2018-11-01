
package secy;

/**
 *
 * @author lourd
 */
public class Lista_estudiante {
  int tamaño;
  estudiante estudiante_raiz;
  estudiante estudiante_fin;
  public Lista_estudiante(){
      tamaño = 0;
      estudiante_raiz = null;
      estudiante_fin = null;
  }
  public boolean vacia(){
      if(estudiante_raiz == null)
          return true;
      else
          return false;
  }
  public void insertar(estudiante estudiante){
      estudiante nuevo = estudiante;
      if(vacia()){
          estudiante_raiz = nuevo;
          estudiante_fin = nuevo;
          estudiante_raiz.estudiante_sig =  estudiante_fin;
          estudiante_fin.estudiante_sig = estudiante_raiz;
          estudiante_raiz.estudiante_anterior = estudiante_fin;
          estudiante_fin.estudiante_anterior = estudiante_raiz;
          estudiante_fin = estudiante_raiz;
          tamaño++;
      }
      else{
          estudiante temp = estudiante_fin;
          temp.estudiante_sig = nuevo;
          nuevo.estudiante_anterior = temp;
          estudiante_fin = nuevo;
          tamaño++;
      }
     
        /* if(estudiante_raiz ==null){
           
                   estudiante_raiz=nuevo;
                   tamaño++;  
         }
         else{
                   estudiante aux= estudiante_raiz;
                   while(aux.estudiante_sig!=estudiante_raiz)
                            aux=aux.estudiante_sig;
                   aux.estudiante_sig = nuevo;
                   nuevo.estudiante_anterior = aux;
                   nuevo.estudiante_sig = estudiante_raiz;
                   estudiante_raiz.estudiante_anterior = nuevo;
                 tamaño++;
         }*/
  }
  public estudiante buscar (int carnet){
    estudiante temp = estudiante_raiz;
    
     if( temp.carnet == carnet){
              return temp;
          }
          else
              temp = temp.estudiante_sig;
     while(temp != estudiante_raiz){
          if( temp.carnet == carnet ){
              return temp;
          }
          else
              temp = temp.estudiante_sig;
     }
     return null;
  }
  public void modificar(estudiante estudiante){
      if(vacia())
          System.out.println("LISTA VACIA");
      else{
          estudiante encontrado = estudiante;
          if(encontrado != null){
              encontrado.carnet = estudiante.carnet;
              encontrado.dpi = estudiante.dpi;
              encontrado.nombre = estudiante.nombre;
              encontrado.correo = estudiante.correo;
              encontrado.direccion = estudiante.direccion;
              encontrado.credito = estudiante.credito;
             // encontrado.contraseña = estudiante.contraseña;
          }
      }
      
  }
  public void eliminar(int carnet){
      if(!vacia()){
          
      }
  }
  public void mostrar(){
          estudiante temp = estudiante_raiz;
          for ( int i=0; i<tamaño; i++){
              System.out.println(temp.carnet+ ","+ temp.correo+","+ temp.dpi+","+ temp.nombre);
          }
            temp = temp.estudiante_sig;
      
      
  }
}
