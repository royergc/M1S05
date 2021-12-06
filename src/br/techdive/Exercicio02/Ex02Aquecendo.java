package br.techdive.Exercicio02;

public class Ex02Aquecendo {
    private int numInicializacao;
    private String stringInicializacao;

    private String stringAdicional;

    Ex02Aquecendo(){
        numInicializacao = 0;
        stringInicializacao = "Construtor padrao - Inicializacao basica";
        System.out.println("numInicializacao iniciado com " + numInicializacao);
        System.out.println(stringInicializacao);
    }

    Ex02Aquecendo(String stringAdicional) {
        this();
        this.stringAdicional = stringAdicional;
        System.out.println("Construtor secundário - " + stringAdicional);
    }

    public static void main(String[] args) {
        System.out.println("Chamando construtor adicional que chama construtor padrao");
        Ex02Aquecendo ex02 = new Ex02Aquecendo("inicializacao adicional");
    }
}
