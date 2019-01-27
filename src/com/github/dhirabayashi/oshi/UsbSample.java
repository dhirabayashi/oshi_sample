package com.github.dhirabayashi.oshi;

import oshi.SystemInfo;

public class UsbSample {
    public static void main(String[] args) {
        var si = new SystemInfo();
        var hard = si.getHardware();
        var usbs = hard.getUsbDevices(false);
        for(var usb : usbs) {
            if(usb.getName().contains("Mouse")) {
                System.out.println("Name: " + usb.getName());
                System.out.println("ProductId: " + usb.getProductId());
                System.out.println("SerialNumber" + usb.getSerialNumber());
                System.out.println("Vendor: " + usb.getVendor());
                System.out.println("VendorId: " + usb.getVendorId());
            }
        }
    }
}
