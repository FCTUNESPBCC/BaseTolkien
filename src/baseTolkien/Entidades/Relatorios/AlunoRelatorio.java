/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baseTolkien.Entidades.Relatorios;

import baseTolkien.Entidades.Aluno;
import java.util.ArrayList;

/**
 *
 * @author Leonardo Dias
 */
public class AlunoRelatorio extends Aluno{
    
    ArrayList<LivroRelatorio> livros;

    public AlunoRelatorio(String codUsuario, String nome, String curso, int ano, int dias, ArrayList<LivroRelatorio> livros) {
        super(codUsuario, nome, curso, ano, dias);
        this.livros = livros;
    }

    public ArrayList<LivroRelatorio> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<LivroRelatorio> livros) {
        this.livros = livros;
    }
    
}
