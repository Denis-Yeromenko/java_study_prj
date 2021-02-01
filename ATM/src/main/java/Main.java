public class Main {
    public static void main(String[] args) {
        Atm atmCash = new Atm(50_000);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                atmCash.getCash("John", 4000.54);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
//                try {
//                    thread1.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                atmCash.getCash("Sam", 43564.20);
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
//                try {
//                    thread2.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                atmCash.getCash("Judy", 3000.10);
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();


    }
}
