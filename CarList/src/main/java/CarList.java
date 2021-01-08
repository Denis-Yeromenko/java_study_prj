public interface CarList extends CarCollection {
    Car get(int index);
    boolean add(Car car);
    boolean add(Car car, int index);
    boolean removeAt(int index);
    boolean remove(Car car);
    boolean contains(Car car);
    int size();
    void clear();
}
