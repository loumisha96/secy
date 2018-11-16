
package secy;

/**
 *
 * @author lourd
 */
public class Curso {
    int  credito;
    String catedratico, lab, estado, nombre, seccion,  pre_requisito, post_requisito, numero;
    Curso siguinte_curso;
    public Curso(String numero, String nombre, String catedratico, int credito,String lab, String seccion, String pre_requisito, String post_requisito ) {
      this.numero = numero;
      this.nombre = nombre;
      this.catedratico = catedratico;
      this.credito = credito;
      this.lab = lab;
      this.seccion = seccion;
      this.post_requisito = post_requisito;
      this.pre_requisito = pre_requisito;
      //this.estado = "Reprobado";
      siguinte_curso = null;
    }

}
