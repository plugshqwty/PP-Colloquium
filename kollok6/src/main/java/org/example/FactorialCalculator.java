package org.example;

import java.util.ArrayList;
import java.util.List;

public class FactorialCalculator {

    /**
     * Вычисляет первые n факториалов.
     *
     * @param n натуральное число.
     * @return список первых n факториалов.
     * @throws IllegalArgumentException если n не положительное.
     */
    public List<Long> calculateFactorials(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n должно быть натуральным числом (n >= 1).");
        }

        List<Long> factorials = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            factorials.add(factorial(i));
        }
        return factorials;
    }

    /**
     * Вычисляет факториал числа.
     *
     * @param number натуральное число.
     * @return факториал числа.
     */
    private long factorial(int number) {
        if (number == 0) {
            return 1;
        }
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}