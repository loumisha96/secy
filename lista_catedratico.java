
package secy;

/**
 *
 * @author lourd
 */
public class lista_catedratico {
   int tamaño;
   catedratico cate_raiz;
   
   public lista_catedratico(){
       tamaño = 0;
       cate_raiz = null;
   }
   public boolean vacia(){
       if(cate_raiz == null)
           return true;
       else
           return false;
   }
   public void insertar( catedratico catedratico){
       
       if(vacia()){
           cate_raiz = catedratico;
           tamaño++;
       }
       else{
           catedratico.siguiente = cate_raiz;
           cate_raiz = catedratico;
       }
   }
   public void mostrar(){
       catedratico aux = cate_raiz;
        for(int i =0; i<tamaño; i++){
            System.out.println(aux.nombre +","+ aux.usuario + ","+ aux.contraseña);
            aux = aux.siguiente;
        }
   }
    public boolean buscar(String usuario, String contraseña){
      catedratico temp = cate_raiz;
      for( int i =0; i< tamaño; i++){
          if(temp.usuario.equals(usuario) && temp.contraseña.equals(contraseña)){
              return true;
          }
          else
              temp = temp.siguiente;
      }
      return false;
  }
}
