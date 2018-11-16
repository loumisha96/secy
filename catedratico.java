
package secy;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

/**
 *
 * @author lourd
 */
public class catedratico {
    String nombre, usuario, contraseña;
    catedratico siguiente;
    lista_semestre semestre;
    public catedratico(String nombre, lista_semestre semestre) {
     StringTokenizer st = new StringTokenizer(nombre); 
     char user = ' ';
    
    while(st.hasMoreTokens()) { 
     
       user = Character.valueOf(st.nextToken().charAt(0)) ; 
        System.out.println(user);
        
      }
       String u = Character.toString(user);
        int ale = 0;
        for ( int i =0; i<10; i++){
            ale = (int)( Math.random()*150)+50; 
        }
        this.nombre = nombre;
        this.usuario =  Integer.toString(user);
        this.contraseña = u+ale;
        siguiente = null;
        this.semestre = semestre;
    }
    
    
 
    
}
