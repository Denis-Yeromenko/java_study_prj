import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
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

                }
            }

            long after = System.currentTimeMillis();
                System.out.println("The sum of odd numbers is = "+result);
                System.out.println("It's time is "+(after -before));
                countDownLatch.countDown();
        }
    });

        try

    {
        countDownLatch.await();
    } catch(
    InterruptedException e)

    {
        e.printStackTrace();
    }
        System.out.println("All threads are terminated!");
}