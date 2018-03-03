package ru.rtech.internship;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

    /**
     * На вход идет выражение с круглыми скобками, или без, например (12+5x) + 4 + f * (a -b). Необходимо проверить, корректно ли
     * расставлены скобки в выражении. т.е. каждая открывающая скобка имеет закрывающую.
     * ()          - true
     * "((a))"     - true
     * ")a+b()("   - false
     * ((a)))      - false
     */
    public boolean isBracketsCorrect(String experssion) {
        String[] expersionListAll = experssion.split("");
        int counterOfBrackets = 1;
        for (String symbol : expersionListAll) {
            if ("(".equals(symbol)) {
                counterOfBrackets++;
            } else if (")".equals(symbol)) {
                counterOfBrackets--;
                if (counterOfBrackets < 1) {
                    return false;
                }
            }
        }
        if (counterOfBrackets == 1) {
            return true;
        } else {
            return false;
        }
    }
}
