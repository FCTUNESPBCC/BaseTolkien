/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package baseTolkien.Entidades;

import java.io.Serializable;

/**
 *
 * @author Danilo Medeiros Eler
 */
public class Config implements Serializable{
    private String pathArquivos = "/";
    private String arquivoLivros = "livros.dat";
    private String arquivoUsuarios = "usuarios.dat";
    private String arquivoEmprestimos = "emprestimos.dat";
    private String arquivoConfig = "config.dat";
    private int diasAluno = 10;
    private int diasProfessor = 20;
    private int codLivro = 0;
    private int codEmprestimo = 0;
    private int codUsuario = 0;

    public String getArquivoEmprestimos() {
        return arquivoEmprestimos;
    }

    public void setArquivoEmprestimos(String arquivoEmprestimos) {
        this.arquivoEmprestimos = arquivoEmprestimos;
    }

    public String getArquivoLivros() {
        return arquivoLivros;
    }

    public void setArquivoLivros(String arquivoLivros) {
        this.arquivoLivros = arquivoLivros;
    }

    public String getArquivoUsuarios() {
        return arquivoUsuarios;
    }

    public void setArquivoUsuarios(String arquivoUsuarios) {
        this.arquivoUsuarios = arquivoUsuarios;
    }

    public int getDiasAluno() {
        return diasAluno;
    }

    public void setDiasAluno(int diasAluno) {
        this.diasAluno = diasAluno;
    }

    public int getDiasProfessor() {
        return diasProfessor;
    }

    public void setDiasProfessor(int diasProfessor) {
        this.diasProfessor = diasProfessor;
    }

    public int getCodLivro() {
        return codLivro;
    }

    public void setCodLivro(int codLivro) {
        this.codLivro = codLivro;
    }

    public int getCodEmprestimo() {
        return codEmprestimo;
    }

    public void setCodEmprestimo(int codEmprestimo) {
        this.codEmprestimo = codEmprestimo;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getPathArquivos() {
        return pathArquivos;
    }

    public void setPathArquivos(String pathArquivos) {
        this.pathArquivos = pathArquivos;
    }

    public String getArquivoConfig() {
        return arquivoConfig;
    }

    public void setArquivoConfig(String arquivoConfig) {
        this.arquivoConfig = arquivoConfig;
    }
    
    
}
