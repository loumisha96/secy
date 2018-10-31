
package secy;

/**
 *
 * @author lourd
 */
public class Lista_curso {
   int tamaño;
   Curso curso_raiz;
    public Lista_curso(){
      tamaño = 0;
      curso_raiz = null;
      
   } 
    public boolean vacia(){
        if (curso_raiz == null)
            return true;
        else
            return false;
    }
   public void insetar(Curso curso){
       if (vacia()){
          curso_raiz = curso;
          curso_raiz.siguinte_curso = curso_raiz;
          tamaño++;
       }
       else{
           Curso temp = curso_raiz;
           while(temp.siguinte_curso != curso_raiz){
               temp = temp.siguinte_curso;
           }
           curso.siguinte_curso = curso_raiz;
           temp.siguinte_curso = curso;
           tamaño ++;
       }
   }
   public Curso buscar(int numero){
     Curso temp = curso_raiz;
     if( temp.numero == numero ){
              return temp;
          }
          else
              temp = temp.siguinte_curso;
     while(temp != curso_raiz){
          if( temp.numero == numero ){
              return temp;
          }
          else
              temp = temp.siguinte_curso;
     }
     return null;
   }
   public void modificar(Curso curso){
       Curso encontrado = buscar(curso.numero);
       if (encontrado != null){
           encontrado.credito = curso.credito;
           encontrado.numero = curso.numero;
           encontrado.lab = curso.lab;
           encontrado.post_requisito = curso.post_requisito;
           encontrado.pre_requisito = curso.pre_requisito;
           encontrado.catedratico = curso.catedratico;
       }
   }
   public void eliminar(int numero){
       if(!vacia()){
           if(curso_raiz.siguinte_curso == curso_raiz){
               curso_raiz = null;
               tamaño--;
           }
           else{
               
               Curso temp = curso_raiz;
               Curso anterior = temp;
               while(temp.siguinte_curso != curso_raiz  ) {
                   if(temp.numero == numero){
                        temp.siguinte_curso = temp.siguinte_curso.siguinte_curso;
                        tamaño--; 
                   }
                   else{
                       anterior = temp;
                       temp = temp.siguinte_curso; 
                    }
               }
               if( temp.numero == numero){
                   anterior.siguinte_curso = curso_raiz;
                   tamaño--;
               }
           }
           
       }
   }
   
   public void mostrar(){
      Curso temp = curso_raiz;
      for (int i =0; i<tamaño; i++){
          System.out.println(temp.catedratico + ","+ temp.lab + ","+ temp.numero);
          temp = temp.siguinte_curso;
      }
   } 
}
