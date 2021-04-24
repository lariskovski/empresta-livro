package br.com.emprestalivro.dominio;

import java.util.Scanner;

public class EmprestaLivro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome: ");
        String usuarioNome = scanner.nextLine();
        System.out.println("Data Nascimento dd/MM/yyyy: ");
        String usuarioDataNascimento = scanner.nextLine();
        System.out.println("Endereço: ");
        String usuarioEndereco = scanner.nextLine();
        Usuario user1 = new Usuario(0, usuarioNome, usuarioDataNascimento, usuarioEndereco);

        // Cria usuário teste
        //Usuario user1 = new Usuario(0, "Larissa", "25/12/1958", "Rua dos Bobos, 0");

        // Cria livro teste
        Livro livro1 = new Livro(0, "O Idiota","Dostoiévski" );
        Livro livro2 = new Livro(1, "Voltaire", "Cândido");

        // Cria empréstimo teste
        Emprestimo emprestimo1 = new Emprestimo(0, user1, livro1);
        Emprestimo emprestimo2 = new Emprestimo(2, user1, livro2);

        // Outputs dos toString
        System.out.println(emprestimo1);
    }
}
