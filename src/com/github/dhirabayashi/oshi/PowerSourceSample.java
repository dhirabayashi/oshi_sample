package com.github.dhirabayashi.oshi;

import oshi.SystemInfo;

public class PowerSourceSample {
    public static void main(String[] args) {
        var si = new SystemInfo();
        var hard = si.getHardware();
        var powerSources = hard.getPowerSources();
        for(var powerSource : powerSources) {
            System.out.println(powerSource.getName());
            System.out.println(powerSource.getRemainingCapacity());
            System.out.println(powerSource.getTimeRemaining());
        }
    }
}
