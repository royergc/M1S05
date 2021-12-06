package br.techdive.Exercicio01;

import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;

public class SysInfo {

    private String osName;
    private long freeMemory;
    private long usedMemory;
    private long totalMemory;
    private long freeJVMMemory;
    private long totalJVMMemory;
    private long usedJVMMemory;

    SysInfo() {
        OperatingSystemMXBean osMXBean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        osName = osMXBean.getName();

        totalMemory = osMXBean.getTotalMemorySize();
        freeMemory = osMXBean.getFreeMemorySize();
        usedMemory = totalMemory - freeMemory;

        totalJVMMemory = Runtime.getRuntime().totalMemory();
        freeJVMMemory = Runtime.getRuntime().freeMemory();
        usedJVMMemory = totalJVMMemory - freeJVMMemory;
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

    public long getFreeJVMMemory() {
        return freeJVMMemory;
    }

    public long getUsedJVMMemory() {
        return usedJVMMemory;
    }

    public long getTotalJVMMemory() {
        return totalJVMMemory;
    }
}
