/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baseTolkien.Window;

import javax.swing.JTextField;

/**
 *
 * @author Eloigdn
 */
public class IUProfessorEmprestou extends javax.swing.JFrame {

    /**
     * Creates new form IUProfessorEmprestou
     */
    public IUProfessorEmprestou() {
        initComponents();
    }

    public JTextField getCod_Text() {
        return cod_Text;
    }

    public JTextField getNome_Text() {
        return nome_Text;
    }

    public JTextField getTitulacao_Text() {
        return titulacao_Text;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nome_Text = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        cod_Text = new javax.swing.JTextField();
        jLabelCod = new javax.swing.JLabel();
        jLabelTitulacao = new javax.swing.JLabel();
        voltar_Button = new javax.swing.JButton();
        titulacao_Text = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nome_Text.setEditable(false);
        nome_Text.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        nome_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_TextActionPerformed(evt);
            }
        });

        jLabelNome.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelNome.setText("Nome :");

        cod_Text.setEditable(false);
        cod_Text.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        cod_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cod_TextActionPerformed(evt);
            }
        });

        jLabelCod.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelCod.setText("Código :");

        jLabelTitulacao.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelTitulacao.setText("Titulação :");

        voltar_Button.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        voltar_Button.setText("Voltar");
        voltar_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar_ButtonActionPerformed(evt);
            }
        });

        titulacao_Text.setEditable(false);
        titulacao_Text.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        titulacao_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titulacao_TextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(voltar_Button)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelNome)
                            .addGap(10, 10, 10)
                            .addComponent(nome_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelCod)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cod_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabelTitulacao)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(titulacao_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCod)
                    .addComponent(cod_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTitulacao)
                    .addComponent(titulacao_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(voltar_Button)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nome_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_TextActionPerformed

    private void cod_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cod_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cod_TextActionPerformed

    private void voltar_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar_ButtonActionPerformed
        dispose();
    }//GEN-LAST:event_voltar_ButtonActionPerformed

    private void titulacao_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titulacao_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titulacao_TextActionPerformed

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
            java.util.logging.Logger.getLogger(IUProfessorEmprestou.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUProfessorEmprestou.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUProfessorEmprestou.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUProfessorEmprestou.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUProfessorEmprestou().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cod_Text;
    private javax.swing.JComboBox jComboTitulacao;
    private javax.swing.JComboBox jComboTitulacao1;
    private javax.swing.JComboBox jComboTitulacao2;
    private javax.swing.JLabel jLabelCod;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelTitulacao;
    private javax.swing.JTextField nome_Text;
    private javax.swing.JTextField titulacao_Text;
    private javax.swing.JButton voltar_Button;
    // End of variables declaration//GEN-END:variables
}