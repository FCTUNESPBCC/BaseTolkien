/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package baseTolkien.Entidades;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author Danilo Medeiros Eler
 */
public class Item implements Serializable{
    private String codEmprestimo;
    private String codLivro;
    private Calendar dataDevolucao;
    private boolean devolvido = false;

    
    public Item(String codEmprestimo, String codLivro) {
        this.codEmprestimo = codEmprestimo;
        this.codLivro = codLivro;
        //a data de devolução é atribuida na devolução do livro,
        //não é passada no construtor
        this.dataDevolucao = null;
    }

    public Calendar getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Calendar dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getCodEmprestimo() {
        return codEmprestimo;
    }

    public void setCodEmprestimo(String codEmprestimo) {
        this.codEmprestimo = codEmprestimo;
    }

    public String getCodLivro() {
        return codLivro;
    }

    public void setCodLivro(String codLivro) {
        this.codLivro = codLivro;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void devolver() {
        this.devolvido = true;
    }
    
    public boolean isAtrasado(){
        if(this.dataDevolucao.after(Calendar.getInstance()))
            return true;
        return false;
    }
    
    
    
}
