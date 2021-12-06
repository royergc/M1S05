
package br.techdive.Exercicio06;

public class ClasseImplementadora {

    public static void main(String[] args) {
        ClasseAbstrata objetoInstanciado = new ClasseAbstrata() {
            @Override
            public void metodoAbstrato() {

                System.out.println("Implementando o método abstrato durante a criação do objeto");
            }
        };

        objetoInstanciado.metodoAbstrato();
    }
}
