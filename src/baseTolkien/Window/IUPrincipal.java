/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * IUPrincipal.java
 *
 * Created on 24/05/2013, 23:19:53
 */
package baseTolkien.Window;

import baseTolkien.Controlador.BD;
import baseTolkien.Controlador.Controlador;

/**
 *
 * @author Danilo Medeiros Eler
 */
public class IUPrincipal extends javax.swing.JFrame {
  public static BD dataB = new BD();
    /** Creates new form IUPrincipal */
    public IUPrincipal() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuPrincipal = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuUsuarios = new javax.swing.JMenu();
        jMenuItemAluno = new javax.swing.JMenuItem();
        jMenuItemProfessor = new javax.swing.JMenuItem();
        jMenuItemLivros = new javax.swing.JMenuItem();
        jMenuMovimentacao = new javax.swing.JMenu();
        jMenuIEmprestimo = new javax.swing.JMenuItem();
        jMenuIDevolucao = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem16 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuCadastros.setText("Cadastros");

        jMenuUsuarios.setText("Usuários");

        jMenuItemAluno.setText("Aluno");
        jMenuItemAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAlunoActionPerformed(evt);
            }
        });
        jMenuUsuarios.add(jMenuItemAluno);

        jMenuItemProfessor.setText("Professor");
        jMenuItemProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProfessorActionPerformed(evt);
            }
        });
        jMenuUsuarios.add(jMenuItemProfessor);

        jMenuCadastros.add(jMenuUsuarios);

        jMenuItemLivros.setText("Livros");
        jMenuItemLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLivrosActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemLivros);

        jMenuPrincipal.add(jMenuCadastros);

        jMenuMovimentacao.setText("Movimentação");

        jMenuIEmprestimo.setText("Empréstimo");
        jMenuMovimentacao.add(jMenuIEmprestimo);

        jMenuIDevolucao.setText("Devolução");
        jMenuMovimentacao.add(jMenuIDevolucao);

        jMenuPrincipal.add(jMenuMovimentacao);

        jMenu4.setText("Relatórios");

        jMenuItem6.setText("Todos Usuários");
        jMenu4.add(jMenuItem6);

        jMenuItem7.setText("Todos Alunos");
        jMenu4.add(jMenuItem7);

        jMenuItem8.setText("Todos Professores");
        jMenu4.add(jMenuItem8);

        jMenuItem17.setText("Todos Livros já Emprestados para um Usuário");
        jMenu4.add(jMenuItem17);

        jMenuItem18.setText("Livros não Devolvidos por um Usuário");
        jMenu4.add(jMenuItem18);
        jMenu4.add(jSeparator1);

        jMenuItem9.setText("Todos os Livros");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuItem10.setText("Livros Disponíveis");
        jMenu4.add(jMenuItem10);

        jMenuItem11.setText("Livros Emprestados");
        jMenu4.add(jMenuItem11);
        jMenu4.add(jSeparator2);

        jMenuItem12.setText("Livros com Atraso");
        jMenu4.add(jMenuItem12);

        jMenuItem13.setText("Usuários com Atraso");
        jMenu4.add(jMenuItem13);

        jMenuPrincipal.add(jMenu4);

        jMenu5.setText("Outros");

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem14.setText("Salvar Dados");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem14);

        jMenuItem15.setText("Carregar Dados");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem15);
        jMenu5.add(jSeparator3);

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem16.setText("Configurações");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem16);

        jMenuPrincipal.add(jMenu5);

        setJMenuBar(jMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
        Controlador control = new Controlador();
        IUConfig iuConfig = IUConfig.getInstancia(this);
        iuConfig.exibir(control.getConfiguracoes());

        //alternativamente, podemos chamar assim:
        //IUConfig.getInstancia(this).exibir(biblioteca.getConfiguracoes());
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        (new Controlador()).salvarLivros(); //salva livros para arquivo
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
        Controlador control = new Controlador();
        control.recuperarLivros(); //carrega livros do arquivo
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItemLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLivrosActionPerformed
        Controlador control = new Controlador();
        IUCadastroLivro iuLivro = new IUCadastroLivro();
        iuLivro.setLocation(100, 70);
        iuLivro.setVisible(true);
    }//GEN-LAST:event_jMenuItemLivrosActionPerformed

    private void jMenuItemAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAlunoActionPerformed
        Controlador control = new Controlador();
        IUCadastroAluno iuAluno = new IUCadastroAluno();
        iuAluno.setLocationRelativeTo(this);
        iuAluno.setVisible(true);
    }//GEN-LAST:event_jMenuItemAlunoActionPerformed

    private void jMenuItemProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProfessorActionPerformed
       Controlador control = new Controlador();
        IUCadastroProfessor iuProf = new IUCadastroProfessor();
        iuProf.setVisible(true);
    }//GEN-LAST:event_jMenuItemProfessorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new IUPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenuItem jMenuIDevolucao;
    private javax.swing.JMenuItem jMenuIEmprestimo;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemAluno;
    private javax.swing.JMenuItem jMenuItemLivros;
    private javax.swing.JMenuItem jMenuItemProfessor;
    private javax.swing.JMenu jMenuMovimentacao;
    private javax.swing.JMenuBar jMenuPrincipal;
    private javax.swing.JMenu jMenuUsuarios;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    // End of variables declaration//GEN-END:variables

   
}
