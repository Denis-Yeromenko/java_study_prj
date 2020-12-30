package figure;

public class Triangle extends Figure {
    private int c;

    public Triangle(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    public Triangle(int size) {
        super(size, size);
        this.c = size;
    }

    public int getSideC() {
        return c;
    }

    @Override
    public int getArea() {
        int p = (getSideA() + getSideB() + getSideC()) / 2;
        return (int)Math.sqrt(p*(p-getSideA())*(p-getSideB())*(p-getSideC()));
    }
}
