/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package baseTolkien.Controlador;

import baseTolkien.Entidades.Config;

/**
 *
 * @author Danilo Medeiros Eler
 */
public class Controlador {
    public Config getConfiguracoes(){
        return BD.biblioteca.getConfiguracoes();
    }
    public void salvarLivros(){
        BD.salvarDados("Livros");
    }
    public void recuperarLivros(){
        BD.recuperarDados("Livros");
    }
    public void salvarUsuarios(){
        BD.salvarDados("Usuarios");
    }
    public void recuperarUsuarios(){
        BD.recuperarDados("Usuarios");
    }
    public void salvarEmprestimos(){
        BD.salvarDados("Emprestimos");
    }
    public void recuperarEmprestimos(){
        BD.recuperarDados("Emprestimos");
    }
}
