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

