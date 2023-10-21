package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task2Test {

    @Test
    @DisplayName("4 цифры")
    void count4Digits() {
        // given
        int number = 4666;

        // when
        int digitsNum = Task2.countDigits(number);

        // then
        assertThat(digitsNum).isEqualTo(4);
    }

    @Test
    @DisplayName("3 цифры")
    void count3Digits() {
        // given
        int number = 544;

        // when
        int digitsNum = Task2.countDigits(number);

        // then
        assertThat(digitsNum).isEqualTo(3);
    }

    @Test
    @DisplayName("1 цифрa")
    void count1Digit() {
        // given
        int number = 5;

        // when
        int digitsNum = Task2.countDigits(number);

        // then
        assertThat(digitsNum).isEqualTo(1);
    }

    @Test
    @DisplayName("0")
    void countDigitsOfZero() {
        // given
        int number = 0;

        // when
        int digitsNum = Task2.countDigits(number);

        // then
        assertThat(digitsNum).isEqualTo(1);
    }

    @Test
    @DisplayName("Степень десятки")
    void countPowOfTen() {
        // given
        int number = 100000;

        // when
        int digitsNum = Task2.countDigits(number);

        // then
        assertThat(digitsNum).isEqualTo(6);
    }

    @Test
    @DisplayName("Минус степень десятки")
    void countMinusPowOfTen() {
        // given
        int number = -1000000;

        // when
        int digitsNum = Task2.countDigits(number);

        // then
        assertThat(digitsNum).isEqualTo(7);
    }

    @Test
    @DisplayName("9")
    void countDigitsOfNine() {
        // given
        int number = 9;

        // when
        int digitsNum = Task2.countDigits(number);

        // then
        assertThat(digitsNum).isEqualTo(1);
    }

    @Test
    @DisplayName("-9")
    void countDigitsOfMinusNine() {
        // given
        int number = -9;

        // when
        int digitsNum = Task2.countDigits(number);

        // then
        assertThat(digitsNum).isEqualTo(1);
    }

    @Test
    @DisplayName("Несколько девяток")
    void countMultipleNines() {
        // given
        int number = 999;

        // when
        int digitsNum = Task2.countDigits(number);

        // then
        assertThat(digitsNum).isEqualTo(3);
    }

    @Test
    @DisplayName("Минус несколько девяток")
    void countMinusMultipleNines() {
        // given
        int number = -99999;

        // when
        int digitsNum = Task2.countDigits(number);

        // then
        assertThat(digitsNum).isEqualTo(5);
    }

    @Test
    @DisplayName("MaxInt")
    void countDigitsOfMaxInt() {
        // given
        int number = Integer.MAX_VALUE;

        // when
        int digitsNum = Task2.countDigits(number);

        // then
        assertThat(digitsNum).isEqualTo(10);
    }

    @Test
    @DisplayName("MinInt")
    void countDigitsOfMinInt() {
        // given
        int number = Integer.MIN_VALUE;

        // when
        int digitsNum = Task2.countDigits(number);

        // then
        assertThat(digitsNum).isEqualTo(10);
    }
}
