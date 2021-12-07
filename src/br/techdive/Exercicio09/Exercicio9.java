package br.techdive.Exercicio09;

public class Exercicio9 {

    static {
        System.out.println("Dentro do bloco static");

    }

    {
        System.out.println("Dentro do bloco de instancia");
    }

    Exercicio9() {
        System.out.println("Dentro do construtor");
    }
}
