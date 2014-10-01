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
    private String arquivoLivros = ".\\livros.dat";
    private String arquivoUsuarios = ".\\usuarios.dat";
    private String arquivoEmprestimos = ".\\emprestimos.dat";
    private int diasAluno = 10;
    private int diasProfessor = 20;
    private static int codLivro = 0;
    private static int codEmprestimo = 0;
    private static int codUsuario = 0;

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

    public static int getCodLivro() {
        return codLivro;
    }

    public static void setCodLivro(int codLivro) {
        Config.codLivro = codLivro;
    }

    public static int getCodEmprestimo() {
        return codEmprestimo;
    }

    public static void setCodEmprestimo(int codEmprestimo) {
        Config.codEmprestimo = codEmprestimo;
    }

    public static int getCodUsuario() {
        return codUsuario;
    }

    public static void setCodUsuario(int codUsuario) {
        Config.codUsuario = codUsuario;
    }
}
