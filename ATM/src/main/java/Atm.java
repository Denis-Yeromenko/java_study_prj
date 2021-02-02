public class Atm {
    private double initialSum;
    private final Object monitor = new Object();

    public Atm(double initialSum) {
        this.initialSum = initialSum;
    }

    public double getInitialSum() {
        return initialSum;
    }

    public void setInitialSum(double initialSum) {
        this.initialSum = initialSum;
    }

    public void getCash(String name, double cash) {
        synchronized (monitor) {
            System.out.println(name + " are come to ATM");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            double sum;
            sum = getInitialSum();
            if (cash < sum) {
                double result = sum - cash;
                setInitialSum(result);
                System.out.println(name + " get a " + cash + "dollars. It is " + result + " in the ATM");
            } else {
                System.out.println("Does not enough cash for " + name);
            }
        }
    }
}
