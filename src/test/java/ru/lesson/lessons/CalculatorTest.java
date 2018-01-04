package ru.lesson.lessons;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAdd() throws Exception {
        Calculator calculator = new Calculator();
        calculator.add(1, 1);
        assertEquals(2, calculator.getResult());
    }
    @Test
    public void testDiv() throws Exception {
        Calculator calculator = new Calculator();
        calculator.div(2, 2);
        assertEquals(1, calculator.getResult());
    }
    @Test(expected = ArithmeticException.class)
    public void divRuntimeException() throws UserException {
        Calculator calculator = new Calculator();
        calculator.div(2, 0);
    }
    @Test
    public void testMul() throws Exception {
        Calculator calculator = new Calculator();
        calculator.mul(2, 2);
        assertEquals(4, calculator.getResult());
    }
    @Test
    public void testSub() throws Exception {
        Calculator calculator = new Calculator();
        calculator.sub(2, 2);
        assertEquals(0, calculator.getResult());
    }

}