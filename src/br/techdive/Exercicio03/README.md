## Ex 03 - Dominando o basico

Crie uma classe com o método main que:

- Utilize qualquer atributo ou método de classe sem utilizar objetos (static)
- Devem ser pelo atributos e métodos static de 3 classes diferentes
- Escolha classes do pacote java.util (ex: Calendar, Locale e Currency)
- Utilize import static

## Solução

O código está no meu [GitHub](https://github.com/royergc/M1S05),
no pacote [Exercicio03](https://github.com/royergc/M1S05/tree/main/src/br/techdive/Exercicio03)

## Descrição

Para encontrar métodos e atributos estáticos no pacote *java.util*, fui até a [documentação desse pacote](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/package-summary.html)
Escolhi então :
- getDefault() (de java.util.Locale.getDefault)
- getInstance() (de java.util.Currency.getInstance)
- getAvailableCurrencies() (de java.util.Currency.getAvailableCurrencies)

Assim, a implementação do exercício consistiu apenas em importar esses métodos de forma estática, usando *import static* e chamar os mesmos dentro do main da minha classe.
O código ficou assim: 

```
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
```
