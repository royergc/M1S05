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
