package org.example.colloquium_2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FactorialController {

    // Отображение формы для ввода числа
    @GetMapping("/")
    public String showForm() {
        return "factorialForm"; // Имя шаблона для ввода числа
    }

    // Обработка запроса для расчета первых n факториалов
    @GetMapping("/api/factorials")
    public String calculateFactorials(@RequestParam("n") int n, Model model) {
        if (n < 0) {
            throw new IllegalArgumentException("n должно быть неотрицательным числом.");
        }
        List<Long> factorials = calculateFactorialsList(n);
        model.addAttribute("n", n); // Передаем n в модель
        model.addAttribute("factorials", factorials); // Передаем список факториалов в модель
        return "factorials"; // Убедитесь, что это соответствует имени вашего шаблона.
    }

    // Метод для вычисления первых n факториалов
    private List<Long> calculateFactorialsList(int n) {
        List<Long> result = new ArrayList<>();
        long factorial = 1;

        for (int i = 0; i <= n; i++) {
            if (i > 0) {
                factorial *= i; // Вычисление факториала
            }
            result.add(factorial); // Добавление факториала в список
        }
        return result;
    }
}