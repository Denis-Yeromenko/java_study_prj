import java.sql.SQLOutput;

public class Main {
    public static void withConcurrency() {
        float[] array = new float[10000000];
        for (int i = 0; i < 10000000; i++) {
            array[i] = 1;
        }
        long before = System.currentTimeMillis();
        float[] arr1 = new float[array.length/2];
        float[] arr2 = new float[array.length/2];
        System.arraycopy(array, 0, arr1, 0, array.length/2);
        System.arraycopy(array, array.length/2, arr2, 0, array.length/2);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < array.length/2; i++) {
                    arr1[i] = (float) (arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < array.length/2; i++) {
                    arr2[i] = (float) (arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(arr1, 0, array, 0, array.length/2);
        System.arraycopy(arr2, 0, array, array.length/2, array.length/2);
        long after = System.currentTimeMillis();
        System.out.println(after - before);

    }

    public static void withoutConcurrency() {
        float[] array = new float[10000000];
        for (int i = 0; i < 10000000; i++) {
            array[i] = 1;
        }
        long before = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }

    public static void main(String[] args) {
        System.out.println("Start");
        withoutConcurrency();
        withConcurrency();
        System.out.println("Finish!");
    }
}
