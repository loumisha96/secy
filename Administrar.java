/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;

/**
 *
 * @author lourd
 */
public class Administrar extends javax.swing.JFrame {

    /**
     * Creates new form Administrar
     */
    public Administrar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tipo_cb = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        cargarCursos_btn = new javax.swing.JButton();
        cargarEstudiantes_btn = new javax.swing.JButton();
        salida_btn = new javax.swing.JButton();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ADMINISTRAR");

        tipo_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "Curso" }));

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar");

        jButton3.setText("Visualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("Eliminar");

        jButton6.setText("REPORTES");

        cargarCursos_btn.setText("Cargar Cursos");
        cargarCursos_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarCursos_btnActionPerformed(evt);
            }
        });

        cargarEstudiantes_btn.setText("Cargar Estudiantes");
        cargarEstudiantes_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarEstudiantes_btnActionPerformed(evt);
            }
        });

        salida_btn.setText("Salir");
        salida_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salida_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tipo_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(salida_btn)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cargarCursos_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cargarEstudiantes_btn)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(tipo_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(cargarCursos_btn)
                    .addComponent(cargarEstudiantes_btn))
                .addGap(33, 33, 33)
                .addComponent(salida_btn)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(tipo_cb.getSelectedItem().toString().equals("Estudiante")){
             
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    String texto;
    lista_semestre listaSemestre = new lista_semestre();
    Lista_curso listaCurso = new Lista_curso();
    private void cargarCursos_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarCursos_btnActionPerformed
      JFileChooser chooser = new JFileChooser();
      chooser.showOpenDialog(this);
      File abrir = chooser.getSelectedFile();
      if(abrir != null){
           String texto = " ";
        try{
            BufferedReader bf = new BufferedReader ( new FileReader(abrir));
            String temp = " ";
            String bfRead;
            String[] curso= new String[8];
            
            lista_catedratico listaCate = new lista_catedratico();
            
            
            int curso0 ;
            int curso3;
            while((bfRead = bf.readLine())!= null){
                temp =bfRead;
                curso = temp.split(Pattern.quote(";"));
                System.out.println("lala");
             if(curso[0] ==null){
                curso0=0; 
                
             }
             else
               curso0 = Integer.parseInt(curso[0]);

             if(curso[3] ==null){
                curso3=0; 
             }
             else
               curso3 = Integer.parseInt(curso[3]);
             Curso curso_nodo = new Curso(curso0, curso[1], curso[2], curso3, curso[4], curso[5], curso[6], curso[7]);
             
             listaCurso.insetar(curso_nodo);
             listaCurso.mostrar();
             listaSemestre.insertar(2018, listaCurso);
             catedratico cate = new catedratico(curso[2], listaSemestre);
             listaCate.insertar(cate);
             listaCate.mostrar();
             
           }
            
            texto = temp;
        }catch(Exception e){
            System.out.println("No se encontró archivo");
            
        }
          //System.out.println(texto);

      }
         asignacion.cursos = listaCurso; 
        asignacion asign = new asignacion();
        asign.show();
        this.setVisible(false);
     
    }//GEN-LAST:event_cargarCursos_btnActionPerformed
         Lista_estudiante listaEstudiante = new Lista_estudiante();
            
    private void cargarEstudiantes_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarEstudiantes_btnActionPerformed
        // TODO add your handling code here:
      JFileChooser chooser = new JFileChooser();
      chooser.showOpenDialog(this);
      File abrir = chooser.getSelectedFile();
      if(abrir != null){
           String texto = " ";
        try{
            BufferedReader bf = new BufferedReader ( new FileReader(abrir));
            String temp = " ";
            String bfRead;
            String[] estudiante= new String[6];
            
            int e5;
            while((bfRead = bf.readLine())!= null){
                temp =bfRead;
                estudiante = temp.split(Pattern.quote(";"));
                if(estudiante[5] ==null){
                 e5=0; 
             }
             else
             e5 = Integer.parseInt(estudiante[5]);
             estudiante estudiante_nodo = new estudiante(estudiante[0], estudiante[1], estudiante[2], estudiante[3], estudiante[4], e5, listaSemestre);
             
             listaEstudiante.insertar(estudiante_nodo);
             listaEstudiante.mostrar();
           }
            
            texto = temp;
        }catch(Exception e){
            System.out.println("No se encontró archivo");
            
        }
          //System.out.println(texto);

      }
       asignacion.semestres= listaSemestre; 
        asignacion asign = new asignacion();
        asign.show();
     
    }//GEN-LAST:event_cargarEstudiantes_btnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void salida_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salida_btnActionPerformed
        Log_in.e = listaEstudiante;
        pantalla_prinicipal pant = new pantalla_prinicipal();
        pant.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_salida_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Administrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cargarCursos_btn;
    private javax.swing.JButton cargarEstudiantes_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton salida_btn;
    private javax.swing.JComboBox<String> tipo_cb;
    // End of variables declaration//GEN-END:variables
}
