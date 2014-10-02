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
}
