package com.github.dhirabayashi.oshi;

import oshi.SystemInfo;

public class FileSystemSample {
    public static void main(String[] args) {
        SystemInfo si = new SystemInfo();
        var os = si.getOperatingSystem();
        var fs = os.getFileSystem();
        for(var fsStore : fs.getFileStores()) {
            puts("Description: " + fsStore.getDescription());
            puts("LogicalVolume: " + fsStore.getLogicalVolume());
            puts("Mount: " + fsStore.getMount());
            puts("Name: " + fsStore.getName());
            puts("Type: " + fsStore.getType());
            puts("UUID: " + fsStore.getUUID());
            puts("Volume: " + fsStore.getVolume());

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
