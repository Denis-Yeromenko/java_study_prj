import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {
        Calculator calc = new Calculator();
        //----- Test 1 --------
        double expected = 5.5;
        double result = calc.add(2.3, 3.2);
        assertEquals(expected, result, 0.001);
        // ------- Test 2 ----------
        double expected2 = 35.3;
        double result2 = calc.add(12.1, 23.2);
        assertEquals(expected2, result2, 0.001);
    }

    @Test
    public void subtract() {
        Calculator calc = new Calculator();
        //----- Test 1 --------
        double expected = 1.1;
        double result = calc.subtract(3.3, 2.2);
        assertEquals(expected, result, 0.001);
        // ------- Test 2 ----------
        double expected2 = 100.06;
        double result2 = calc.subtract(121.12, 21.06);
        assertEquals(expected2, result2, 0.001);
    }

    @Test
    public void multiply() {
        Calculator calc = new Calculator();
        //----- Test 1 --------
        double expected = 6.0;
        double result = calc.multiply(2.0, 3.0);
        assertEquals(expected, result, 0.001);
        // ------- Test 2 ----------
        double expected2 = 1111.11;
        double result2 = calc.multiply(111.111, 10.0);
        assertEquals(expected2, result2, 0.001);
    }

    @Test
    public void division() {
        Calculator calc = new Calculator();
        //----- Test 1 --------
        double expected = 2.0;
        double result = calc.division(6.0, 3.0);
        assertEquals(expected, result, 0.001);
        // ------- Test 2 ----------
        double expected2 = 25.4;
        double result2 = calc.division(50.8, 2.0);
        assertEquals(expected2, result2, 0.001);
    }

    @Test
    public void square() {
        Calculator calc = new Calculator();
        //----- Test 1 --------
        double expected = 4.0;
        double result = calc.square(2.0);
        assertEquals(expected, result, 0.001);
        // ------- Test 2 ----------
        double expected2 = 225.0;
        double result2 = calc.square(15.0);
        assertEquals(expected2, result2, 0.001);
    }
}