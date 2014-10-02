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
        BD.biblioteca.salvarLivros();
    }
    public void recuperarLivros(){
        BD.biblioteca.recuperarLivros();
    }
    public void salvarUsuarios(){
        BD.biblioteca.salvarUsuarios();
    }
    public void recuperarUsuarios(){
        BD.biblioteca.recuperarUsuarios();
    }
    public void salvarEmprestimos(){
        BD.biblioteca.salvarEmprestimos();
    }
    public void recuperarEmprestimos(){
        BD.biblioteca.recuperarEmprestimos();
    }
}
