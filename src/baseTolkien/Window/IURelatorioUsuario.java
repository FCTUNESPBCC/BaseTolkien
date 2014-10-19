/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baseTolkien.Window;

import baseTolkien.Controlador.BD;
import baseTolkien.Entidades.Aluno;
import baseTolkien.Entidades.Livro;
import baseTolkien.Entidades.Relatorios.AlunoRelatorio;
import baseTolkien.Entidades.Relatorios.LivroRelatorio;
import baseTolkien.Entidades.Relatorios.ProfessorRelatorio;
import baseTolkien.Entidades.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eloigdn
 */
public class IURelatorioUsuario extends javax.swing.JFrame {
   private String codigo;
    /**
     * Creates new form IURelatorioUsuario
     */
    public IURelatorioUsuario() {
        initComponents();
        
        exibition_GrupoBut.clearSelection();
        tipo_GrupoBut.clearSelection();
        
        exibition_GrupoBut.add(jRadioTodos);
        exibition_GrupoBut.add(jRadioDevolver);
        exibition_GrupoBut.add(jRadioAtraso);
        
        tipo_GrupoBut.add(radioTodosUsuarios);
        tipo_GrupoBut.add(radioProfessores);
        tipo_GrupoBut.add(radioAlunos);
        
        
    }

    public String getCodigo() {
        return codigo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exibition_GrupoBut = new javax.swing.ButtonGroup();
        tipo_GrupoBut = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        usuarios_Table = new javax.swing.JTable();
        radioTodosUsuarios = new javax.swing.JRadioButton();
        radioProfessores = new javax.swing.JRadioButton();
        radioAlunos = new javax.swing.JRadioButton();
        jButtonVoltar = new javax.swing.JButton();
        jButtonHistoricoEmprestimos = new javax.swing.JButton();
        jButtonEmprestimos = new javax.swing.JButton();
        jRadioAtraso = new javax.swing.JRadioButton();
        jRadioDevolver = new javax.swing.JRadioButton();
        jRadioTodos = new javax.swing.JRadioButton();
        jLabelExibicao = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usuarios_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Codigo", "Curso/Titulação", "Ano"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
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
        usuarios_Table.setColumnSelectionAllowed(true);
        usuarios_Table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(usuarios_Table);
        usuarios_Table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (usuarios_Table.getColumnModel().getColumnCount() > 0) {
            usuarios_Table.getColumnModel().getColumn(0).setResizable(false);
            usuarios_Table.getColumnModel().getColumn(1).setResizable(false);
            usuarios_Table.getColumnModel().getColumn(2).setResizable(false);
            usuarios_Table.getColumnModel().getColumn(3).setResizable(false);
        }

        radioTodosUsuarios.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        radioTodosUsuarios.setText("Todos Usuários");
        radioTodosUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTodosUsuariosActionPerformed(evt);
            }
        });

        radioProfessores.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        radioProfessores.setText("Professores");
        radioProfessores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioProfessoresActionPerformed(evt);
            }
        });

        radioAlunos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        radioAlunos.setText("Alunos");
        radioAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAlunosActionPerformed(evt);
            }
        });

        jButtonVoltar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jButtonHistoricoEmprestimos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonHistoricoEmprestimos.setText("Histórico de Empréstimos");
        jButtonHistoricoEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHistoricoEmprestimosActionPerformed(evt);
            }
        });

        jButtonEmprestimos.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButtonEmprestimos.setText("Livros a Devolver");
        jButtonEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmprestimosActionPerformed(evt);
            }
        });

        jRadioAtraso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRadioAtraso.setText("Possui Livros em Atraso");

        jRadioDevolver.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRadioDevolver.setText("Possui Livros a Devolver");

        jRadioTodos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRadioTodos.setText("Todos");

        jLabelExibicao.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabelExibicao.setText("Tipos de Exibição");

        jLabelUsuario.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabelUsuario.setText("Tipos de Usuário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(radioTodosUsuarios, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(radioAlunos)
                                        .addComponent(radioProfessores))
                                    .addComponent(jLabelUsuario))
                                .addGap(154, 154, 154)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioAtraso)
                                    .addComponent(jRadioDevolver)
                                    .addComponent(jRadioTodos)
                                    .addComponent(jLabelExibicao)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonHistoricoEmprestimos)
                                .addGap(45, 45, 45)
                                .addComponent(jButtonEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelExibicao)
                    .addComponent(jLabelUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioTodosUsuarios)
                    .addComponent(jRadioTodos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioProfessores)
                    .addComponent(jRadioAtraso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioAlunos)
                    .addComponent(jRadioDevolver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonHistoricoEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVoltar)
                    .addComponent(jButtonEmprestimos))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAlunosActionPerformed
        ArrayList<Usuario> usuarios;
       DefaultTableModel modelo = (DefaultTableModel) usuarios_Table.getModel();
        
       if(jRadioTodos.isSelected()){
           
        usuarios  = BD.getAllAluno();   
        for(int i=0;i<usuarios.size();i++) {
            Object[] linha = new Object[4];
            
                AlunoRelatorio aluno = (AlunoRelatorio) usuarios.get(i);    
                linha[0] = aluno.getNome();
                linha[1] = aluno.getCodUsuario();
                linha[2] = aluno.getCurso();
                linha[3] = aluno.getAno();
                modelo.addRow(linha);
         }
       }
       else{
           if(jRadioAtraso.isSelected()){
             usuarios = BD.getAllAlunoComAtraso();
             for(int i=0;i<usuarios.size();i++) {
             Object[] linha = new Object[4];
           
                AlunoRelatorio aluno = (AlunoRelatorio) usuarios.get(i);    
                linha[0] = aluno.getNome();
                linha[1] = aluno.getCodUsuario();
                linha[2] = aluno.getCurso();
                linha[3] = aluno.getAno();
                modelo.addRow(linha);
             } 
           }
           else{
             if(jRadioDevolver.isSelected()){  
             usuarios = BD.getAllAluno();
             for(int i=0;i<usuarios.size();i++) {
             if(BD.isUsuarioComEmprestimo(usuarios.get(i).getCodUsuario())){    
             Object[] linha = new Object[4];
            
                AlunoRelatorio aluno = (AlunoRelatorio) usuarios.get(i);    
                linha[0] = aluno.getNome();
                linha[1] = aluno.getCodUsuario();
                linha[2] = aluno.getCurso();
                linha[3] = aluno.getAno();
                modelo.addRow(linha);
             }            
             }
            } 
           }
      }     
            
    }//GEN-LAST:event_radioAlunosActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonHistoricoEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHistoricoEmprestimosActionPerformed
       
        if(usuarios_Table.getSelectedRowCount()>0){
            int index = usuarios_Table.getSelectedRow();
            this.codigo = (String) usuarios_Table.getModel().getValueAt(index,1);
           
            ArrayList<LivroRelatorio> livros = BD.getAllLivrosOf(codigo);
            IUHistoricoEmprestimos emprestimos = new IUHistoricoEmprestimos();
            DefaultTableModel modelo = (DefaultTableModel) emprestimos.getLivros_Table().getModel();
            
            
            for(LivroRelatorio livr: livros){
                Object[] linha = new Object[3];
                linha[0] = livr.getNome();
                linha[1] = livr.getCodLivro();
                linha[2] = livr.getAno();
                modelo.addRow(linha);
            }
            
            emprestimos.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"É necessário selecionar um Usuário!!!");
          this.codigo=null;
        }
    }//GEN-LAST:event_jButtonHistoricoEmprestimosActionPerformed

    private void radioTodosUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTodosUsuariosActionPerformed
       ArrayList<Usuario> usuarios;
       DefaultTableModel modelo = (DefaultTableModel) usuarios_Table.getModel();
        
       if(jRadioTodos.isSelected()){
           
        usuarios  = BD.getAllUsuario();   
        for(int i=0;i<usuarios.size();i++) {
            Object[] linha = new Object[4];
            
            if(usuarios.get(i) instanceof AlunoRelatorio){
                AlunoRelatorio aluno = (AlunoRelatorio) usuarios.get(i);    
                linha[0] = aluno.getNome();
                linha[1] = aluno.getCodUsuario();
                linha[2] = aluno.getCurso();
                linha[3] = aluno.getAno();
                modelo.addRow(linha);
            }
            else{
                ProfessorRelatorio professor = (ProfessorRelatorio) usuarios.get(i);    
                linha[0] = professor.getNome();
                linha[1] = professor.getCodUsuario();
                linha[2] = professor.getTitulacao();
                modelo.addRow(linha);
            }
         }
       }
       else{
           if(jRadioAtraso.isSelected()){
             usuarios = BD.getAllUsuarioComAtraso();
             for(int i=0;i<usuarios.size();i++) {
             Object[] linha = new Object[4];
            
             if(usuarios.get(i) instanceof AlunoRelatorio){
                AlunoRelatorio aluno = (AlunoRelatorio) usuarios.get(i);    
                linha[0] = aluno.getNome();
                linha[1] = aluno.getCodUsuario();
                linha[2] = aluno.getCurso();
                linha[3] = aluno.getAno();
                modelo.addRow(linha);
            }
             else{
                ProfessorRelatorio professor = (ProfessorRelatorio) usuarios.get(i);    
                linha[0] = professor.getNome();
                linha[1] = professor.getCodUsuario();
                linha[2] = professor.getTitulacao();
                modelo.addRow(linha);
                }
             } 
           }
           else{
             if(jRadioDevolver.isSelected()){  
             usuarios = BD.getAllUsuario();
             for(int i=0;i<usuarios.size();i++) {
             if(BD.isUsuarioComEmprestimo(usuarios.get(i).getCodUsuario())){    
             Object[] linha = new Object[4];
            
             if(usuarios.get(i) instanceof AlunoRelatorio){
                AlunoRelatorio aluno = (AlunoRelatorio) usuarios.get(i);    
                linha[0] = aluno.getNome();
                linha[1] = aluno.getCodUsuario();
                linha[2] = aluno.getCurso();
                linha[3] = aluno.getAno();
                modelo.addRow(linha);
            }
             else{
                ProfessorRelatorio professor = (ProfessorRelatorio) usuarios.get(i);    
                linha[0] = professor.getNome();
                linha[1] = professor.getCodUsuario();
                linha[2] = professor.getTitulacao();
                modelo.addRow(linha);
                }
             }
             }
            } 
           }
      }     
    }//GEN-LAST:event_radioTodosUsuariosActionPerformed

    private void radioProfessoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioProfessoresActionPerformed
        ArrayList<Usuario> usuarios;
       DefaultTableModel modelo = (DefaultTableModel) usuarios_Table.getModel();
        
       if(jRadioTodos.isSelected()){
           
            usuarios  = BD.getAllProfessor();   
            for(int i=0;i<usuarios.size();i++) {
                Object[] linha = new Object[4];
            
                ProfessorRelatorio professor = (ProfessorRelatorio) usuarios.get(i);    
                linha[0] = professor.getNome();
                linha[1] = professor.getCodUsuario();
                linha[2] = professor.getTitulacao();
                modelo.addRow(linha); 
         }
       }
       else{
           if(jRadioAtraso.isSelected()){
             usuarios = BD.getAllProfessorComAtraso();
             for(int i=0;i<usuarios.size();i++) {
                Object[] linha = new Object[4];
            
                ProfessorRelatorio professor = (ProfessorRelatorio) usuarios.get(i);    
                linha[0] = professor.getNome();
                linha[1] = professor.getCodUsuario();
                linha[2] = professor.getTitulacao();
                modelo.addRow(linha);
                
             } 
           }
           else{
             if(jRadioDevolver.isSelected()){  
             usuarios = BD.getAllProfessor();
             
             for(int i=0;i<usuarios.size();i++) {
                Object[] linha = new Object[4];
                if(BD.isUsuarioComEmprestimo(usuarios.get(i).getCodUsuario())){
                ProfessorRelatorio professor = (ProfessorRelatorio) usuarios.get(i);    
                linha[0] = professor.getNome();
                linha[1] = professor.getCodUsuario();
                linha[2] = professor.getTitulacao();
                modelo.addRow(linha);
                }
              }
             }
           }
      }
    }//GEN-LAST:event_radioProfessoresActionPerformed

    private void jButtonEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmprestimosActionPerformed
       
        IULocalizarLivroADevolver localizarLivros = new IULocalizarLivroADevolver();
        if(usuarios_Table.getSelectedRowCount()>0){
            int index = usuarios_Table.getSelectedRow();
            ArrayList<LivroRelatorio> livros = BD.getAllLivrosNaoDevolvidosOf(codigo);
           
            DefaultTableModel modelo = (DefaultTableModel) localizarLivros.getLocalizar_Table().getModel();
            
            
            for(LivroRelatorio livr: livros){
                Object[] linha = new Object[3];
                linha[0] = livr.getNome();
                linha[1] = livr.getCodLivro();
                linha[2] = livr.getAno();
                modelo.addRow(linha);
            }
            this.codigo = (String) usuarios_Table.getModel().getValueAt(index,1);
            
            
            localizarLivros.setVisible(true);
         }
         else{
            JOptionPane.showMessageDialog(null,"É necessário selecionar um Usuário!!!");
          this.codigo=null;
        }
             
    }//GEN-LAST:event_jButtonEmprestimosActionPerformed

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
            java.util.logging.Logger.getLogger(IURelatorioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IURelatorioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IURelatorioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IURelatorioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IURelatorioUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup exibition_GrupoBut;
    private javax.swing.JButton jButtonEmprestimos;
    private javax.swing.JButton jButtonHistoricoEmprestimos;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelExibicao;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JRadioButton jRadioAtraso;
    private javax.swing.JRadioButton jRadioDevolver;
    private javax.swing.JRadioButton jRadioTodos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioAlunos;
    private javax.swing.JRadioButton radioProfessores;
    private javax.swing.JRadioButton radioTodosUsuarios;
    private javax.swing.ButtonGroup tipo_GrupoBut;
    private javax.swing.JTable usuarios_Table;
    // End of variables declaration//GEN-END:variables
}
