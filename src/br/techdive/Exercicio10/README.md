## Ex10 - Classes aninhadas

Crie uma classe com:

- 1 classe interna
- 1 classe interna static
- 1 classe interna local (dentro de um método)
- 1 classe interna anônima
- instancie 1 objeto de cada classe interna criada

## Solução

O código está no meu [GitHub](https://github.com/royergc/M1S05), no pacote [Exercicio10](https://github.com/royergc/M1S05/tree/main/src/br/techdive/Exercicio10)

## Descrição
Criei a classe externa com o nome **EX10ClassesAninhadas**.
Dentro dessa classe, criei uma classe interna **ClasseInterna**, com um método chamado **metodoInterno(String novaMsgInterna)**, uma classe interna estática **ClasseInternaEstatica**,   
uma classe interna local **ClasseInternaLocal** que criei dentro do método **metodoClasseLocal()**.   
No mesmo arquivo, criei uma classe anonima **ClasseAnonima** que redefiniu o método **metodoClasseLocal()**.   

O código com o arquivo das classes aninhadas ficou assim:
```
package br.techdive.Exercicio10;

public class Ex10ClassesAninhadas {

    public Ex10ClassesAninhadas() {
        System.out.println("Instanciando objeto da classe externa");
    }

    class ClasseInterna {
        // Atributo da classe interna
        private String msgInterna;

        // Construtor da classe interna
        ClasseInterna() {
            this.msgInterna = "Instanciando objeto da classe interna";
            System.out.println(this.msgInterna);
        }

        // Metood da classe interna
        public void metodoInterno(String novaMsgInterna) {
            this.msgInterna = novaMsgInterna;
            System.out.println(this.msgInterna);
        }
    }

    public static class ClasseInternaEstatica {
        ClasseInternaEstatica() {
            System.out.println("Instanciando objeto da classe interna estatica ");
        }

    }

    public void metodoClasseLocal() {
        class ClasseInternaLocal {
            private String msgInternaLocal;

            ClasseInternaLocal() {
                System.out.println("Instanciado objeto da classe interna local");
            }
        }

        new ClasseInternaLocal();
    }
}

class ClasseAnonima {
    Ex10ClassesAninhadas classeExterna = new Ex10ClassesAninhadas() {
        public void metodoClasseLocal() {
            System.out.println("Instanciada classe anonima");
        }
    };
}
```

Criei então uma classe Main para instanciar os objetos de cada classe, conforme pedia o exercício.   
Por questão de clareza, deixei comentado antes de cada instanciaçaõ o que eu estava fazendo.
O código ficou assim:
```
package br.techdive.Exercicio10;

public class Main {
    public static void main(String[] args) {

        // Instanciado objeto da classe externa
        Ex10ClassesAninhadas classeExterna = new Ex10ClassesAninhadas();

        // Instanciando objeto da classe interna
        Ex10ClassesAninhadas.ClasseInterna classeInterna = classeExterna.new ClasseInterna();
        // Acessando método da classe interna
        classeInterna.metodoInterno("Utilizando método da classe interna");

        // Instanciando objeto da classe interna estática
        Ex10ClassesAninhadas.ClasseInternaEstatica classeInternaEstatica = new Ex10ClassesAninhadas.ClasseInternaEstatica();

        // Instanciando objeto da classe interna local
        classeExterna.metodoClasseLocal();

        // instanciando objeto da classe anônima
        ClasseAnonima classeAnonima = new ClasseAnonima();
        classeAnonima.classeExterna.metodoClasseLocal();
    }
}
```

A saída do programa ficou:
```
Instanciando objeto da classe externa
Instanciando objeto da classe interna
Utilizando método da classe interna
Instanciando objeto da classe interna estatica 
Instanciado objeto da classe interna local
Instanciando objeto da classe externa
Instanciada classe anonima
```

