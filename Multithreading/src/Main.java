public class Main {
    static boolean isTrue = true;
    static int random1 = (int) (Math.random() * 100000000);

    public static void main(String[] args) {

        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int i = 0;
                    while (isTrue) {
                        System.out.println(i);
                        Thread.sleep(1000);
                        i++;
                    }
                } catch (Exception e) {
                }
            }
        });
        timer.start();

        //---------------- Second thread ---------------------

        Thread timer2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (isTrue) {
                        int random2 = (int) (Math.random() * 100000000);
                        if (random1 == random2) {
                            isTrue = false;
                            System.out.println(random2 + " = " + random1);
                        }
                    }
                } catch (Exception e) {
                }
            }
        });
        timer2.start();
    }
}
