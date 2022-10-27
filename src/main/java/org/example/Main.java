package org.example;

import BuilderMachines.Bulldozer;
import BuilderMachines.Excavator;
import BuilderMachines.Machine;
import BuilderMachines.Truck;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Truck truck = new Truck();
        Excavator excavator = new Excavator();
        Bulldozer bulldozer = new Bulldozer();

        Machine[] machines = new Machine[3];
        machines[0] = truck;
        machines[1] = excavator;
        machines[2] = bulldozer;

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
