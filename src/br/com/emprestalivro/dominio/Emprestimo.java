package br.com.emprestalivro.dominio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Emprestimo {

    private int id;
    private Usuario usuario;
    private Livro livro;

    private String dataSolicitacao;
    private String dataDevolucao;
    private final static long DIAS_EMPRESTIMO = 7;

    private DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Emprestimo() {
    }

    public Emprestimo(int id, Usuario usuario, Livro livro) {
        this.id = id;
        this.usuario = usuario;
        this.livro = livro;
        dataSolicitacao = LocalDateTime.now().format(format);
        dataDevolucao = LocalDateTime.now().plusDays(DIAS_EMPRESTIMO).format(format);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public String getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(String dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString() {
        return "Emprestimo nº:" + id +
                "\nSolicitante: " + usuario.getNomeCompleto() +
                "\nLivro Emprestado: " + livro.getNome() + " - " +livro.getAutor() +
                "\nData de Solicitacao: " + dataSolicitacao +
                "\nData de Devolução: " + dataDevolucao;
    }
}
