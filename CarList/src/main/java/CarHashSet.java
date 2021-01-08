public class CarHashSet implements CarSet {
    private static final int INITIAL_CAPACITY = 16;
    private int size = 0;
    private static Entry[] array = new Entry[INITIAL_CAPACITY];

    @Override
    public boolean add(Car car) {
        int position = getElementPosition(car, array.length);
        if (array[position] == null) {
            array[position] = new Entry(car, null);
            size++;
            return true;
        } else {
            Entry existedElement = array[position];
            while (true) {
                if (existedElement.value.equals(car)) {
                    return false;
                } else if (existedElement.next == null) {
                    existedElement.next = new Entry(car, null);
                    size++;
                    return true;
                } else {
                    existedElement = existedElement.next;
                }
            }
        }
    }

    @Override
    public boolean remove(Car car) {
        int position = getElementPosition(car, array.length);
        if (array[position] == null) {
            return false;
        } else {
            Entry existedElement = array[position];
            while (true) {
                if (existedElement.value.equals(car)) {
                    if (existedElement.next == null) {
                        existedElement = null;
                    }else{
                        existedElement = existedElement.next;
                    }
                    size--;
                    return true;
                }else{
                    existedElement = existedElement.next;
                }
            }
        }

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        size = 0;
        array = new Entry[INITIAL_CAPACITY];

    }

    private int getElementPosition(Car car, int arrayLength) {
        return Math.abs(car.hashCode() % arrayLength);

    }

    private static class Entry {
        Car value;
        Entry next;

        public Entry(Car value, Entry next) {
            this.value = value;
            this.next = next;
        }
    }
}
