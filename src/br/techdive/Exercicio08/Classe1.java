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
