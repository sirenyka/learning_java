package ru.rtech.internship;

import java.util.ArrayList;
import java.util.List;

public class Task1 {


    /**
     * На вход идет непустой список с числами > 0. Если число кратно 3, записать в выходной список строку вида "число - fizz", например, "3 - fizz".
     * Если число кратно 5, записать строку вида "число - buzz". Если число одновременно кратно 3 и 5 - записать в выходной массив
     * "число - fizzbuzz", например "15 - fizzbuzz"
     */

    public List<String> fizzBuzz(List<Integer> numbers) {
        List<String> result = new ArrayList<>();
        for (int number:numbers
             ) {
            if (number % 15 == 0) {
                result.add(number + " - fizzbuzz");
            } else if (number % 3 == 0) {
                result.add(number + " - fizz");
            } else if (number % 5 == 0) {
                result.add(number + " - buzz");
            }
        }
        return result;
    }
}
