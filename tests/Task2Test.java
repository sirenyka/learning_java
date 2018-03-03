package ru.rtech.internship;

import org.junit.Test;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Task2Test {

    private Task2 task2 = new Task2();

    @Test
    public void emptyListWhenNoPrimeElements() {
        assertThat(task2.primeSquares(IntStream.of(4, 6, 8, 10, 15).boxed().collect(Collectors.toList())))
                .isEmpty();
    }

    @Test
    public void returnOneSquaredElement() {
        assertThat(task2.primeSquares(IntStream.of(3, 6, 8, 10, 15).boxed().collect(Collectors.toList())))
                .hasSize(1)
                .contains(9);
    }

}