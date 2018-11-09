
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
          //estudiante.estudiante_sig = temp;
          temp.estudiante_sig = estudiante;
          estudiante.estudiante_anterior = temp;
          estudiante.estudiante_sig = estudiante_raiz;
          estudiante_raiz.estudiante_anterior = estudiante;
          tamaño++;
      }
  }
  public estudiante buscar (String carnet){
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
        System.out.println(temp.carnet+ ","+ temp.dpi+","+ temp.nombre+","+ temp.correo +","+ temp.credito +","+ temp.contraseña);
        temp = temp.estudiante_sig;
    }
  }
  public boolean buscar(String usuario, String contraseña){
      estudiante temp = estudiante_raiz;
      for( int i =0; i< tamaño; i++){
          if(temp.usuario.equals(usuario) && temp.contraseña.equals(contraseña)){
              return true;
          }
          else
              temp = temp.estudiante_sig;
      }
      return false;
  }
}
