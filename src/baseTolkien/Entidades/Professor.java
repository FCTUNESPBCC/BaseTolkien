/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package baseTolkien.Entidades;

/**
 *
 * @author Danilo Medeiros Eler
 */
public class Professor extends Usuario{    
    protected String titulacao;

    public Professor(String codUsuario, String nome, String titulacao, int dias) {
        super(codUsuario, nome, dias); //emprestimo por X dias
        this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}
