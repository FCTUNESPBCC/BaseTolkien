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
import java.util.ArrayList;

/**
 *
 * @author Danilo Medeiros Eler
 */
public class BD {
    public static Biblioteca biblioteca = new Biblioteca();
    
    public ArrayList<LivroRelatorio> getAllLivrosOf(String codUsuario){
        ArrayList<LivroRelatorio> livroPesquisa = new ArrayList<LivroRelatorio>();
        Usuario usuarioEmprestimo = getUsuarioByCod(codUsuario);
        for(Emprestimo emprestimo: biblioteca.getAllEmprestimo()){
            if(emprestimo.getCodUsuario().equals(codUsuario)){
                for(Item item: emprestimo.getItens()){
                    Livro livroEmprestimo = getLivroByCod(item.getCodLivro());
                    livroPesquisa.add(
                            new LivroRelatorio(item.getCodLivro(), livroEmprestimo.getNome(),
                            livroEmprestimo.getAno(), usuarioEmprestimo.getCodUsuario(), usuarioEmprestimo.getNome(),
                            item.getDataDevolucao().toString(), item.isAtrasado()));
                }
            }
        }
        return livroPesquisa;
    }
    
    public ArrayList<LivroRelatorio> getAllLivrosNaoDevolvidosOf(String codUsuario){
        ArrayList<LivroRelatorio> livroPesquisa = new ArrayList<LivroRelatorio>();
        Usuario usuarioEmprestimo = getUsuarioByCod(codUsuario);
        for(Emprestimo emprestimo: biblioteca.getAllEmprestimo()){
            if(emprestimo.getCodUsuario().equals(codUsuario)){
                for(Item item: emprestimo.getItens()){
                    if(!item.isDevolvido()){
                        Livro livroEmprestimo = getLivroByCod(item.getCodLivro());
                        livroPesquisa.add(
                            new LivroRelatorio(item.getCodLivro(), livroEmprestimo.getNome(),
                            livroEmprestimo.getAno(), usuarioEmprestimo.getCodUsuario(), usuarioEmprestimo.getNome(),
                            item.getDataDevolucao().toString(), item.isAtrasado()));
                    }
                }
            }
        }
        return livroPesquisa;
    }
    
    public ArrayList<LivroRelatorio> getAllLivroDisponivel(){
        ArrayList<LivroRelatorio> livroPesquisa = new ArrayList<LivroRelatorio>();
        for (Livro livro: biblioteca.getAllLivros()) {
            if (!livro.isEmprestado()) {
                livroPesquisa.add(
                            new LivroRelatorio(livro.getCodLivro(), livro.getNome(),
                            livro.getAno(), "", "", "", false));
            }
        }
        return livroPesquisa;
    }
    
    public ArrayList<LivroRelatorio> getAllLivroEmprestado(){
        ArrayList<LivroRelatorio> livroPesquisa = new ArrayList<LivroRelatorio>();
        for (Emprestimo emprestimo : biblioteca.getAllEmprestimo()){
            Usuario usuarioEmprestimo = getUsuarioByCod(emprestimo.getCodUsuario());
            for(Item item: emprestimo.getItens())
            if (!item.isDevolvido()){
                Livro livroEmprestimo = getLivroByCod(item.getCodLivro());
                        livroPesquisa.add(
                            new LivroRelatorio(item.getCodLivro(), livroEmprestimo.getNome(),
                            livroEmprestimo.getAno(), usuarioEmprestimo.getCodUsuario(), usuarioEmprestimo.getNome(),
                            item.getDataDevolucao().toString(), item.isAtrasado()));
            }
        }
        return livroPesquisa;
    }
    
    public ArrayList<LivroRelatorio> getAllLivroAtrasado(){
        ArrayList<LivroRelatorio> livroPesquisa = new ArrayList<LivroRelatorio>();
        for (Emprestimo emprestimo : biblioteca.getAllEmprestimo()){
            Usuario usuarioEmprestimo = getUsuarioByCod(emprestimo.getCodUsuario());
            for(Item item: emprestimo.getItens())
            if (item.isAtrasado()){
                Livro livroEmprestimo = getLivroByCod(item.getCodLivro());
                        livroPesquisa.add(
                            new LivroRelatorio(item.getCodLivro(), livroEmprestimo.getNome(),
                            livroEmprestimo.getAno(), usuarioEmprestimo.getCodUsuario(), usuarioEmprestimo.getNome(),
                            item.getDataDevolucao().toString(), item.isAtrasado()));
            }
        }
        return livroPesquisa;
    }
    
    public ArrayList<Usuario> getAllUsuarioComAtraso(){
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
    
    public Usuario getUsuarioByCod(String codUsuario) {
        for (Usuario usuarioRelatorio : biblioteca.getAllUsuario()) {
            if(usuarioRelatorio.getCodUsuario()==codUsuario){
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

    public Livro getLivroByCod(String codLivro) {
        Usuario user = null;
        for (Livro livro : biblioteca.getAllLivros()) {
            if(livro.getCodLivro()==codLivro) {
                if(livro.isEmprestado()){
                    user = getUsuarioQueEmprestouLivro(livro.getCodLivro());
                }
                return (new LivroRelatorio(livro.getCodLivro(), livro.getNome(), livro.getAno(),
                        livro.isEmprestado()?user.getCodUsuario():"", livro.isEmprestado()?user.getNome():"", livro.isEmprestado()?getDataDevolucaoOf(livro.getCodLivro(), user.getCodUsuario()):"", false));
            }
        }
        return null;
    }
    
    public ArrayList<LivroRelatorio> getLivroByNome(String nome){
        ArrayList<LivroRelatorio> livroPesquisa = new ArrayList<LivroRelatorio>();
        Usuario user = null;
        for (Livro livro : biblioteca.getAllLivros()) {
            if (livro.getNome().contains(nome)) {
                if(livro.isEmprestado()){
                    user = getUsuarioQueEmprestouLivro(livro.getCodLivro());
                }
                livroPesquisa.add(new LivroRelatorio(livro.getCodLivro(), livro.getNome(), livro.getAno(),
                        livro.isEmprestado()?user.getCodUsuario():"", livro.isEmprestado()?user.getNome():"", livro.isEmprestado()?getDataDevolucaoOf(livro.getCodLivro(), user.getCodUsuario()):"", false));
            }
        }
        return livroPesquisa;
    }
    
    public ArrayList<LivroRelatorio> getLivroByNomeAndAno(String nome, int ano){
        ArrayList<LivroRelatorio> livroPesquisa = new ArrayList<LivroRelatorio>();
        Usuario user = null;
        for (Livro livro : biblioteca.getAllLivros()) {
            if (livro.getNome().contains(nome) && livro.getAno() == ano) {
                if(livro.isEmprestado()){
                    user = getUsuarioQueEmprestouLivro(livro.getCodLivro());
                }
                livroPesquisa.add(new LivroRelatorio(livro.getCodLivro(), livro.getNome(), livro.getAno(),
                        livro.isEmprestado()?user.getCodUsuario():"", livro.isEmprestado()?user.getNome():"", livro.isEmprestado()?getDataDevolucaoOf(livro.getCodLivro(), user.getCodUsuario()):"", false));
            }
        }
        return livroPesquisa;
    }
    
    public Usuario getUsuarioQueEmprestouLivro(String codLivro){
        for (Emprestimo emprestimo : biblioteca.getAllEmprestimo()){
            for(Item item: emprestimo.getItens())
            if (!item.isDevolvido()){
                if(codLivro == item.getCodLivro())
                    return getUsuarioByCod(codLivro);
            }
        }
        return null;
    }
    
    public String getDataDevolucaoOf(String codLivro, String codUsuario){
        for (Emprestimo emprestimo : biblioteca.getAllEmprestimo()){
            if(codUsuario==emprestimo.getCodUsuario()){
                for(Item item: emprestimo.getItens())
                    if (!item.isDevolvido()){
                        if(codLivro == item.getCodLivro())
                            return item.getDataDevolucao().toString();
                    }
            }
        }
        return null;
    }
    
    public ArrayList<Usuario> getAllUsuario(){
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
    
    public ArrayList<Usuario> getAllAluno(){
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
    
    public ArrayList<Usuario> getAllProfessor(){
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
}
