/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package baseTolkien.Entidades;

/**
 *
 * @author Danilo Medeiros Eler
 */
public class Aluno extends Usuario {
    protected String curso;
    protected int ano;
    
    public Aluno(String codUsuario, String nome, String curso, int ano, int dias) {
        super(codUsuario, nome, dias); //emprestimo por X dias
        this.curso = curso;
        this.ano = ano;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }   
}
