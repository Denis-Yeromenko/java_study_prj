import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        long genBefore = System.currentTimeMillis();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        CountDownLatch countDownLatch = new CountDownLatch(3);
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                long before = System.currentTimeMillis();
                int result = 0;
                for (int i = 0; i < 1_000_000; i++) {
                    if (i % 2 == 0) {
                        result += i;
                    }
                }
                long after = System.currentTimeMillis();
                System.out.println("The sum of odd numbers is = " + result);
                System.out.println("It's(odd) time is " + (after - before));
                countDownLatch.countDown();
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                long before = System.currentTimeMillis();
                int result = 0;
                for (int i = 0; i < 1_000_000; i++) {
                    if (i % 7 == 0) {
                        result += i;
                    }
                }
                long after = System.currentTimeMillis();
                System.out.println("The sum of numbers(7) is = " + result);
                System.out.println("It's(7) time is " + (after - before));
                countDownLatch.countDown();
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                long before = System.currentTimeMillis();
                List<Integer> numberList = new ArrayList<>();
                for (int i = 0; i < 1000; i++) {
                    int rand = (int) (Math.random() * 1001);
                    numberList.add(rand);
                }
                int result = 0;
                for (int number : numberList) {
                    if (number % 2 == 0) {
                        result += number;
                    }
                }
                long after = System.currentTimeMillis();
                System.out.println("The sum of odd numbers in collection is = " + result);
                System.out.println("It's(collection) time is " + (after - before));
                countDownLatch.countDown();
            }
        });
        executorService.shutdown();
        try {
            countDownLatch.await();
        } catch (
                InterruptedException e) {
            e.printStackTrace();
        }
        long genAfter = System.currentTimeMillis();
        System.out.println("All threads are terminated!");
        System.out.println("All time is "+ (genAfter - genBefore));
    }
}