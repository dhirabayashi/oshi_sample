package com.github.dhirabayashi.oshi;

import oshi.SystemInfo;

public class MemorySample {
    public static void main(String[] args) {
        SystemInfo si = new SystemInfo();
        var hard = si.getHardware();
        var memory = hard.getMemory();
        puts("SwapTotal: " + memory.getSwapTotal());
        puts("Total: " + memory.getTotal());
        puts("SwapUsed: " + memory.getSwapUsed());
        puts("SwapPagesOut: " + memory.getSwapPagesOut());
        puts("SwapPagesIn: " + memory.getSwapPagesIn());
        puts("PageSize: " + memory.getPageSize());
        puts("Available: " + memory.getAvailable());
    }

    private static void puts(Object obj) {
        System.out.println(obj);
    }

    private static void puts() {
        System.out.println();
    }
}
