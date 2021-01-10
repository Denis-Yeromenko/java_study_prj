import java.util.Iterator;

public class CarHashSet implements CarSet {
    private static final int INITIAL_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;
    private int size = 0;
    private static Entry[] array = new Entry[INITIAL_CAPACITY];

    @Override
    public boolean add(Car car) {
        if (size >= array.length * LOAD_FACTOR) {
            increaseArray();
        }
        boolean added = add(car, array);
        if (added) {
            size++;
        }
        return added;
    }

    public boolean add(Car car, Entry[] dest) {
        int position = getElementPosition(car, dest.length);
        if (dest[position] == null) {
            dest[position] = new Entry(car, null);
            return true;
        } else {
            Entry existedElement = dest[position];
            while (true) {
                if (existedElement.value.equals(car)) {
                    return false;
                } else if (existedElement.next == null) {
                    existedElement.next = new Entry(car, null);
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
        }
        Entry secondLast = array[position];
        Entry last = secondLast.next;
        if (secondLast.value.equals(car)) {
            array[position] = last;
            size--;
            return true;
        }
        while (last != null) {
            if (last.value.equals(car)) {
                secondLast.next = last.next;
                size--;
                return true;
            } else {
                secondLast = last;
                last = last.next;
            }
        }
        return false;
    }

    @Override
    public boolean contains(Car car) {
        int numberCell = getElementPosition(car, array.length);
        Entry elementCell = array[numberCell];
        while (elementCell != null) {
            if (elementCell.value.equals(car)) {
                return true;
            } else {
                elementCell = elementCell.next;
            }
        }
        return false;
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

    @Override
    public Iterator<Car> iterator() {
        return new Iterator<Car>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < array.length;
            }

            @Override
            public Car next() {
                Entry arrayCell = array[index];
                Entry secondLast = arrayCell;
                Entry last = secondLast.next;
                if (arrayCell == null) {
                    index++;
                }
                if (last == null) {
                    index++;
                    return secondLast.value;
                } else {
                    while (last != null) {
                        Car car = secondLast.value;
                        secondLast = last;
                        last = secondLast.next;
                        return car;
                    }
                }
            }
        };
    }

    private void increaseArray() {
        Entry[] newArray = new Entry[array.length * 2];
        for (Entry entry : array) {
            Entry existedElement = entry;
            while (existedElement != null) {
                add(existedElement.value, newArray);
                existedElement = existedElement.next;
            }
        }
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
