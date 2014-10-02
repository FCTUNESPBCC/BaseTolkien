/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baseTolkien.Entidades.Relatorios;

import baseTolkien.Entidades.Livro;

/**
 *
 * @author Leonardo Dias
 */
public class LivroRelatorio extends Livro{

    private String codUsuario;
    private String nomeUsuario;
    private boolean atrasado;
    private String dataDevolucao;
    
    public LivroRelatorio(String codLivro, String nome, int ano, String codUsuario, String nomeUsuario, String dataDevolucao, boolean atrasado) {
        super(codLivro, nome, ano);
        this.codUsuario = codUsuario;
        this.nomeUsuario = nomeUsuario;
        this.dataDevolucao = dataDevolucao;
        this.atrasado = atrasado;
    }

    public String getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public boolean isAtrasado() {
        return atrasado;
    }

    public void setAtrasado(boolean atrasado) {
        this.atrasado = atrasado;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    
    
    
}
