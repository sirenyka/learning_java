package ru.rtech.internship;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class Task5Test {

    private Task5 task5 = new Task5();

    @Test
    public void validBracket() {
        assertThat(task5.isBracketsCorrect("(a)")).isTrue();
        assertThat(task5.isBracketsCorrect("((a))")).isTrue();
        assertThat(task5.isBracketsCorrect("((a+b+c))+(wod-w)")).isTrue();
    }


    @Test
    public void invalidBracket() {
        assertThat(task5.isBracketsCorrect(")a+b()(")).isFalse();
        assertThat(task5.isBracketsCorrect("((a)))")).isFalse();
        assertThat(task5.isBracketsCorrect("((a)))+b+c+(wod-w)()")).isFalse();
        assertThat(task5.isBracketsCorrect("(c-a)(a+d))((()")).isFalse();
    }

}