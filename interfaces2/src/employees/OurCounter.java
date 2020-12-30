package employees;

public class OurCounter implements Counter {
    @Override
    public String getReport(int i) {
        return "This is report of " + i + " month";
    }
}
