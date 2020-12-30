package workers;

public class Programmer extends Worker implements CanCode{
    public Programmer(String name) {
        super(name);
    }

    @Override
    public void code() {
        System.out.println("The programmer is coding now!");
    }
}
