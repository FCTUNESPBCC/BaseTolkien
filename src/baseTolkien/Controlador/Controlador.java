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
}
