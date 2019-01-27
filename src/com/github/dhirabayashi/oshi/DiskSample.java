package com.github.dhirabayashi.oshi;

import oshi.SystemInfo;

public class DiskSample {
    public static void main(String[] args) {
        var si = new SystemInfo();
        var hard = si.getHardware();
        var disks = hard.getDiskStores();
        for(var disk : disks) {
            System.out.println("Model: " + disk.getModel());
            System.out.println("Name: " + disk.getName());
            System.out.println("Serial: " + disk.getSerial());

            var partition = disk.getPartitions();

            for(var part : partition) {
                System.out.println("Identification: " + part.getIdentification());
                System.out.println("MountPoint: " + part.getMountPoint());
                System.out.println("Name: " + part.getName());
                System.out.println("Type: " + part.getType());
                System.out.println("Uuid" + part.getUuid());
            }
            System.out.println();
        }
    }
}
