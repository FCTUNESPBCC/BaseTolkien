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
    
    public ArrayList<Usuario> getAllUsuario(){
        return usuarios;
    }
    
    public ArrayList<Usuario> getAllAluno(){
        ArrayList<Usuario> usuarioPesquisa = new ArrayList<Usuario>();
        for (Usuario usuario : usuarios) {
            if (usuario instanceof Aluno) {
                usuarioPesquisa.add(usuario);
            }
        }
        return usuarioPesquisa;
    }
    
    public ArrayList<Usuario> getAllProfessor(){
        ArrayList<Usuario> usuarioPesquisa = new ArrayList<Usuario>();
        for (Usuario usuario : usuarios) {
            if (usuario instanceof Professor) {
                usuarioPesquisa.add(usuario);
            }
        }
        return usuarioPesquisa;
    }
    
    public ArrayList<Livro> getAllLivros(){
        return livros;
    }
    
    public ArrayList<Item> getAllLivrosOf(String codUsuario){
        ArrayList<Item> livroPesquisa = new ArrayList<Item>();
        for(Emprestimo emprestimo: emprestimos){
            if(emprestimo.getCodUsuario().equals(codUsuario)){
                for(Item item: emprestimo.getItens())
                    livroPesquisa.add(item);
            }
        }
        return livroPesquisa;
    }
    
    public ArrayList<Item> getAllLivrosNaoDevolvidosOf(String codUsuario){
        ArrayList<Item> livroPesquisa = new ArrayList<Item>();
        for(Emprestimo emprestimo: emprestimos){
            if(emprestimo.getCodUsuario().equals(codUsuario)){
                for(Item item: emprestimo.getItens())
                    if(!item.isDevolvido())
                        livroPesquisa.add(item);
            }
        }
        return livroPesquisa;
    }
    
    public ArrayList<Livro> getAllLivroDisponivel(){
        ArrayList<Livro> livroPesquisa = new ArrayList<Livro>();
        for (Livro livro : livros) {
            if (!livro.isEmprestado()) {
                livroPesquisa.add(livro);
            }
        }
        return livroPesquisa;
    }
    
    public ArrayList<Item> getAllLivroEmprestado(){
        ArrayList<Item> livroPesquisa = new ArrayList<Item>();
        for (Emprestimo emprestimo : emprestimos) {
            for(Item item: emprestimo.getItens())
            if (!item.isDevolvido()) {
                livroPesquisa.add(item);
            }
        }
        return livroPesquisa;
    }
    
    public ArrayList<Item> getAllLivroAtrasado(){
        ArrayList<Item> livroPesquisa = new ArrayList<Item>();
        for (Emprestimo emprestimo : emprestimos) {
            for(Item item: emprestimo.getItens())
            if (item.isAtrasado()) {
                livroPesquisa.add(item);
            }
        }
        return livroPesquisa;
    }
    
    public ArrayList<Usuario> getAllUsuarioComAtraso(){
        ArrayList<Usuario> usuarioPesquisa = new ArrayList<Usuario>();
        for (Emprestimo emprestimo : emprestimos) {
            for(Item item: emprestimo.getItens())
            if (item.isAtrasado()) {
                usuarioPesquisa.add(getUsuarioByCod(emprestimo.getCodUsuario()));
                break;
            }
        }
        return usuarioPesquisa;
    }
    
    public Usuario getUsuarioByCod(String codUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCodUsuario().equals(codUsuario)) {
                return usuario;
            }
        }
        return null;
    }

    public Livro getLivroByCod(String codLivro) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getCodLivro().equals(codLivro)) {
                return livros.get(i);
            }
        }
        return null;
    }
    
    public ArrayList<Livro> getLivroByNome(String nome){
        ArrayList<Livro> livroPesquisa = new ArrayList<Livro>();
        for (Livro livro : livros) {
            if (livro.getNome().contains(nome)) {
                livroPesquisa.add(livro);
            }
        }
        return livroPesquisa;
    }
    
    public ArrayList<Livro> getLivroByNomeAndAno(String nome, int ano){
        ArrayList<Livro> livroPesquisa = new ArrayList<Livro>();
        for (Livro livro : livros) {
            if (livro.getNome().contains(nome) && livro.getAno() == ano) {
                livroPesquisa.add(livro);
            }
        }
        return livroPesquisa;
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
