package com.github.dhirabayashi.oshi;

import oshi.SystemInfo;

public class FileSystemSample {
    public static void main(String[] args) {
        var si = new SystemInfo();
        var os = si.getOperatingSystem();
        var fs = os.getFileSystem();
        for(var fsStore : fs.getFileStores()) {
            System.out.println("Description: " + fsStore.getDescription());
            System.out.println("LogicalVolume: " + fsStore.getLogicalVolume());
            System.out.println("Mount: " + fsStore.getMount());
            System.out.println("Name: " + fsStore.getName());
            System.out.println("Type: " + fsStore.getType());
            System.out.println("UUID: " + fsStore.getUUID());
            System.out.println("Volume: " + fsStore.getVolume());

            System.out.println();
        }
    }
}
