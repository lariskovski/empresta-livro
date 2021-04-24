package br.com.emprestalivro.dominio;

public class Livro {

    private int id;
    private String nome;
    private String autor;

    public Livro(int id, String nome, String autor) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
