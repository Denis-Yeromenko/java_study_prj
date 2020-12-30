package employees;

public class Director {
    public void force(Counter counter, int month){
        System.out.println(counter.getReport(month));
    }
}
