/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package baseTolkien.Entidades;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Danilo Medeiros Eler
 */
public class Biblioteca {
    private Config configuracoes;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Emprestimo> emprestimos;
    private ArrayList<Livro> livros;

    public Biblioteca() {
        this.usuarios = new ArrayList<Usuario>();
        this.emprestimos = new ArrayList<Emprestimo>();
        this.livros = new ArrayList<Livro>();
        this.configuracoes = new Config();
    }

    public Config getConfiguracoes() {
        return configuracoes;
    }

    public void setConfiguracoes(Config configuracoes) {
        this.configuracoes = configuracoes;
    }

    public void addAluno(Aluno aluno){
        this.usuarios.add(aluno);
    }

    public void addProfessor(Professor professor){
        this.usuarios.add(professor);
    }

    public void addLivro(Livro livro) {
        this.livros.add(livro);
    }
    
    public void addEmprestimo(Emprestimo emprestimo){
        this.emprestimos.add(emprestimo);
    }
    
    public ArrayList<Usuario> getAllUsuario(){
        return usuarios;
    }
    
    public ArrayList<Livro> getAllLivros(){
        return livros;
    }
    
    public ArrayList<Emprestimo> getAllEmprestimo(){
        return emprestimos;
    }

    public void salvarLivros() {
        String nomeArquivo = configuracoes.getArquivoLivros();
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(nomeArquivo);
            oos = new ObjectOutputStream(fos);
            //oos.writeObject(this.livros);
            //ou salvar livro a livro
            oos.writeInt(livros.size());
            for (Livro livro : livros) {
                oos.writeObject(livro);
            }
        } catch (IOException ex) {
            Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oos.close();
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void recuperarLivros() {
        String nomeArquivo = configuracoes.getArquivoLivros();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(nomeArquivo);
            ois = new ObjectInputStream(fis);
            ///this.livros = (ArrayList<Livro>) ois.readObject();
            ///ou ler livro por livro do arquivo -- depende de como salvou
            this.livros.clear();
            int numLivros = ois.readInt();
            for (int i=0; i<numLivros; i++){
                Livro livro = (Livro) ois.readObject();
                livros.add( livro );
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                ois.close();
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
