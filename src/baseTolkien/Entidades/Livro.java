/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package baseTolkien.Entidades;

import java.io.Serializable;
import baseTolkien.Controlador.BD;

/**
 *
 * @author Danilo Medeiros Eler
 */
public class Livro implements Serializable{
    private String codLivro;
    private String nome;
    private String descricao;
    private int ano;
    private boolean emprestado;

    public Livro(String codLivro, String nome,String descricao, int ano) {
        this.codLivro = codLivro;
        this.nome = nome;
        this.ano = ano;
        this.descricao = descricao;
        this.emprestado = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCodLivro() {
        return codLivro;
    }

    public void setCodLivro(String codLivro) {
        this.codLivro = codLivro;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public void emprestar(){
        this.setEmprestado(true);
    }

    public void devolver(){
        this.setEmprestado(false);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String toString(){
        return this.nome;
    }
    
}
