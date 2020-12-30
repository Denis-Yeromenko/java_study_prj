package main;

import workers.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Programmer prog1 = new Programmer("Sam");
        Programmer prog2 = new Programmer("Jim");
        Programmer prog3 = new Programmer("Stive");

        Driver dr1 = new Driver("Jack");
        Driver dr2 = new Driver("Nick");
        Driver dr3 = new Driver("Mickael");

        Cooker cooker1 = new Cooker("Suzy");
        Cooker cooker2 = new Cooker("Peter");
        Cooker cooker3 = new Cooker("Sofy");

        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(prog1);
        workers.add(prog2);
        workers.add(prog3);
        workers.add(dr1);
        workers.add(dr2);
        workers.add(dr3);
        workers.add(cooker1);
        workers.add(cooker2);
        workers.add(cooker3);

        for (Worker worker : workers) {
            worker.voice();
        }

        ArrayList<CanCode> programmers = new ArrayList<>();
        programmers.add(prog1);
        programmers.add(prog2);
        programmers.add(prog3);

        ArrayList<CanDrive> drivers = new ArrayList<>();
        drivers.add(dr1);
        drivers.add(dr2);
        drivers.add(dr3);

        ArrayList<CanCook> cookers = new ArrayList<>();
        cookers.add(cooker1);
        cookers.add(cooker2);
        cookers.add(cooker3);

        for (CanCode coder : programmers) {
            coder.code();
        }

        for (CanDrive driver : drivers) {
            driver.drive();
        }

        for (CanCook cooker : cookers) {
            cooker.cook();
        }


    }
}
