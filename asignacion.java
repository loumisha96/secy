/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secy;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lourd
 */
public class asignacion extends javax.swing.JFrame {

    /**
     * Creates new form asignacion
     */
    static Lista_curso cursos;
    static lista_semestre semestres;
    public asignacion() {
        initComponents();
        Curso curso;
        if(cursos != null){
          for(int i=0; i<cursos.tamaño; i++){
           curso = cursos.obtenerCurso(i);
           asignaCurso_cb.addItem(curso.nombre);
        }  
        }
        semestre semestre;
        if ( semestres != null){
            for(int i= 0; i<semestres.tamaño; i++){
                semestre = semestres.obtenerSemestre(i);
                String semestres = Integer.toString(semestre.año);
                asignarSemes_cb.addItem(semestres);
            }
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        asignarSemes_cb = new javax.swing.JComboBox<>();
        asignaCurso_cb = new javax.swing.JComboBox<>();
        asignar_btn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaAsigna = new javax.swing.JTable();
        agregar_btn = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ASIGNACION");

        jLabel2.setText("LOGO");

        jButton1.setText("Log Out");

        jButton2.setText("Regresar");

        asignarSemes_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primer Semestre 2018", "Segundo Semestre 2018", "Primer Semestre 2019", "Segundo Semestre 2019", "Primer Semestre 2020", "Segundo Semestre 2020" }));
        asignarSemes_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignarSemes_cbActionPerformed(evt);
            }
        });

        asignar_btn.setText("Asignar");
        asignar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignar_btnActionPerformed(evt);
            }
        });

        tablaAsigna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaAsigna);

        agregar_btn.setText("Agregar");
        agregar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(85, 85, 85))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(asignarSemes_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregar_btn))
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(asignar_btn)
                    .addComponent(asignaCurso_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(203, 203, 203))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel1)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asignarSemes_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asignaCurso_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asignar_btn)
                    .addComponent(agregar_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void asignarSemes_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarSemes_cbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asignarSemes_cbActionPerformed
    
    private void asignar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignar_btnActionPerformed
     
     Log_in log = new Log_in();
     Administrar admin = new Administrar();
     estudiante estudiante = log.estLog;
     Lista_curso cursos = new Lista_curso();
     int semestre = asignarSemes_cb.getSelectedIndex();
     //semestre semestrenuevo = new semestre(semestre, cursos);
     
     for(int i=0; i<cursos.tamaño; i++){
        Curso curso = new Curso(0, matrizTemp[i][1], matrizTemp[i][2], 0, matrizTemp[i][4], matrizTemp[i][5], matrizTemp[i][6], matrizTemp[i][7]) ; 
        cursos.insetar(curso);
      }
     admin.listaSemestre.insertar(semestre, cursos);
     estudiante = new estudiante(estudiante.carnet, estudiante.dpi, estudiante.nombre, estudiante.correo, estudiante.direccion, 0, semestres);   
    }//GEN-LAST:event_asignar_btnActionPerformed
    String [][] matrizTemp =new String[3][9]  ;
    int fila = 0;
    int num =0;
    
    private void agregar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_btnActionPerformed
        
        int k =asignaCurso_cb.getSelectedIndex();
        Curso asign = cursos.obtenerCurso(k);
         
         
         String numero = Integer.toString(num);
         String cre = Integer.toString(asign.credito);
        
                matrizTemp[fila][0] = numero;
                matrizTemp[fila][1]= asign.nombre;
                matrizTemp[fila][2]= asign.catedratico;
                matrizTemp[fila][3]= cre;
                matrizTemp[fila][4]= asign.lab;
                matrizTemp[fila][5]= asign.seccion;
                matrizTemp[fila][6]= asign.pre_requisito;
                matrizTemp[fila][7]= asign.post_requisito;
                matrizTemp[fila][8]=  "Reprobado";
                num++;
                fila++;
           
        
       String [] encabezado = {"No.","Curso", "Catedrático", "Créditos", "Laboratorio", "Pre-Requisito", "Post-Requisito", "Estado"};
       DefaultTableModel model = new DefaultTableModel(matrizTemp, encabezado);
       this.tablaAsigna.setModel(model);
        
        
    }//GEN-LAST:event_agregar_btnActionPerformed
   
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
            java.util.logging.Logger.getLogger(asignacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(asignacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(asignacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(asignacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new asignacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar_btn;
    private javax.swing.JComboBox<String> asignaCurso_cb;
    private javax.swing.JComboBox<String> asignarSemes_cb;
    private javax.swing.JButton asignar_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tablaAsigna;
    // End of variables declaration//GEN-END:variables
}
