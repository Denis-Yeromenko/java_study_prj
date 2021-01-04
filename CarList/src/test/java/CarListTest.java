import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarListTest {
    private CarList carList;

    @Before
    public void setUp() throws Exception {
        carList = new CarListArray();
        for (int i = 0; i < 100; i++) {
            carList.add(new Car("Brand" + i, i));
        }

    }

    @Test
    public void when100ElementsAddedThenSizeMustBe100() {
        assertEquals(100, carList.size());
    }

    @Test
    public void whenElementRemovedByIndexThenSizeMustBeDecreased() {
        assertTrue(carList.removeAt(5));
        assertEquals(99, carList.size());
    }

    @Test
    public void whenElementRemovedThenSizeMustBeDecreased() {
        Car car = new Car("Mazda", 13);
        carList.add(car);
        assertEquals(101, carList.size());
        assertTrue(carList.remove(car));
        assertEquals(100, carList.size());
    }

    @Test
    public void whenRemovedNonExistentElementThenReturnFalse() {
        Car car = new Car("Mazda", 13);
        assertFalse(carList.remove(car));
    }

    @Test
    public void whenListClearedThenSizeMustBe0() {
        carList.clear();
        assertEquals(0, carList.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void whenIndexOutOfBoundsThenThrowException() {
        carList.get(100);
    }

    @Test
    public void getMethodMustReturnedRightValue() {
        Car car = carList.get(0);
        assertEquals("Brand0", car.getBrand());

    }
}