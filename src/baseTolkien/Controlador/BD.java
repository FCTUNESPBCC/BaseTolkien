/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package baseTolkien.Controlador;

import baseTolkien.Entidades.Aluno;
import baseTolkien.Entidades.Biblioteca;
import baseTolkien.Entidades.Emprestimo;
import baseTolkien.Entidades.Item;
import baseTolkien.Entidades.Livro;
import baseTolkien.Entidades.Professor;
import baseTolkien.Entidades.Relatorios.AlunoRelatorio;
import baseTolkien.Entidades.Relatorios.LivroRelatorio;
import baseTolkien.Entidades.Relatorios.ProfessorRelatorio;
import baseTolkien.Entidades.Usuario;
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
public class BD {
    public static Biblioteca biblioteca = new Biblioteca();
    
    public static void addAluno(Aluno aluno){
        biblioteca.addAluno(aluno);
    }
    
    public static void addProfessor(Professor professor){
        biblioteca.addProfessor(professor);
    }
    
    public static void addLivro(Livro livro){
        biblioteca.addLivro(livro);
    }
    
    public static ArrayList<LivroRelatorio> getAllLivros(){
        ArrayList<LivroRelatorio> livroPesquisa = new ArrayList<LivroRelatorio>();
        for (Livro livro: biblioteca.getAllLivros()) {
                livroPesquisa.add(
                            new LivroRelatorio(livro.getCodLivro(), livro.getNome(),livro.getDescricao(),
                            livro.getAno(), "", "", "", false));
            
        }
        return livroPesquisa;
    }
    
    public static ArrayList<LivroRelatorio> getAllLivrosOf(String codUsuario){
        ArrayList<LivroRelatorio> livroPesquisa = new ArrayList<LivroRelatorio>();
        Usuario usuarioEmprestimo = getUsuarioByCod(codUsuario);
        for(Emprestimo emprestimo: biblioteca.getAllEmprestimo()){
            if(emprestimo.getCodUsuario().equals(codUsuario)){
                for(Item item: emprestimo.getItens()){
                    Livro livroEmprestimo = getLivroByCod(item.getCodLivro());
                    livroPesquisa.add(
                            new LivroRelatorio(item.getCodLivro(), livroEmprestimo.getNome(),livroEmprestimo.getDescricao(),
                            livroEmprestimo.getAno(), usuarioEmprestimo.getCodUsuario(), usuarioEmprestimo.getNome(),
                            item.getDataDevolucao().toString(), item.isAtrasado()));
                }
            }
        }
        return livroPesquisa;
    }
    
    public static ArrayList<LivroRelatorio> getAllLivrosNaoDevolvidosOf(String codUsuario){
        ArrayList<LivroRelatorio> livroPesquisa = new ArrayList<LivroRelatorio>();
        Usuario usuarioEmprestimo = getUsuarioByCod(codUsuario);
        for(Emprestimo emprestimo: biblioteca.getAllEmprestimo()){
            if(emprestimo.getCodUsuario().equals(codUsuario)){
                for(Item item: emprestimo.getItens()){
                    if(!item.isDevolvido()){
                        Livro livroEmprestimo = getLivroByCod(item.getCodLivro());
                        livroPesquisa.add(
                            new LivroRelatorio(item.getCodLivro(), livroEmprestimo.getNome(),livroEmprestimo.getDescricao(),
                            livroEmprestimo.getAno(), usuarioEmprestimo.getCodUsuario(), usuarioEmprestimo.getNome(),
                            item.getDataDevolucao().toString(), item.isAtrasado()));
                    }
                }
            }
        }
        return livroPesquisa;
    }
    
    public static ArrayList<LivroRelatorio> getAllLivroDisponivel(){
        ArrayList<LivroRelatorio> livroPesquisa = new ArrayList<LivroRelatorio>();
        for (Livro livro: biblioteca.getAllLivros()) {
            if (!livro.isEmprestado()) {
                livroPesquisa.add(
                            new LivroRelatorio(livro.getCodLivro(), livro.getNome(),livro.getDescricao(),
                            livro.getAno(), "", "", "", false));
            }
        }
        return livroPesquisa;
    }
    
    public static ArrayList<LivroRelatorio> getAllLivroEmprestado(){
        ArrayList<LivroRelatorio> livroPesquisa = new ArrayList<LivroRelatorio>();
        for (Emprestimo emprestimo : biblioteca.getAllEmprestimo()){
            Usuario usuarioEmprestimo = getUsuarioByCod(emprestimo.getCodUsuario());
            for(Item item: emprestimo.getItens())
            if (!item.isDevolvido()){
                Livro livroEmprestimo = getLivroByCod(item.getCodLivro());
                        livroPesquisa.add(
                            new LivroRelatorio(item.getCodLivro(), livroEmprestimo.getNome(),livroEmprestimo.getDescricao(),
                            livroEmprestimo.getAno(), usuarioEmprestimo.getCodUsuario(), usuarioEmprestimo.getNome(),
                            item.getDataDevolucao().toString(), item.isAtrasado()));
            }
        }
        return livroPesquisa;
    }
    
    public static ArrayList<LivroRelatorio> getAllLivroAtrasado(){
        ArrayList<LivroRelatorio> livroPesquisa = new ArrayList<LivroRelatorio>();
        for (Emprestimo emprestimo : biblioteca.getAllEmprestimo()){
            Usuario usuarioEmprestimo = getUsuarioByCod(emprestimo.getCodUsuario());
            for(Item item: emprestimo.getItens())
            if (item.isAtrasado()){
                Livro livroEmprestimo = getLivroByCod(item.getCodLivro());
                        livroPesquisa.add(
                            new LivroRelatorio(item.getCodLivro(), livroEmprestimo.getNome(),livroEmprestimo.getDescricao(),
                            livroEmprestimo.getAno(), usuarioEmprestimo.getCodUsuario(), usuarioEmprestimo.getNome(),
                            item.getDataDevolucao().toString(), item.isAtrasado()));
            }
        }
        return livroPesquisa;
    }
    
    public static ArrayList<Usuario> getAllUsuarioComAtraso(){
        ArrayList<Usuario> usuarioPesquisa = new ArrayList<Usuario>();
        Usuario usuarioEmprestimo;
        for (Emprestimo emprestimo : biblioteca.getAllEmprestimo()) {
            for(Item item: emprestimo.getItens())
            if (item.isAtrasado()) {
                Usuario usuarioRelatorio = getUsuarioByCod(emprestimo.getCodUsuario());
                if(!usuarioPesquisa.contains(usuarioRelatorio)){
                    if(usuarioRelatorio instanceof Professor)
                        usuarioEmprestimo = new ProfessorRelatorio(usuarioRelatorio.getCodUsuario(), 
                                usuarioRelatorio.getNome(), ((Professor)usuarioRelatorio).getTitulacao(), usuarioRelatorio.getDiasEmprestimo(),
                                new ArrayList<LivroRelatorio>());
                    else
                        usuarioEmprestimo = new AlunoRelatorio(usuarioRelatorio.getCodUsuario(),
                                usuarioRelatorio.getNome(), ((Aluno)usuarioRelatorio).getCurso(), ((Aluno)usuarioRelatorio).getAno(),
                                usuarioRelatorio.getDiasEmprestimo(),
                                new ArrayList<LivroRelatorio>());
                    usuarioPesquisa.add(usuarioEmprestimo);
                }
                break;
            }
        }
        for(Usuario usuario: usuarioPesquisa){
            if(usuario instanceof ProfessorRelatorio){
                ((ProfessorRelatorio)usuario).setLivros(getAllLivrosNaoDevolvidosOf(usuario.getCodUsuario()));
            }
            else{
                ((AlunoRelatorio)usuario).setLivros(getAllLivrosNaoDevolvidosOf(usuario.getCodUsuario()));
            }
        }
        return usuarioPesquisa;
    }
    
    public static Usuario getUsuarioByCod(String codUsuario) {
        for (Usuario usuarioRelatorio : biblioteca.getAllUsuario()) {
            if(usuarioRelatorio.getCodUsuario().equals(codUsuario)){
                if(usuarioRelatorio instanceof ProfessorRelatorio)
                    return (new ProfessorRelatorio(usuarioRelatorio.getCodUsuario(), 
                                usuarioRelatorio.getNome(), ((Professor)usuarioRelatorio).getTitulacao(), usuarioRelatorio.getDiasEmprestimo(),
                                new ArrayList<LivroRelatorio>()));
                else return (new AlunoRelatorio(usuarioRelatorio.getCodUsuario(),
                                usuarioRelatorio.getNome(), ((Aluno)usuarioRelatorio).getCurso(), ((Aluno)usuarioRelatorio).getAno(),
                                usuarioRelatorio.getDiasEmprestimo(),
                                new ArrayList<LivroRelatorio>()));
            }
        }
        return null;
    }
    
    public static boolean existeUsuario(String codUsuario) {
        for (Usuario usuarioRelatorio : biblioteca.getAllUsuario()) {
            if(usuarioRelatorio.getCodUsuario().equals(codUsuario)){
                return true;
            }
        }
        return false;
    }

    public static Livro getLivroByCod(String codLivro) {
        Usuario user = null;
        for (Livro livro : biblioteca.getAllLivros()) {
            if(livro.getCodLivro().equals(codLivro)) {
                if(livro.isEmprestado()){
                    user = getUsuarioQueEmprestouLivro(livro.getCodLivro());
                }
                return (new LivroRelatorio(livro.getCodLivro(), livro.getNome(),livro.getDescricao(), livro.getAno(),
                        livro.isEmprestado()?user.getCodUsuario():"", livro.isEmprestado()?user.getNome():"", livro.isEmprestado()?getDataDevolucaoOf(livro.getCodLivro(), user.getCodUsuario()):"", false));
            }
        }
        return null;
    }
    
    public static boolean existeLivro(String codLivro) {
        Usuario user = null;
        for (Livro livro : biblioteca.getAllLivros()) {
            if(livro.getCodLivro().equals(codLivro)) {
                    return true;
            }
        }
        return false;
    }
    
    public static ArrayList<LivroRelatorio> getLivroByNome(String nome){
        ArrayList<LivroRelatorio> livroPesquisa = new ArrayList<LivroRelatorio>();
        Usuario user = null;
        for (Livro livro : biblioteca.getAllLivros()) {
            if (livro.getNome().contains(nome)) {
                if(livro.isEmprestado()){
                    user = getUsuarioQueEmprestouLivro(livro.getCodLivro());
                }
                livroPesquisa.add(new LivroRelatorio(livro.getCodLivro(), livro.getNome(),livro.getDescricao(), livro.getAno(),
                        livro.isEmprestado()?user.getCodUsuario():"", livro.isEmprestado()?user.getNome():"", livro.isEmprestado()?getDataDevolucaoOf(livro.getCodLivro(), user.getCodUsuario()):"", false));
            }
        }
        return livroPesquisa;
    }
    
    public static ArrayList<LivroRelatorio> getLivroByNomeAndAno(String nome, int ano){
        ArrayList<LivroRelatorio> livroPesquisa = new ArrayList<LivroRelatorio>();
        Usuario user = null;
        for (Livro livro : biblioteca.getAllLivros()) {
            if (livro.getNome().contains(nome) && livro.getAno() == ano) {
                if(livro.isEmprestado()){
                    user = getUsuarioQueEmprestouLivro(livro.getCodLivro());
                }
                livroPesquisa.add(new LivroRelatorio(livro.getCodLivro(), livro.getNome(),livro.getDescricao(), livro.getAno(),
                        livro.isEmprestado()?user.getCodUsuario():"", livro.isEmprestado()?user.getNome():"", livro.isEmprestado()?getDataDevolucaoOf(livro.getCodLivro(), user.getCodUsuario()):"", false));
            }
        }
        return livroPesquisa;
    }
    
    public static Usuario getUsuarioQueEmprestouLivro(String codLivro){
        for (Emprestimo emprestimo : biblioteca.getAllEmprestimo()){
            for(Item item: emprestimo.getItens())
            if (!item.isDevolvido()){
                if(codLivro.equals(item.getCodLivro()))
                    return getUsuarioByCod(codLivro);
            }
        }
        return null;
    }
    
    public static String getDataDevolucaoOf(String codLivro, String codUsuario){
        for (Emprestimo emprestimo : biblioteca.getAllEmprestimo()){
            if(codUsuario.equals(emprestimo.getCodUsuario())){
                for(Item item: emprestimo.getItens())
                    if (!item.isDevolvido()){
                        if(codLivro.equals(item.getCodLivro()))
                            return item.getDataDevolucao().toString();
                    }
            }
        }
        return null;
    }
    
    public static ArrayList<Usuario> getAllUsuario(){
        ArrayList<Usuario> usuarioPesquisa = new ArrayList<Usuario>();
        for (Usuario usuarioRelatorio : biblioteca.getAllUsuario()) {
            if(usuarioRelatorio instanceof Professor)
                usuarioPesquisa.add(new ProfessorRelatorio(usuarioRelatorio.getCodUsuario(), 
                                usuarioRelatorio.getNome(), ((Professor)usuarioRelatorio).getTitulacao(), usuarioRelatorio.getDiasEmprestimo(),
                                new ArrayList<LivroRelatorio>()));
            else
                usuarioPesquisa.add(new AlunoRelatorio(usuarioRelatorio.getCodUsuario(),
                                usuarioRelatorio.getNome(), ((Aluno)usuarioRelatorio).getCurso(), ((Aluno)usuarioRelatorio).getAno(),
                                usuarioRelatorio.getDiasEmprestimo(),
                                new ArrayList<LivroRelatorio>()));
            }
        for(Usuario usuario: usuarioPesquisa){
            if(usuario instanceof ProfessorRelatorio)
                ((ProfessorRelatorio)usuario).setLivros(getAllLivrosNaoDevolvidosOf(usuario.getCodUsuario()));
            else
                ((AlunoRelatorio)usuario).setLivros(getAllLivrosNaoDevolvidosOf(usuario.getCodUsuario()));
        }
        return usuarioPesquisa;
    }
    
    public static ArrayList<Usuario> getAllAluno(){
        ArrayList<Usuario> usuarioPesquisa = new ArrayList<Usuario>();
        for (Usuario usuarioRelatorio : biblioteca.getAllUsuario()) {
            if(usuarioRelatorio instanceof Professor)
                usuarioPesquisa.add(new AlunoRelatorio(usuarioRelatorio.getCodUsuario(),
                                usuarioRelatorio.getNome(), ((Aluno)usuarioRelatorio).getCurso(), ((Aluno)usuarioRelatorio).getAno(),
                                usuarioRelatorio.getDiasEmprestimo(),
                                new ArrayList<LivroRelatorio>()));
            }
        for(Usuario usuario: usuarioPesquisa){
                ((AlunoRelatorio)usuario).setLivros(getAllLivrosNaoDevolvidosOf(usuario.getCodUsuario()));
        }
        return usuarioPesquisa;
    }
    
    public static ArrayList<Usuario> getAllProfessor(){
        ArrayList<Usuario> usuarioPesquisa = new ArrayList<Usuario>();
        for (Usuario usuarioRelatorio : biblioteca.getAllUsuario()) {
            if(usuarioRelatorio instanceof Professor)
                usuarioPesquisa.add(new ProfessorRelatorio(usuarioRelatorio.getCodUsuario(), 
                                usuarioRelatorio.getNome(), ((Professor)usuarioRelatorio).getTitulacao(), usuarioRelatorio.getDiasEmprestimo(),
                                new ArrayList<LivroRelatorio>()));
            }
        for(Usuario usuario: usuarioPesquisa){
                ((ProfessorRelatorio)usuario).setLivros(getAllLivrosNaoDevolvidosOf(usuario.getCodUsuario()));
        }
        return usuarioPesquisa;
    }
    
        public static void salvarDados(String dados) {
            String nomeArquivo = "";
            if(dados.equals("Livros"))
                nomeArquivo = biblioteca.getConfiguracoes().getArquivoLivros();
            else if(dados.equals("Usuarios"))
                nomeArquivo = biblioteca.getConfiguracoes().getArquivoUsuarios();
            else if(dados.equals("Emprestimos"))
                nomeArquivo = biblioteca.getConfiguracoes().getArquivoEmprestimos();
            
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(nomeArquivo);
            oos = new ObjectOutputStream(fos);
            //oos.writeObject(this.livros);
            //ou salvar livro a livro
            Object obj = null;
            if(dados.equals("Livros")){
                obj = biblioteca.getAllLivros();
            }
            else if(dados.equals("Usuarios")){
                obj = biblioteca.getAllUsuario();
            }
            else if(dados.equals("Emprestimos")){
                obj = biblioteca.getAllEmprestimo();
            }
            oos.writeInt(((ArrayList<Object>) obj).size());
            for (Object objects:((ArrayList<Object>)obj)) {
                oos.writeObject(objects);
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

    public static void recuperarDados(String dados) {
        String nomeArquivo = "";
            if(dados.equals("Livros"))
                nomeArquivo = biblioteca.getConfiguracoes().getArquivoLivros();
            else if(dados.equals("Usuarios"))
                nomeArquivo = biblioteca.getConfiguracoes().getArquivoUsuarios();
            else if(dados.equals("Emprestimos"))
                nomeArquivo = biblioteca.getConfiguracoes().getArquivoEmprestimos();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(nomeArquivo);
            ois = new ObjectInputStream(fis);
            ///this.livros = (ArrayList<Livro>) ois.readObject();
            ///ou ler livro por livro do arquivo -- depende de como salvou
            Object lista = null;
            if(dados.equals("Livros")){
                lista = biblioteca.getAllLivros();
            }
            else if(dados.equals("Usuarios")){
                lista = biblioteca.getAllUsuario();
            }
            else if(dados.equals("Emprestimos")){
                lista = biblioteca.getAllEmprestimo();
            }
            ((ArrayList<Object>)lista).clear();
            int numItens = ois.readInt();
            for (int i=0; i<numItens; i++){
                Object obj= (Object) ois.readObject();
                ((ArrayList<Object>)lista).add(obj);
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
