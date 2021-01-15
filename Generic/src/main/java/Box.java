public class Box<I, S, D> {
    private I integ;
    private S str;
    private D doub;

    public Box(I integ, S str, D doub) {
        this.integ = integ;
        this.str = str;
        this.doub = doub;
    }

    public I getInteg() {
        return integ;
    }

    public void setInteg(I integ) {
        this.integ = integ;
    }

    public S getStr() {
        return str;
    }

    public void setStr(S str) {
        this.str = str;
    }

    public D getDoub() {
        return doub;
    }

    public void setDoub(D doub) {
        this.doub = doub;
    }
}
