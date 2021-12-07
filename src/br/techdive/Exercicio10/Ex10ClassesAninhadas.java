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