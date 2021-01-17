import org.junit.Test;

import static org.junit.Assert.*;

public class BoxTest {

    @Test
    public void boxTest() {
        Box<Integer, String, Double> box1 = new Box(13, "str1", 22.13);
        Box<Integer, String, Double> box2 = new Box(2, "str2", 12.03);

        double result = box1.getInteg() + box1.getDoub() + box2.getInteg() + box2.getDoub();

        assertEquals(49.16, result,0.01);

    }

}