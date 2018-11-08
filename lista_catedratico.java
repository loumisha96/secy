
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
            System.out.println(aux.nombre);
            aux = aux.siguiente;
        }
   }
}
