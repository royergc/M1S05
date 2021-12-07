package br.techdive.Exercicio08;

public class Classe2 {
    public static void main(String[] args) {
        Classe1 objClasse1 = new Classe1();

        System.out.println(objClasse1.getAtributoPrivado());
        objClasse1.setAtributoPrivado("Atributo privado modificado");
        System.out.println(objClasse1.getAtributoPrivado());
    }
}
