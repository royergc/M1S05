## Ex 08 - Usando private e public

Crie 2 classes, sendo:

- uma classe (Classe1) com 1 atributo privado e 1 método public
- uma classe (Classe2) que consiga modificar o atributo privado de Classe1 através do método public

## Solução

O código está no meu [GitHub](https://github.com/royergc/M1S05), no pacote [Exercicio08](https://github.com/royergc/M1S05/tree/main/src/br/techdive/Exercicio08)


## Descrição

A implementação desse exercício é bem direta. 
Criei uma classe chamada **Classe1** e nela criei um atributo do tipo String chamado **atributoPrivado** e um método publico chamado **setAtributoPrivado(String atributoPrivado)**.   
Depois criei uma classe chamada **Classe2** que instancia um objeto da **Classe1** e consegue modificar o **atributoPrivado**, atraves do método **setAtributoPrivado(String atributoPrivado)**.   
Para ficar claro que a modificaçaõ foi feita, criei também um método público ***getAtributoPrivado** e fiz a leitura do atributoPrivado e imprimi no console antes e depois de modificar o atributo.

O código da Classe1 ficou assim:

```
package br.techdive.Exercicio08;

public class Classe1 {
    private String atributoPrivado;

    Classe1() {
        atributoPrivado = "Atributo privado original";
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
    
    public String getAtributoPrivado() {
        return this.atributoPrivado;
    }
}
```
O código da Classe2 ficou assim:
```
package br.techdive.Exercicio08;

public class Classe2 {
    public static void main(String[] args) {
        Classe1 objClasse1 = new Classe1();

        System.out.println(objClasse1.getAtributoPrivado());
        objClasse1.setAtributoPrivado("Atributo privado modificado");
        System.out.println(objClasse1.getAtributoPrivado());
    }
}
``` 