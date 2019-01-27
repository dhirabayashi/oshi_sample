package com.github.dhirabayashi.oshi;

import oshi.SystemInfo;

public class OSSample {
    public static void main(String[] args) {
        var si = new SystemInfo();
        var os = si.getOperatingSystem();
        System.out.println("Version: " + os.getVersion().getVersion());
        System.out.println("Family: " + os.getFamily());
        System.out.println("Manufacturer: " + os.getManufacturer());
        System.out.println("Bitness: " + os.getBitness());
        System.out.println("CodeName" + os.getVersion().getCodeName());
    }
}
