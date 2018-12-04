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
                puts("CommandLine: " + proc.getCommandLine());
                puts("Name: " + proc.getName());
                puts("CurrentWorkingDirectory: " + proc.getCurrentWorkingDirectory());
                puts("Group: " + proc.getGroup());
                puts("GroupID: " + proc.getGroupID());
                puts("Path: " + proc.getPath());
                puts("State: " + proc.getState());
                puts("User: " + proc.getUser());
                puts("UserID: " + proc.getUserID());

                puts();
            }
        }
    }

    private static void puts(Object obj) {
        System.out.println(obj);
    }

    private static void puts() {
        System.out.println();
    }
}
