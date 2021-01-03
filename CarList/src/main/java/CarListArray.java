import java.util.Arrays;

public class CarListArray implements CarList{
    
    @Override
    public Car get(int index) {
        return null;
    }

    @Override
    public void add(Car car) {

    }

    @Override
    public boolean remove(Car car) {
        return false;
    }

    @Override
    public boolean removeAt(int index) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {

    }

    public void checkIndex(int index){
        if(index <0 || index > size){

        }
    }
}
