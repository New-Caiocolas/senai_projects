package org.example.encapsulamento;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Produtos produtos = new Produtos("Mouse",20.0);

        //Atribuir valores.
        //cliente.setNome("caio");
        //cliente.setTelefone("71231223123");
        //produtos.setNome("flocão");
        //produtos.setPreco(7.50);

        System.out.println("O preço do " + produtos.getNome() + " está: "+ produtos.getPreco());

        //System.out.println("nome: "+ cliente.getNome());
        //System.out.println("tel: " + cliente.getTelefone());
    }
}
