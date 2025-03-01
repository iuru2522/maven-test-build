package ca.lab3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Calculator class using JUnit 5.
 */
public class CalculatorTest {
    private Calculator calculator;
    
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }
    
    @Test
    public void testAdd() {
        assertEquals(15, calculator.add(10, 5));
        assertEquals(0, calculator.add(0, 0));
        assertEquals(-5, calculator.add(-10, 5));
    }
    
    @Test
    public void testSubtract() {
        assertEquals(5, calculator.subtract(10, 5));
        assertEquals(-5, calculator.subtract(5, 10));
        assertEquals(0, calculator.subtract(0, 0));
    }
    
    @Test
    public void testMultiply() {
        assertEquals(50, calculator.multiply(10, 5));
        assertEquals(0, calculator.multiply(0, 5));
        assertEquals(-50, calculator.multiply(10, -5));
    }
    
    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(10, 5));
        assertEquals(0, calculator.divide(0, 5));
        assertEquals(-2, calculator.divide(10, -5));
    }
    
    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
    }
}