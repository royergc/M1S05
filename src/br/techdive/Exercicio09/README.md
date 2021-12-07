## Ex09 - Ordem de inicialização

Crie uma classe com blocos de instância e static que executem código antes do construtor, que ao ser instanciada (chamar o new Exercicio9() ), deverá printar:

- “dentro do bloco static”
- “dentro do bloco de instância”
- “dentro do construtor”

## Solução

O código está no meu [GitHub](https://github.com/royergc/M1S05), no pacote [Exercicio09](https://github.com/royergc/M1S05/tree/main/src/br/techdive/Exercicio09)


## Descrição

A implementação desse exercício exige que se crie um bloco de inicialização, um bloco de inicialização *static* e um construtor.

O código ficou assim:

```
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

```

Para testar, criei uma classe Main que apenas instancia um objeto da classe Exercicio9: 
```
package br.techdive.Exercicio09;

public class Main {
    public static void main(String[] args) {
        Exercicio9 exercicio9 = new Exercicio9();
    }
}
```