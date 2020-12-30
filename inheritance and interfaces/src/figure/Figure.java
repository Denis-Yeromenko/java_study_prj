package figure;

public abstract class Figure {
    private int sideA;
    private int sideB;

    public Figure(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public abstract int getArea();

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }
}
