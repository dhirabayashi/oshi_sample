package com.github.dhirabayashi.oshi;

import oshi.SystemInfo;

public class CPUSample {
    public static void main(String[] args) {
        SystemInfo si = new SystemInfo();
        var hard = si.getHardware();
        var cpu = hard.getProcessor();
        puts("PhysicalProccessorCount: " + cpu.getPhysicalProcessorCount());
        puts("LogicalProcessorCount: " + cpu.getLogicalProcessorCount());
        puts("Model: " + cpu.getModel());
        puts("Name: " + cpu.getName());
        puts("Identifier: " + cpu.getIdentifier());
        puts("ProcessorID: " + cpu.getProcessorID());
        puts("Stepping: " + cpu.getStepping());
        puts("Vendor: " + cpu.getVendor());
        puts("VendorFreq: " + cpu.getVendorFreq());
    }

    private static void puts(Object obj) {
        System.out.println(obj);
    }

    private static void puts() {
        System.out.println();
    }
}
