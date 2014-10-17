/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baseTolkien.Window.Panels;

import baseTolkien.Window.IUCadastroLivro;

/**
 *
 * @author Leonardo Dias
 */
public class JPanelLivro extends javax.swing.JPanel {

    /**
     * Creates new form JPanelLivro
     */
    public JPanelLivro() {
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

        icone = new javax.swing.JLabel();
        btCadastrarNovo = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();
        livrosLabel = new javax.swing.JLabel();
        livrosLabel1 = new javax.swing.JLabel();
        btInserirExemplares = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 250, 250));
        setMaximumSize(new java.awt.Dimension(32767, 150));
        setMinimumSize(new java.awt.Dimension(260, 150));
        setPreferredSize(new java.awt.Dimension(260, 150));

        icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book_ico3.png"))); // NOI18N

        btCadastrarNovo.setText("Cadastrar Novo");
        btCadastrarNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarNovoActionPerformed(evt);
            }
        });

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        livrosLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/livrosLabel.jpg"))); // NOI18N

        livrosLabel1.setBackground(new java.awt.Color(250, 250, 250));
        livrosLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/topToolBar.jpg"))); // NOI18N

        btInserirExemplares.setText("Inserir Exemplares");
        btInserirExemplares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirExemplaresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(icone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btCadastrarNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btInserirExemplares)))
                    .addComponent(livrosLabel)
                    .addComponent(livrosLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(livrosLabel1)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCadastrarNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btInserirExemplares)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btBuscar))
                    .addComponent(icone, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(livrosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarNovoActionPerformed
        new IUCadastroLivro();
    }//GEN-LAST:event_btCadastrarNovoActionPerformed

    private void btInserirExemplaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirExemplaresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btInserirExemplaresActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCadastrarNovo;
    private javax.swing.JButton btInserirExemplares;
    private javax.swing.JLabel icone;
    private javax.swing.JLabel livrosLabel;
    private javax.swing.JLabel livrosLabel1;
    // End of variables declaration//GEN-END:variables
}
