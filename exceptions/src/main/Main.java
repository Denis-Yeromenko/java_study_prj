package main;

public class Main {
    public static void main(String[] args) {
        String[] arrStr = {"Sam", "Jim", "Kate", "John", "Suzy", "Jane"};

        try {
            System.out.println(arrStr[6]);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out of bounds of an array");
        }

        int randInt = (int) (Math.random() * 91 + 10);
        String result = String.format("The random number is %s! Try again!", randInt);
        System.out.println(result);
    }
}
