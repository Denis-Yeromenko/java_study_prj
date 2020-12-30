package main;

import employees.Counter;
import employees.Director;
import employees.OurCounter;

public class Main {
    public static void main(String[] args) {

        Director ceo = new Director();

        ceo.force(new Counter() {
            @Override
            public String getReport(int i) {
                return "This is report of " + i + " month";
            }
        }, 5);
    }
}
