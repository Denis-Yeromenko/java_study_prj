package workers;

public class Cooker extends Worker implements CanCook{
    public Cooker(String name) {
        super(name);
    }

    @Override
    public void cook() {
        System.out.println("The cooker is cooking now!");
    }
}
