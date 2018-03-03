package ru.rtech.internship;

import java.util.List;

public class Task3 {

    /**
     * На вход идет строка с числами и операциями сложения и вычитания. Например, 5+6-3. Унарных операций нет, то есть строка всегда начинается с положительного числа.
     * Функция должна вернуть результат выражения. Скобки учитывать не надо. Между числами и знаками может быть разное количество пробелов. Если во время
     * вычисления случилась ошибка и выражение вычислить не получается - вернуть null.
     */
    public Integer sum(String experssion) {
        String[] chars = experssion.split(" {2}|(|)|");
        int sum = new Integer(chars[0]);

        for (int i = 1; i < chars.length; i += 2) {
            if ("+".equals(chars[i])) {
                try {
                    int add = new Integer(chars[i + 1]);
                    sum += add;
                } catch (Exception e) {
                    return null;
                }
            } else if ("-".equals(chars[i])) {
                try {
                    int minus = new Integer(chars[i + 1]);
                    sum -= minus;
                } catch (Exception e) {
                    return null;
                }
            }
        }
        return sum;
    }
}
