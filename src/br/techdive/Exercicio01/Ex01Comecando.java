package br.techdive.Exercicio01;

public class Ex01Comecando {

    public static void main(String[] args) {
        SysInfo info = new SysInfo();

        System.out.println("Dados do sistema:");

        System.out.println("Systema operacional: " + info.getOsName());

        System.out.printf("Memoria total do sistema: %.2f GB%n", (double) info.getTotalMemory()/1024/1024/1024);
        System.out.printf("Memoria utilizada: %.2f GB %n", (double) info.getUsedMemory()/1024/1024/1024);
        System.out.printf("Memoria livre: %.2f GB %n", (double) info.getFreeMemory()/1024/1024/1024);

        System.out.printf("Memoria total para a JVM: %.2f MB %n", (double) info.getTotalJVMMemory()/1024/1024);
        System.out.printf("Memoria utilizada na JVM: %.2f MB %n", (double) info.getUsedJVMMemory()/1024/1024);
        System.out.printf("Memoria livre na JVM: %.2f MB %n", (double) info.getFreeJVMMemory()/1024/1024);
    }
}
