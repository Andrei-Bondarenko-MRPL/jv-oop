package org.example;

import BuilderMachins.Bulldozer;
import BuilderMachins.Excavator;
import BuilderMachins.Machine;
import BuilderMachins.Truck;

public class Main {
    public static void main(String[] args) {
        Machine machine;
        machine = new Truck();
        machine.doWork();
        machine.stopWork();

        machine = new Bulldozer();
        machine.doWork();
        machine.stopWork();

        machine = new Excavator();
        machine.doWork();
        machine.stopWork();

    }
}