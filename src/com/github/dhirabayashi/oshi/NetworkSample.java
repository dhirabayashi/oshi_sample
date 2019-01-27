package com.github.dhirabayashi.oshi;

import oshi.SystemInfo;
import oshi.hardware.NetworkIF;

import java.util.Arrays;

public class NetworkSample {
    public static void main(String[] args) {
        var si = new SystemInfo();
        var hard = si.getHardware();
        var ifs = hard.getNetworkIFs();
        for(NetworkIF net : ifs) {
            System.out.println("DisplayName: " + net.getDisplayName());
            System.out.println("IPv4addr: " + Arrays.asList(net.getIPv4addr()));
            System.out.println("IPv6addr: " + Arrays.asList(net.getIPv6addr()));
            System.out.println("Macaddr: " + net.getMacaddr());
            System.out.println("Name: " + net.getName());
            System.out.println("NetworkInterface: " + net.getNetworkInterface());
            System.out.println("DisplayName: " + net.getNetworkInterface().getDisplayName());
            System.out.println("HostName: " + net.getNetworkInterface().getInetAddresses().nextElement().getHostName());
            System.out.println("CanonicalHastName: " + net.getNetworkInterface().getInetAddresses().nextElement().getCanonicalHostName());
            System.out.println("HostAddress: " + net.getNetworkInterface().getInetAddresses().nextElement().getHostAddress());
            System.out.println("InterfaceAddresses: " + net.getNetworkInterface().getInterfaceAddresses());
            System.out.println("NetworkInterface Name: " + net.getNetworkInterface().getName());

            System.out.println();
        }

        var os = si.getOperatingSystem();

        System.out.println("DnsServers: " + Arrays.asList(os.getNetworkParams().getDnsServers()));
        System.out.println("DomainName: " + os.getNetworkParams().getDomainName());
        System.out.println("HostName: " + os.getNetworkParams().getHostName());
        System.out.println("Ipv4DefaultGateway: " + os.getNetworkParams().getIpv4DefaultGateway());
        System.out.println("Ipv6DefaultGateway: " + os.getNetworkParams().getIpv6DefaultGateway());

        System.out.println();
    }
}
