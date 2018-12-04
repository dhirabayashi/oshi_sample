package com.github.dhirabayashi.oshi;

import oshi.SystemInfo;
import oshi.hardware.NetworkIF;

import java.util.Arrays;

public class NetworkSample {
    public static void main(String[] args) {
        SystemInfo si = new SystemInfo();
        var hard = si.getHardware();
        var ifs = hard.getNetworkIFs();
        for(NetworkIF net : ifs) {
            puts("DisplayName: " + net.getDisplayName());
            puts("IPv4addr: " + Arrays.asList(net.getIPv4addr()));
            puts("IPv6addr: " + Arrays.asList(net.getIPv6addr()));
            puts("Macaddr: " + net.getMacaddr());
            puts("Name: " + net.getName());
            puts("NetworkInterface: " + net.getNetworkInterface());
            puts("DisplayName: " + net.getNetworkInterface().getDisplayName());
            puts("HostName: " + net.getNetworkInterface().getInetAddresses().nextElement().getHostName());
            puts("CanonicalHastName: " + net.getNetworkInterface().getInetAddresses().nextElement().getCanonicalHostName());
            puts("HostAddress: " + net.getNetworkInterface().getInetAddresses().nextElement().getHostAddress());
            puts("InterfaceAddresses: " + net.getNetworkInterface().getInterfaceAddresses());
            puts("NetworkInterface Name: " + net.getNetworkInterface().getName());

            puts();
        }

        var os = si.getOperatingSystem();

        puts("DnsServers: " + Arrays.asList(os.getNetworkParams().getDnsServers()));
        puts("DomainName: " + os.getNetworkParams().getDomainName());
        puts("HostName: " + os.getNetworkParams().getHostName());
        puts("Ipv4DefaultGateway: " + os.getNetworkParams().getIpv4DefaultGateway());
        puts("Ipv6DefaultGateway: " + os.getNetworkParams().getIpv6DefaultGateway());

        puts();
    }

    private static void puts(Object obj) {
        System.out.println(obj);
    }

    private static void puts() {
        System.out.println();
    }
}
