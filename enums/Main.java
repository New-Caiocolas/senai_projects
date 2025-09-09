package org.example.enums;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("caio",Pedido.ABERTO);

        System.out.println(produto.toString());
    }
}
