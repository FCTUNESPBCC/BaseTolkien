/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baseTolkien.Window;


import baseTolkien.Controlador.BD;
import baseTolkien.Entidades.Aluno;
import baseTolkien.Entidades.Professor;
import baseTolkien.Entidades.Relatorios.LivroRelatorio;
import baseTolkien.Entidades.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eloigdn
 */
public class IURelatorioLivros extends javax.swing.JFrame {
    private String codLivro;
    ArrayList<LivroRelatorio> livros;
    DefaultTableModel modelo;
        
    /**
     * Creates new form IURelatorioLivros
     */
    public IURelatorioLivros() {
        initComponents();
        setResizable(false);
        setVisible(true);
        setTitle("Relatório Livros");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        grupo_Button.clearSelection();
        grupo_Button.add(jButtonDisponivel);
        grupo_Button.add(jButtonAtraso);
        grupo_Button.add(jButtonEmprestados);
        grupo_Button.add(jButtonTodos);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_Button = new javax.swing.ButtonGroup();
        jButtonTodos = new javax.swing.JRadioButton();
        jButtonDisponivel = new javax.swing.JRadioButton();
        jButtonEmprestados = new javax.swing.JRadioButton();
        jButtonAtraso = new javax.swing.JRadioButton();
        jLabelLivros = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        livros_Table = new javax.swing.JTable();
        jButtonVoltar = new javax.swing.JButton();
        quemEmprestou_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        grupo_Button.add(jButtonTodos);
        jButtonTodos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonTodos.setText("Todos");
        jButtonTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTodosActionPerformed(evt);
            }
        });

        grupo_Button.add(jButtonDisponivel);
        jButtonDisponivel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonDisponivel.setText("Disponíveis");
        jButtonDisponivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDisponivelActionPerformed(evt);
            }
        });

        grupo_Button.add(jButtonEmprestados);
        jButtonEmprestados.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonEmprestados.setText("Emprestados");
        jButtonEmprestados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmprestadosActionPerformed(evt);
            }
        });

        grupo_Button.add(jButtonAtraso);
        jButtonAtraso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonAtraso.setText("Em atraso");
        jButtonAtraso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasoActionPerformed(evt);
            }
        });

        jLabelLivros.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabelLivros.setText("Tipos de Livros");

        livros_Table.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        livros_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Codigo", "Ano", "Situação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
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
        livros_Table.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(livros_Table);
        livros_Table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (livros_Table.getColumnModel().getColumnCount() > 0) {
            livros_Table.getColumnModel().getColumn(0).setResizable(false);
            livros_Table.getColumnModel().getColumn(1).setResizable(false);
            livros_Table.getColumnModel().getColumn(2).setResizable(false);
        }

        jButtonVoltar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        quemEmprestou_Button.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        quemEmprestou_Button.setText("Quem Pegou Emprestado?");
        quemEmprestou_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quemEmprestou_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonTodos)
                            .addComponent(jButtonDisponivel)
                            .addComponent(jButtonEmprestados)
                            .addComponent(jButtonAtraso)
                            .addComponent(jLabelLivros))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(quemEmprestou_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabelLivros)
                .addGap(18, 18, 18)
                .addComponent(jButtonTodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDisponivel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEmprestados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAtraso)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quemEmprestou_Button)
                    .addComponent(jButtonVoltar))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTodosActionPerformed
        
        livros = BD.getAllLivros();
        modelo = (DefaultTableModel) livros_Table.getModel();
        while(modelo.getRowCount()>0)
            modelo.removeRow(0);
        
        for(LivroRelatorio liv: livros) {
            Object[] linha = new Object[4];
            linha[0] = liv.getNome();
            linha[1] = liv.getCodLivro();
            linha[2] = liv.getAno();
            linha[3] = liv.isEmprestado()?(liv.isAtrasado()?"Atrasado":"Emprestado"):"Disponível";
            modelo.addRow(linha);
        }
        
    }//GEN-LAST:event_jButtonTodosActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonDisponivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDisponivelActionPerformed
        livros = BD.getAllLivroDisponivel();
        modelo = (DefaultTableModel) livros_Table.getModel();
        while(modelo.getRowCount()>0)
            modelo.removeRow(0);
        
        for(LivroRelatorio liv: livros) {
            Object[] linha = new Object[4];
            linha[0] = liv.getNome();
            linha[1] = liv.getCodLivro();
            linha[2] = liv.getAno();
            linha[3] = liv.isEmprestado()?(liv.isAtrasado()?"Atrasado":"Emprestado"):"Disponível";
            modelo.addRow(linha);
        }
    }//GEN-LAST:event_jButtonDisponivelActionPerformed

    private void jButtonEmprestadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmprestadosActionPerformed
        livros = BD.getAllLivroEmprestado();
        modelo = (DefaultTableModel) livros_Table.getModel();
        
        while(modelo.getRowCount()>0)
            modelo.removeRow(0);
        
        for(LivroRelatorio liv: livros) {
            Object[] linha = new Object[4];
            linha[0] = liv.getNome();
            linha[1] = liv.getCodLivro();
            linha[2] = liv.getAno();
            linha[3] = liv.isEmprestado()?(liv.isAtrasado()?"Atrasado":"Emprestado"):"Disponível";
            modelo.addRow(linha);
        }
    }//GEN-LAST:event_jButtonEmprestadosActionPerformed

    private void jButtonAtrasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasoActionPerformed
        livros = BD.getAllLivroAtrasado();
        modelo = (DefaultTableModel) livros_Table.getModel();
        
        while(modelo.getRowCount()>0)
            modelo.removeRow(0);
        
        for(LivroRelatorio liv: livros) {
            Object[] linha = new Object[4];
            linha[0] = liv.getNome();
            linha[1] = liv.getCodLivro();
            linha[2] = liv.getAno();
            linha[3] = liv.isEmprestado()?(liv.isAtrasado()?"Atrasado":"Emprestado"):"Disponível";
            modelo.addRow(linha);
        }
    }//GEN-LAST:event_jButtonAtrasoActionPerformed

    private void quemEmprestou_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quemEmprestou_ButtonActionPerformed
        
        
        
        if(livros_Table.getSelectedRowCount()>0){
            int index = livros_Table.getSelectedRow();
            this.codLivro = (String) livros_Table.getModel().getValueAt(index,1);
            
            Usuario user =  BD.getUsuarioQueEmprestouLivro(codLivro);
            if(user!=null){
                String codUsuario= user.getCodUsuario();
                String nome = user.getNome();
                if(user instanceof Aluno){
                    IUAlunoEmprestou emprestimoAluno = new IUAlunoEmprestou();
                    Aluno aluno = (Aluno)user;

                    String curso = aluno.getCurso();
                    String ano = aluno.getAno()+"";

                    emprestimoAluno.getJTextFieldNome().setText(nome);
                    emprestimoAluno.getJTextFieldCod().setText(codUsuario);
                    emprestimoAluno.getJTextFieldCurso().setText(curso);
                    emprestimoAluno.getJTextFieldAno().setText(ano);
                    emprestimoAluno.setVisible(true);
                }
                else{
                    IUProfessorEmprestou emprestimoProfessor = new IUProfessorEmprestou();
                    Professor prof = (Professor)user;


                    String titulacao = prof.getTitulacao();


                    emprestimoProfessor.getNome_Text().setText(nome);
                    emprestimoProfessor.getCod_Text().setText(codUsuario);
                    emprestimoProfessor.getTitulacao_Text().setText(titulacao);
                    emprestimoProfessor.setVisible(true);
                }
            }
            else
                JOptionPane.showMessageDialog(null,"Este livro está disponível no momento!!!");
        }
        else{
          JOptionPane.showMessageDialog(null,"É necessário selecionar um livro!!!");
          this.codLivro=null;
        }
        
        
    }//GEN-LAST:event_quemEmprestou_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(IURelatorioLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IURelatorioLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IURelatorioLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IURelatorioLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IURelatorioLivros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grupo_Button;
    private javax.swing.JRadioButton jButtonAtraso;
    private javax.swing.JRadioButton jButtonDisponivel;
    private javax.swing.JRadioButton jButtonEmprestados;
    private javax.swing.JRadioButton jButtonTodos;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelLivros;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable livros_Table;
    private javax.swing.JButton quemEmprestou_Button;
    // End of variables declaration//GEN-END:variables
}
