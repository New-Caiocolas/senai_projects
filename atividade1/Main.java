package org.example.atividade1;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("livro1","murilo",300,19.99);
        Livro livro2 = new Livro("livro2","caio",157,12.99);

        System.out.println(livro.toString());
        System.out.println(livro2.toString());
    }
}
