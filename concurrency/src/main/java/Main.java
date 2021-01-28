import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        Thread runnable = new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 1001; i++) {
                    System.out.print(i);
                }
            }
        });
        runnable.start();
        for(int i = 0; i < 1001; i++){
            System.out.print("M");
        }
        System.out.println("Finish");
    }
}
