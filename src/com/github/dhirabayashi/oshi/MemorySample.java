package com.github.dhirabayashi.oshi;

import oshi.SystemInfo;

public class MemorySample {
    public static void main(String[] args) {
        var si = new SystemInfo();
        var hard = si.getHardware();
        var memory = hard.getMemory();
        System.out.println("SwapTotal: " + memory.getSwapTotal());
        System.out.println("Total: " + memory.getTotal());
        System.out.println("SwapUsed: " + memory.getSwapUsed());
        System.out.println("SwapPagesOut: " + memory.getSwapPagesOut());
        System.out.println("SwapPagesIn: " + memory.getSwapPagesIn());
        System.out.println("PageSize: " + memory.getPageSize());
        System.out.println("Available: " + memory.getAvailable());
    }
}
