package br.techdive.Exercicio07;

public class Ex07FinalClassPrivateConstructor {

    private String msgDoObjeto;

    private Ex07FinalClassPrivateConstructor() {
        // Construtor privado que garante que a classe não possa ser estendida - mesmo comportamento de declarar a classe como "final"
    }

    public Ex07FinalClassPrivateConstructor(String msg) {
        // Construtor publico, para permitir se instanciar um objeto da classe -
        // geralmente classe com construtor privado só possui métodos estáticos e não se intancia objetos
        // Mas como o exercício pediu para instanciar um objeto, é necessário se criar um construtor público
        this.msgDoObjeto = msg;
    }

    public void printMsg() {
        System.out.println(this.msgDoObjeto);
        System.out.println("Foi impressa msg passada na criação do objeto com o método printMsg() ");
    }
}
