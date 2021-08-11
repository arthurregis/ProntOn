/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import main.java.paciente.Paciente;
import controller.PacienteController;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HARDWARE
 */
public class TelaVisualizarPaciente extends javax.swing.JFrame {
    
    PacienteController pacienteController = new PacienteController();

    /**
     * Creates new form tela_Sec
     */
    public TelaVisualizarPaciente(String cpf) throws IOException {
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        preencherDados(cpf);
    }
    
    public void preencherDados(String cpf){
        Paciente pac = new Paciente();
        pac = pacienteController.getPaciente(cpf);
        
        CampoCPF.setText(pac.getCpf());
        CampoEndereco.setText(pac.getEndereco());
        CampoNome.setText(pac.getNome());
        CampoRG.setText(pac.getRG());
        CampoTelefone.setText(pac.getTelefone());
        Nasc1.setText(pac.getDataNasc());
        if(pac.getSexo() == "M"){
            CheckMasculino.setSelected(true);
        }else CheckFeminino.setSelected(true);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CampoNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CampoCPF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CampoRG = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CampoTelefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CampoEndereco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CheckMasculino = new javax.swing.JCheckBox();
        CheckFeminino = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Nasc1 = new javax.swing.JTextField();

        campoid.setEditable(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Visualizar Secretário(a)");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(478, 70));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Visualizar Paciente");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 386, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setText("Nome:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, 32));

        CampoNome.setEditable(false);
        CampoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeActionPerformed(evt);
            }
        });
        jPanel2.add(CampoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 248, 27));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 255));
        jLabel2.setText("CPF:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        CampoCPF.setEditable(false);
        CampoCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCPFActionPerformed(evt);
            }
        });
        jPanel2.add(CampoCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 248, 29));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setText("RG:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        CampoRG.setEditable(false);
        CampoRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoRGActionPerformed(evt);
            }
        });
        jPanel2.add(CampoRG, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 248, 28));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        jLabel4.setText("Telefone:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 90, -1));

        CampoTelefone.setEditable(false);
        CampoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTelefoneActionPerformed(evt);
            }
        });
        jPanel2.add(CampoTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 248, 28));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 153, 255));
        jLabel5.setText("Endereço:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        CampoEndereco.setEditable(false);
        CampoEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEnderecoActionPerformed(evt);
            }
        });
        jPanel2.add(CampoEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 248, 26));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 153, 255));
        jLabel7.setText("Sexo:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        CheckMasculino.setBackground(new java.awt.Color(255, 255, 255));
        CheckMasculino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CheckMasculino.setForeground(new java.awt.Color(102, 153, 255));
        CheckMasculino.setText("Masculino ");
        CheckMasculino.setEnabled(false);
        CheckMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckMasculinoActionPerformed(evt);
            }
        });
        jPanel2.add(CheckMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 100, -1));

        CheckFeminino.setBackground(new java.awt.Color(255, 255, 255));
        CheckFeminino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CheckFeminino.setForeground(new java.awt.Color(102, 153, 255));
        CheckFeminino.setText("Feminino");
        CheckFeminino.setEnabled(false);
        CheckFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckFemininoActionPerformed(evt);
            }
        });
        jPanel2.add(CheckFeminino, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 153, 255));
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(380, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 490, 60));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 153, 255));
        jLabel8.setText("Data Nasc:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        Nasc1.setEditable(false);
        Nasc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nasc1ActionPerformed(evt);
            }
        });
        jPanel2.add(Nasc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 248, 28));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNomeActionPerformed

    private void CampoCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCPFActionPerformed

    private void CampoRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoRGActionPerformed

    private void CampoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoTelefoneActionPerformed

    private void CampoEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoEnderecoActionPerformed

    private void CheckMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckMasculinoActionPerformed
        
    }//GEN-LAST:event_CheckMasculinoActionPerformed

    private void CheckFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckFemininoActionPerformed
        
    }//GEN-LAST:event_CheckFemininoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Nasc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nasc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nasc1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVisualizarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVisualizarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVisualizarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVisualizarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaVisualizarPaciente("").setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(TelaVisualizarPaciente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoCPF;
    private javax.swing.JTextField CampoEndereco;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JTextField CampoRG;
    private javax.swing.JTextField CampoTelefone;
    private javax.swing.JCheckBox CheckFeminino;
    private javax.swing.JCheckBox CheckMasculino;
    private javax.swing.JTextField Nasc1;
    private javax.swing.JTextField campoid;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
