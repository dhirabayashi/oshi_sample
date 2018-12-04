package com.github.dhirabayashi.oshi;

import oshi.SystemInfo;

public class DiskSample {
    public static void main(String[] args) {
        SystemInfo si = new SystemInfo();
        var hard = si.getHardware();
        var disks = hard.getDiskStores();
        for(var disk : disks) {
            puts("Model: " + disk.getModel());
            puts("Name: " + disk.getName());
            puts("Serial: " + disk.getSerial());

            var partition = disk.getPartitions();

            for(var part : partition) {
                puts("Identification: " + part.getIdentification());
                puts("MountPoint: " + part.getMountPoint());
                puts("Name: " + part.getName());
                puts("Type: " + part.getType());
                puts("Uuid" + part.getUuid());
            }
            puts();
        }
    }

    private static void puts(Object obj) {
        System.out.println(obj);
    }

    private static void puts() {
        System.out.println();
    }
}
