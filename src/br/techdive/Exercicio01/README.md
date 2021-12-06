# Ex 01 - Começando

Crie uma classe que imprima no console:

- nome do sistema operacional
- capacidade de memória RAM
- memória RAM alocada
- memória RAM livre

# Solução

Iniciei procurando por classes e métodos da linguagem 
que fornecessem as informações sobre o sistema operacional e o uso da
memória. Cheguei então na 1a solução, utilizando os métodos **getProperty(key)** e 
**getRuntime().totalMemory** / **getRuntime().freeMemory()** das classes *System* e 
*Runtime* do módulo *java.lang*
Criei uma classe para encapsular esses dados, o código ficou assim:

```
public class SysInfo {

    private String osName;
    private long freeMemory;
    private long usedMemory;
    private long totalMemory;

    SysInfo() {
        osName = System.getProperty("os.name");
        totalMemory = Runtime.getRuntime().totalMemory();
        freeMemory = Runtime.getRuntime().freeMemory();
        usedMemory = totalMemory - freeMemory;
    }
    
    public String getOsName() {
        return osName;
    }
    
    public long getFreeMemory() {
        return freeMemory;
    }
    
    public long getUsedMemory() {
        return usedMemory;
    }
    
    public long getTotalMemory() {
        return totalMemory;
    }
}
```

Porém, ao testar o resultado, vi que as informações de memória eram referentes 
apenas ao "Sistema Java", ou seja, à memória gerenciada pela JVM.
Fui atrás então de uma solução que enxergasse a memória total do SO, além da JVM.
Encontrei uma solução com a classe **OperatingSystemMXBean**. 
Porém, essa classe só retorna as informações de memória na implementação da Oracle/Sun 
(ou seja, ela é dependente de plataforma, no caso, da JVM da Oracle). Isso fica evidente
pois ela está no módulo *com.sun.management*, ao invés de *java.management*).
[Aqui](https://docs.oracle.com/en/java/javase/17/docs/api/jdk.management/com/sun/management/OperatingSystemMXBean.html) está a documentação para essa classe. 
Essa segunda solução, ficou assim:

```
package br.techdive.Exercicio01;

import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;

public class SysInfo {

    private String osName;
    private long freeMemory;
    private long usedMemory;
    private long totalMemory;

    SysInfo() {
        OperatingSystemMXBean osMXBean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();        
        osName = osMXBean.getName();
        totalMemory = osMXBean.getTotalMemorySize();
        freeMemory = osMXBean.getFreeMemorySize();
        usedMemory = totalMemory - freeMemory;        
    }

    public String getOsName() {
        return osName;
    }

    public long getFreeMemory() {
        return freeMemory;
    }

    public long getUsedMemory() {
        return usedMemory;
    }

    public long getTotalMemory() {
        return totalMemory;
    }
}
```
Ainda encontrei uma maneira de fazer sem utilizar o pacote *com.sun.management* 
no fórum [StackOverflow](https://stackoverflow.com/questions/950754/how-do-i-find-the-physical-memory-size-in-java), 
utilizando a classe MBeanServer. Porém essa solução pareceu bem mais avançada e preferi não incluir código que não entendi
na resolução do exercício.

Pesquisando mais ainda, encontrei a solução que creio ser a mais recomendada para um projeto real:
utilizar uma biblioteca chamada [OSHI](https://github.com/oshi/oshi), que é uma biblioteca
especialmente criada para fornecer informação nativa sobre o Sistema Operacional, independente de plataforma.

A solução usando a biblioteca OSHI está totalmente descrita nesse [link](https://simplesolution.dev/java-get-physical-memory-ram-information-oshi-library/)

Porém, como o objetivo do exercício era apenas praticar a linguagem, acredito que toda a pesquisa e
as duas implementações anteriores já foram mais que suficiente.