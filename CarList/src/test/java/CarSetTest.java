import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarSetTest {
    CarSet carSetList;

    @Before
    public void setUp() throws Exception {
        //carSetList;
        for (int i = 0; i < 100; i++){
            carSetList.add(new Car("Brand"+i, i));
        }
    }

    @Test
    public void when100NotExistElementsAddedThenSizeMustBe100(){
        assertEquals(100,carSetList.size());
    }

    @Test
    public void whenTryToAddExistElementThenReturnFalse(){
        Car car = new Car("Brand20",20);
        assertFalse(carSetList.add(car));
        assertEquals(100,carSetList.size());
    }

    @Test
    public void whenTryToAddNotExistElementThenReturnTrue(){
        Car car = new Car("Brand101",101);
        assertTrue(carSetList.add(car));
        assertEquals(101,carSetList.size());
    }

    @Test
    public void whenRemoveExistElementThenReturnTrueAndSizeDecrease(){
        Car car = new Car("Brand30",30);
        assertTrue(carSetList.remove(car));
        assertEquals(99,carSetList.size());
    }

    @Test
    public void whenRemoveNotExistElementThenReturnFalseAndSizeNotDecrease(){
        Car car = new Car("Brand101",12);
        assertFalse(carSetList.remove(car));
        assertEquals(100,carSetList.size());
    }
    

    @Test
    public void whenListClearedThenSizeMustBe0() {
        carSetList.clear();
        assertEquals(0, carSetList.size());
    }
}