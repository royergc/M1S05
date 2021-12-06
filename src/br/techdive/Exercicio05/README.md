## Ex 05 - Pacotes

Crie 2 pacotes diferentes com 1 classe em cada, onde:

- a classe do pacote-um consiga acessar um método da classe do pacote-dois (usando objeto)
- a classe do pacote-um consiga acessar um método da classe do pacote-dois (usando static)

## Solução

O código está no meu [GitHub](https://github.com/royergc/M1S05), no pacote [Exercicio05](https://github.com/royergc/M1S05/tree/main/src/br/techdive/Exercicio05)

## Descrição

O enunciado deixou bem claro o que deveria ser feito e a implementação foi bem direta.

Criei dois pacotes, um chamado *PacoteUm* e outro chamado *PacoteDois*.
Dentro do *PacoteUm* criei a classe *ClasseUm*, dentro do *PacoteDois* criei a classe *ClasseDois*.

Na *ClasseDois* criei dois métodos, um estático chamado *metodoEstatico()* (que é da classe, não precisa de objeto para ser acessado)
e outro método comum chamado *primeiroMetodo*, que só é acessado quando se instancia um objeto da classe.

Na *ClasseUm* chamei o método estático diretamente, depois instanciei um objeto do tipo ClasseDois e chamei o *primeiroMetodo* desse objeto.
Para que a *ClasseUm* pudesse enxergar a *ClasseDois*, importei o *PacoteDois* nela.

O código ficou assim:

**Classe2** (do *PacoteDois*):

```
package br.techdive.Exercicio05.PacoteDois;

public class ClasseDois {

    public void primeiroMetodo() {
        System.out.println("Acessando método via objeto");
    }

    public static void metodoEstatico() {
        System.out.println("Acessando método estatico");
    }
}
```

**ClasseUm** (do *PacoteUm*):
```
package br.techdive.Exercicio05.PacoteUm;


import br.techdive.Exercicio05.PacoteDois.ClasseDois;

public class ClasseUm {
    public static void main(String[] args) {
        ClasseDois.metodoEstatico();

        ClasseDois objClasse2 = new ClasseDois();
        objClasse2.primeiroMetodo();
        
    }
}
```
