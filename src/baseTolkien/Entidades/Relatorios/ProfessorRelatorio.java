/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baseTolkien.Entidades.Relatorios;

import baseTolkien.Entidades.Professor;
import java.util.ArrayList;

/**
 *
 * @author Leonardo Dias
 */
public class ProfessorRelatorio extends Professor{
    
    ArrayList<LivroRelatorio> livros;

    public ProfessorRelatorio(String codUsuario, String nome, String titulacao, int dias, ArrayList<LivroRelatorio> livros) {
        super(codUsuario, nome, titulacao, dias);
        this.livros = livros;
    }

    public ArrayList<LivroRelatorio> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<LivroRelatorio> livros) {
        this.livros = livros;
    }
    
    

    
}
