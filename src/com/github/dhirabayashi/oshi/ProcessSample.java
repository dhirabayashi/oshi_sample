package com.github.dhirabayashi.oshi;

import oshi.SystemInfo;
import oshi.software.os.OSProcess;
import oshi.software.os.OperatingSystem;

public class ProcessSample {
    public static void main(String[] args) {
        SystemInfo si = new SystemInfo();
        var os = si.getOperatingSystem();
        OSProcess[] procs = os.getProcesses(Integer.MAX_VALUE, OperatingSystem.ProcessSort.PID);
        for(var proc : procs) {
            if(proc.getName().startsWith("java")) {
                System.out.println("CommandLine: " + proc.getCommandLine());
                System.out.println("Name: " + proc.getName());
                System.out.println("CurrentWorkingDirectory: " + proc.getCurrentWorkingDirectory());
                System.out.println("Group: " + proc.getGroup());
                System.out.println("GroupID: " + proc.getGroupID());
                System.out.println("Path: " + proc.getPath());
                System.out.println("State: " + proc.getState());
                System.out.println("User: " + proc.getUser());
                System.out.println("UserID: " + proc.getUserID());

                System.out.println();
            }
        }
    }
}
