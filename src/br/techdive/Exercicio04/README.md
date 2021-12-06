## Ex 04 - Inicializacao Tardia

Faça a seguinte classe compilar:

class FinalAttributes {   
**private final int** _FINAL_ATTRIBUTE1_;   
**private final static int** _FINAL_ATTRIBUTE2_;

    // seu código aqui
}

## Solução

O código está no meu [GitHub](https://github.com/royergc/M1S05), no pacote [Exercicio04](https://github.com/royergc/M1S05/tree/main/src/br/techdive/Exercicio04)

## Descrição

Vimos na aula que toda classe pode conter um bloco de inicialização (criado apenas com as chaves *{}* ) 
que é executado sempre ao se inicializar um objeto, antes do construtor, e também um bloco de inicialização estática (
criado apenas com *static{}*).
 
Assim, para a classe compilar, como se tratam de dois atributos com o modificador **final**, os mesmos precisam obrigatoriamente ser inicializados.
Além disso, o _FINAL_ATTRIBUTE2_ é, além de *final*, também *static*, ou seja, precisa ser inicializado no bloco estático, já que é um atributo de classe.
Portanto, fiz a inicialização do _FINAL_ATTRIBUTE2_ no bloco estático e a inicialização do _FINAL_ATTRIBUTE1_ no construtor (já que o Lint recomenda evitar usar o bloco de inicialização não estático e utilizar o construtor no lugar dele, sempre que possível)

O código ficou assim:

```
package br.techdive.Exercicio04;

public class FinalAttributes {
    private final int _FINAL_ATTRIBUTE1_;
    private final static int _FINAL_ATTRIBUTE2_;

    static{
        _FINAL_ATTRIBUTE2_ = 2;
    }

    FinalAttributes() {
        _FINAL_ATTRIBUTE1_ = 1;
        System.out.println("Classe instanciada e constantes inicializadas!");
    }

    public static void main(String[] args) {
        FinalAttributes objetoCompilado = new FinalAttributes();

        System.out.println("Final attribute1 = " + objetoCompilado._FINAL_ATTRIBUTE1_);
        System.out.println("Final attribute2 = " + _FINAL_ATTRIBUTE2_);
    }
}
```