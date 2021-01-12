import java.util.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 312);
        System.out.println(car);
        Set<Integer> numbers = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return -1;
                } else if (o1 == o2) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });
        for (int i = 0; i < 100; i++) {
            numbers.add((int) (Math.random() * 10));
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
