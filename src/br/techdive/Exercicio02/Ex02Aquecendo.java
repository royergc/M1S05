package br.techdive.Exercicio02;

public class Ex02Aquecendo {
    private String construtorHello;

    Ex02Aquecendo(){
        this("Esse eh o 2o construtor, que recebe uma String como parametro");
    }

    Ex02Aquecendo(String construtorHello) {
        this.construtorHello = construtorHello;
        System.out.println(construtorHello);
    }

    public static void main(String[] args) {
        System.out.println("Chamando construtor padrão");
        Ex02Aquecendo aquecendo = new Ex02Aquecendo();
    }
}
