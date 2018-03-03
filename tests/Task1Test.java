package ru.rtech.internship;


import org.junit.Test;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Task1Test {

    private Task1 task1 = new Task1();

    @Test
    public void handleFizzBuzzCorrect() {
        assertThat(
                task1.fizzBuzz(
                        IntStream.range(1, 100)
                                .boxed()
                                .collect(Collectors.toList())
                ))
                .contains("3 - fizz")
                .contains("5 - buzz")
                .contains("15 - fizzbuzz")
                .contains("90 - fizzbuzz")
                .contains("99 - fizz")
                .doesNotContainSequence("16", "1", "2");
    }

    @Test
    public void emptyListWhenNoFittingElements() {
        assertThat(task1.fizzBuzz(IntStream.range(1, 3).boxed().collect(Collectors.toList())))
                .isEmpty();
    }

}