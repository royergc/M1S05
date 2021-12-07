## Ex 07 - Final class sem final

Crie uma classe final e instancie um objeto sem utilizar a palavra reservada final

## Solução

O código está no meu [GitHub](https://github.com/royergc/M1S05), no pacote [Exercicio07](https://github.com/royergc/M1S05/tree/main/src/br/techdive/Exercicio07)

## Descrição

A ideia da classe final é que ela não pode ser estendida.
Porém, se eu criar uma classe com o construtor privado (utilizando a palavra **private** para o construtor), ela também não poderá ser estendida, se comportando como uma classe final.
Inclusive procurei um exemplo de onde isso é usado e na própria API da linguagem Java se utiliza construtor privado, como por exemplo na classe **Math** em *java.lang.Math*.
[Aqui](https://www.devmedia.com.br/utilizando-construtores-privados-em-classes-utilitarias-em-java/27918) tem uma breve explicação do uso de construtores privados em Java.

Bom, para resolver o exercício proposto, criei então uma classe **Ex07FinalClassPrivateConstructor** que não declarei como final.
Criei o construtor pra ela e o modifiquei como **private**, deixando a classe como privada sem usar a palavra **final**.

**Obs**: Porém, para instanciar um objeto dessa classe, eu tenho que desfazer isso, criando um segundo construtor público (do contrário não consigo instanciar).
Geralmente um construtor privado é utilizado apenas em classes que só possuem métodos estáticos (e não precisam ser instanciadas, portanto).

O código da classe *final* sem utilizar a palavra reservada *final* ficou assim:

```
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
```

Já o código da App que instancia um objeto dessa classe, ficou assim:

```
package br.techdive.Exercicio07;

public class Main {

    public static void main(String[] args) {
        
        Ex07FinalClassPrivateConstructor objetoInstanciado = new Ex07FinalClassPrivateConstructor("Instanciando objeto");

        objetoInstanciado.printMsg();
    }

}
```