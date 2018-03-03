package ru.rtech.internship;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Task3Test {

    private Task3 task3 = new Task3();

    @Test
    public void return5whenSum2And3() {
        assertThat(task3.sum("2+3")).isEqualTo(5);
    }

    @Test
    public void return7ForComlexExpression() {
        assertThat(task3.sum("2+3-5+7-3+3")).isEqualTo(7);
    }

    @Test
    public void nullWhenCannotCalculateExpression() {
        assertThat(task3.sum("2+a-3")).isNull();
        assertThat(task3.sum("2++3-3")).isNull();
        assertThat(task3.sum("2---4")).isNull();
    }

}