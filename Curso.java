
package secy;

/**
 *
 * @author lourd
 */
public class Curso {
    int numero, credito,  pre_requisito, post_requisito;
    String catedratico, lab;
    Curso siguinte_curso;
    public Curso(int numero, int credito, int pre_requisito, int post_requisito, String catedratico, String lab) {
      this.numero = numero;
      this.catedratico = catedratico;
      this.credito = credito;
      this.lab = lab;
      this.post_requisito = post_requisito;
      this.pre_requisito = pre_requisito;
      siguinte_curso = null;
    }

}
