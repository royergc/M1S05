## Ex 06 - abstract class sem extends

Crie uma classe abstrata e instancie um objeto sem usar a palavra reservada extends


## Solução

O código está no meu [GitHub](https://github.com/royergc/M1S05), no pacote [Exercicio06](https://github.com/royergc/M1S05/tree/main/src/br/techdive/Exercicio06)


## Descrição

Uma classe abstrata não implementa os métodos, definindo apenas suas assinaturas e retornos (assim como nas interfaces), para que sejam implementados posteriormente.
Uma forma de implementar os métodos da classe abstrata é herdando os metódos dessa classe - a palavra *extends* permite isso.
Porém, o exercício pede que se faça isso sem herança e sem a palavra *extends*.
Isso é possível, através de um mecanismo em que se define o método enquanto se instancia o objeto da classe abstrata (ou seja, quando se usa o *new*).

O código da classe abstrata ficou assim:
```
package br.techdive.Exercicio06;

public abstract class ClasseAbstrata {
    
    public abstract void metodoAbstrato();
    
}

```

O código da classe que instancia o objeto a partir da classe abstrata ficou assim:
```
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
```
P.s: o **@Override** eu não conhecia, depois aprendi que é um Java annotation, foi adicionado automaticamente pelo intelliJ

