package ru.rtech.internship;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    /**
     * На вход идет непустой список с числами > 0. Нужно вернуть список с квадратами простых чисел.
     */
    public List<Integer> primeSquares(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (int number : numbers
                ) {
            if (number % 2 == 0) {
                break;
            } else {
                for (int i = 3; i < Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        break;
                    }
                }
                result.add(number * number);
            }
        }
        return result;
    }
}
