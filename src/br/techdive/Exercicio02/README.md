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
Nesse caso, imaginei um construtor padrão que fizesse algumas inicializações básicas no objeto
e um segundo construtor que pudesse receber mais parâmetros, mas que também precisasse das inicalizações
padrão do primeiro construtor.
Portanto, dentro desse segundo construtor eu chamo o primeiro construtor.

Criei a classe **Ex02Aquecendo** e o código ficou assim:

```
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
```


