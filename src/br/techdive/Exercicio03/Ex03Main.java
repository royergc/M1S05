package br.techdive.Exercicio03;

import static java.util.Locale.getDefault;
import static java.util.Locale.ITALY;
import static java.util.Currency.getInstance;
import static java.util.Currency.getAvailableCurrencies;


public class Ex03Main {

    public static void main(String[] args) {

        System.out.println(getDefault());
        System.out.println(ITALY);
        System.out.println(getInstance(ITALY));
        System.out.println(getAvailableCurrencies());
    }
}
