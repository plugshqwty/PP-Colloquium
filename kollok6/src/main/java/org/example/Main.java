package org.example;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FactorialCalculator calculator = new FactorialCalculator();
        Scanner in=new Scanner(System.in);
        try {
            //int n = 5; // Пример ввода
            System.out.println("Введите число ");
            int k = in.nextInt();
            List<Long> factorials = calculator.calculateFactorials(k);
            System.out.println("Первые " + k + " факториалов: " + factorials);
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}