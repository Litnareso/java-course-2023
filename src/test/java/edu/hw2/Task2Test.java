package edu.hw2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task2Test {
    static Arguments[] rectangles() {
        return new Arguments[] {
            Arguments.of(new Task2.Rectangle()),
            Arguments.of(new Task2.Square())
        };
    }

    @ParameterizedTest
    @MethodSource("rectangles")
    @DisplayName("Площадь прямоугольников")
    void rectangleArea(Task2.Rectangle rect) {
        rect = rect.setWidth(20).setHeight(10);

        double area = rect.area();

        assertThat(area).isEqualTo(200.0);
    }

    @Test
    @DisplayName("Площадь квадрата")
    void squareArea() {
        Task2.Square square = new Task2.Square().setSize(10);

        double area = square.area();

        assertThat(area).isEqualTo(100.0);
    }

    @Test
    @DisplayName("Площадь квадрата по умолчанию")
    void squareAreaDefault() {
        Task2.Square square = new Task2.Square();

        double area = square.area();

        assertThat(area).isEqualTo(0.0);
    }

    @Test
    @DisplayName("Площадь прямоугольника по умолчанию")
    void rectangleAreaDefault() {
        Task2.Rectangle rect = new Task2.Rectangle();

        double area = rect.area();

        assertThat(area).isEqualTo(0.0);
    }

    @Test
    @DisplayName("Площадь большого прямоугольника")
    void rectangleAreaLarge() {
        Task2.Rectangle rect = new Task2.Rectangle().setWidth(1000000000).setHeight(1000000000);

        double area = rect.area();

        assertThat(area).isEqualTo(1000000000000000000.0);
    }
}
