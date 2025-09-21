package org.example.relacionamento;

public class Main{
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua A", "22","salvador");
        Cliente cliente1 = new Cliente("Marta",33,endereco);
        Cliente cliente2 = new Cliente("caio",23,
                new Endereco("Rua B","7","salvador"));

        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
    }
}
