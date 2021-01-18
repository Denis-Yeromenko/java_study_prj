import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarMapTest {
    private CarMap map;

    @Before
    public void setUp() throws Exception {
        map = new CarHashMap();
    }

    @Test
    public void whenAdd100ThenSizeMustBe100() {
        for (int i = 0; i < 100; i++) {
            CarOwner carOwner = new CarOwner(i, "name" + i, "lastname" + i);
            Car car = new Car("brand" + i, i);
            map.put(carOwner, car);
        }
        assertEquals(100, map.size());
    }

    @Test
    public void whenPut100AndDifferent10ThenSizeMustBe10() {
        for (int i = 0; i < 100; i++) {
            int index = i % 100;
            CarOwner carOwner = new CarOwner(index, "name" + index, "lastname" + index);
            Car car = new Car("brand" + index, index);
            map.put(carOwner, car);
        }
        assertEquals(10, map.size());
    }

    @Test
    public void whenRemoveElementThenSizeMustBeDecreased() {
        for (int i = 0; i < 10; i++) {
            CarOwner carOwner = new CarOwner(i, "name" + i, "lastname" + i);
            Car car = new Car("brand" + i, i);
            map.put(carOwner, car);
        }
        assertEquals(10, map.size());
        CarOwner removedElement = new CarOwner(5,"name5","lastname5");
        //return true only once
        assertTrue(map.remove(removedElement));
        assertEquals(9, map.size());
        assertFalse(map.remove(removedElement));
    }

    @Test
    public void countOfKeysMustBeEqualCountOfValues() {
        for (int i = 0; i < 100; i++) {
            CarOwner carOwner = new CarOwner(i, "name" + i, "lastname" + i);
            Car car = new Car("brand" + i, i);
            map.put(carOwner, car);
        }
        assertEquals(100, map.keySet().size());
        assertEquals(100, map.values().size());
    }

    @Test
    public void methodGetMustReturnRightValue(){
        for (int i = 0; i < 100; i++) {
            CarOwner carOwner = new CarOwner(i, "name" + i, "lastname" + i);
            Car car = new Car("brand" + i, i);
            map.put(carOwner, car);
        }
        CarOwner key = new CarOwner(50,"name50","lastname50");
        Car value = map.get(key);
        String expectedBrand = "brand50";
        assertEquals(expectedBrand, value.getBrand());
    }

}