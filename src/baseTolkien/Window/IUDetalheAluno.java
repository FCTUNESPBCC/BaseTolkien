/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baseTolkien.Window;

import baseTolkien.Controlador.BD;
import baseTolkien.Entidades.Relatorios.AlunoRelatorio;
import baseTolkien.Entidades.Relatorios.LivroRelatorio;
import baseTolkien.Entidades.Usuario;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leonardo Dias
 */
public class IUDetalheAluno extends javax.swing.JFrame implements WindowFocusListener{

    AlunoRelatorio aluno = null;
    
        
    /**
     * Creates new form IUDetalheLivro
     */
    public IUDetalheAluno(AlunoRelatorio alunoExt) {
        aluno = alunoExt;
        aluno.setLivros(BD.getAllLivrosNaoDevolvidosOf(aluno.getCodUsuario()));
        initComponents();
        
        model = (DefaultTableModel) jTableLivros.getModel();
        
        addWindowFocusListener(this);
        jTextFieldAno.setEditable(false);
        jTextFieldNome.setEditable(false);
        jTextFieldCod.setEditable(false);
        jTextFieldCurso.setEditable(false);
        
        jTextFieldNome.setText(aluno.getNome());
        jTextFieldCod.setText(aluno.getCodUsuario());
        jTextFieldAno.setText(aluno.getAno()+"");
        jTextFieldCurso.setText(aluno.getCurso());
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setTitle(aluno.getNome());
    }       

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelAno = new javax.swing.JLabel();
        jTextFieldCurso = new javax.swing.JTextField();
        jLabelAno1 = new javax.swing.JLabel();
        jTextFieldAno = new javax.swing.JTextField();
        jLabelCod = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jButtonDevolver = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableLivros = new javax.swing.JTable();
        btNovoEmprestimo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelNome.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelNome.setText("Nome :");

        jTextFieldNome.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jLabelAno.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelAno.setText("Curso :");

        jTextFieldCurso.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextFieldCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCursoActionPerformed(evt);
            }
        });

        jLabelAno1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelAno1.setText("Ano :");

        jTextFieldAno.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabelCod.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelCod.setText("Código :");

        jTextFieldCod.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jButtonDevolver.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButtonDevolver.setText("Devolver");
        jButtonDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDevolverActionPerformed(evt);
            }
        });

        jTableLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Ano", "Situação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableLivros);

        btNovoEmprestimo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btNovoEmprestimo.setText("Novo Empréstimo");
        btNovoEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoEmprestimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCod)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabelAno)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabelAno1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabelNome)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldNome))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btNovoEmprestimo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDevolver))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAno1)
                    .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAno))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCod, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDevolver)
                    .addComponent(btNovoEmprestimo))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCursoActionPerformed

    private void jButtonDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDevolverActionPerformed
        int index = jTableLivros.getSelectedRow();
        if(index!=-1)
            BD.devolverLivro((aluno.getLivros()).get(index).getCodLivro(), aluno.getCodUsuario());
        while(model.getRowCount()>0)
            model.removeRow(0);
        aluno.setLivros(BD.getAllLivrosNaoDevolvidosOf(aluno.getCodUsuario()));
        for(LivroRelatorio livro: aluno.getLivros()){
                model.addRow(new Object[]{livro.getCodLivro(), livro.getNome(), livro.getAno(), !livro.isEmprestado()?"Disponível":(!BD.isAtrasado(livro.getCodLivro())?"Emprestado":"Atrasado")});
        }
        BD.salvarLivros();
        BD.salvarUsuarios();
        BD.salvarEmprestimos();
    }//GEN-LAST:event_jButtonDevolverActionPerformed

    private void btNovoEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoEmprestimoActionPerformed
        if(!BD.isUsuarioComAtraso((aluno.getCodUsuario())))
            new IUSelecionarEmprestimo(aluno);
        else
            JOptionPane.showMessageDialog(this, "Impossível fazer empréstimo com atrasos pendentes.", "ERRO", 0);
    }//GEN-LAST:event_btNovoEmprestimoActionPerformed

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
            java.util.logging.Logger.getLogger(IUDetalheAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUDetalheAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUDetalheAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUDetalheAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btNovoEmprestimo;
    private javax.swing.JButton jButtonDevolver;
    private javax.swing.JLabel jLabelAno;
    private javax.swing.JLabel jLabelAno1;
    private javax.swing.JLabel jLabelCod;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableLivros;
    private javax.swing.JTextField jTextFieldAno;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldCurso;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel model;
    
    public void windowDeactivated(WindowEvent we) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void windowGainedFocus(WindowEvent we) {
        while(model.getRowCount()>0)
            model.removeRow(0);
        aluno.setLivros(BD.getAllLivrosNaoDevolvidosOf(aluno.getCodUsuario()));
        for(LivroRelatorio livro: aluno.getLivros()){
                model.addRow(new Object[]{livro.getCodLivro(), livro.getNome(), livro.getAno(), !livro.isEmprestado()?"Disponível":(!livro.isAtrasado()?"Emprestado":"Atrasado")});
        }
    }

    public void windowLostFocus(WindowEvent we) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
