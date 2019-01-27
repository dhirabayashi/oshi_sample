package com.github.dhirabayashi.oshi;

import oshi.SystemInfo;

import java.util.Arrays;

public class SensorSample {
    public static void main(String[] args) {
        var si = new SystemInfo();
        var hard = si.getHardware();
        var sensor = hard.getSensors();
        System.out.println(sensor.getCpuTemperature());
        System.out.println(sensor.getCpuVoltage());
        System.out.println(Arrays.toString(sensor.getFanSpeeds()));
    }
}
