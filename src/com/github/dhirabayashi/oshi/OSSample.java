package com.github.dhirabayashi.oshi;

import oshi.SystemInfo;

public class OSSample {
    public static void main(String[] args) {
        SystemInfo si = new SystemInfo();
        var os = si.getOperatingSystem();
        puts("Version: " + os.getVersion().getVersion());
        puts("Family: " + os.getFamily());
        puts("Manufacturer: " + os.getManufacturer());
        puts("Bitness: " + os.getBitness());
    }

    private static void puts(Object obj) {
        System.out.println(obj);
    }
}
