package com.github.dhirabayashi.oshi;

import oshi.SystemInfo;

public class CPUSample {
    public static void main(String[] args) {
        var si = new SystemInfo();
        var hard = si.getHardware();
        var cpu = hard.getProcessor();
        System.out.println("PhysicalProccessorCount: " + cpu.getPhysicalProcessorCount());
        System.out.println("LogicalProcessorCount: " + cpu.getLogicalProcessorCount());
        System.out.println("Model: " + cpu.getModel());
        System.out.println("Name: " + cpu.getName());
        System.out.println("Identifier: " + cpu.getIdentifier());
        System.out.println("ProcessorID: " + cpu.getProcessorID());
        System.out.println("Stepping: " + cpu.getStepping());
        System.out.println("Vendor: " + cpu.getVendor());
        System.out.println("VendorFreq: " + cpu.getVendorFreq());
        System.out.println("ContextSwitches: " + cpu.getContextSwitches());
        System.out.println("SystemLoadAverage: " + cpu.getSystemLoadAverage());
    }
}
