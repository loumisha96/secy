
package secy;

/**
 *
 * @author lourd
 */
public class Curso {
    int numero, credito,  pre_requisito, post_requisito;
    String catedratico, lab, estado, nombre, seccion;
    Curso siguinte_curso;
    public Curso(int numero, String nombre, String catedratico, int credito,String lab, String seccion, int pre_requisito, int post_requisito  ) {
      this.numero = numero;
      this.catedratico = catedratico;
      this.credito = credito;
      this.lab = lab;
      this.post_requisito = post_requisito;
      this.pre_requisito = pre_requisito;
      //this.estado = "Reprobado";
      siguinte_curso = null;
    }

}
