package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class FactorialCalculatorTest {

    @Test
    public void testCalculateFactorials_ValidInput() {
        FactorialCalculator calculator = new FactorialCalculator();
        List<Long> expected = List.of(1L, 1L, 2L, 6L, 24L); // 0!, 1!, 2!, 3!, 4!
        List<Long> actual = calculator.calculateFactorials(5);
        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateFactorials_ZeroInput() {
        FactorialCalculator calculator = new FactorialCalculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculateFactorials(0);
        });
        assertEquals("n должно быть натуральным числом (n >= 1).", exception.getMessage());
    }

    @Test
    public void testCalculateFactorials_NegativeInput() {
        FactorialCalculator calculator = new FactorialCalculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculateFactorials(-1);
        });
        assertEquals("n должно быть натуральным числом (n >= 1).", exception.getMessage());
    }

    @Test
    public void testCalculateFactorials_OneInput() {
        FactorialCalculator calculator = new FactorialCalculator();
        List<Long> expected = List.of(1L); // 0!
        List<Long> actual = calculator.calculateFactorials(1);
        assertEquals(expected, actual);
    }
}