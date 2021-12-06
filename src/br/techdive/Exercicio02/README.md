## Ex 02 - Aquecendo

Crie uma classe com 2 construtores, onde ao instanciar a classe, 
dentro do construtor deverá ser chamado outro

## Solução

O código está no meu [GitHub](https://github.com/royergc/M1S05), 
no pacote [Exercicio02](https://github.com/royergc/M1S05/tree/main/src/br/techdive/Exercicio02)

## Descrição

Esse exercício visava trabalhar o conceito de construtores, que são as funções 
chamadas ao se instanciar um objeto de uma classe.    
Podemos ter mais de um construtor, permitindo que se instancie um objeto de formas diferentes. 
Além disso, é possível que um construtor chame o outro construtor, para evitar repetição
de código, que é justamente a proposta desse exercício.   
Nesse caso, imaginei que mesmo que o construtor padrão seja chamado sem nenhum parâmetro,
fosse necessário sempre inicializar o objeto com uma mensagem padrão.    
Portanto, criei um segundo construtor que é chamado do construtor padrão e passa essa mensagem
padrão.

Criei a classe **Ex02Aquecendo** e o código ficou assim:

```
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
```


