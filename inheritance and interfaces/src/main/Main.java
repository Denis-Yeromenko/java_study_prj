package main;

import figure.Rect;
import figure.Triangle;

public class Main {
    public static void main(String[] args) {

        Rect miniRect = new Rect(2,4);
        Triangle triang = new Triangle(12);

        System.out.println(miniRect.getArea());
        System.out.println(triang.getArea());

    }
}
