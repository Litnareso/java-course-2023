package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task3Test {

    @Test
    @DisplayName("Пример1 из условия")
    void isNestableExample1() {
        // given
        int[] arr1 = new int[] {1, 2, 3, 4};
        int[] arr2 = new int[] {0, 6};

        // when
        boolean nestable = Task3.isNestable(arr1, arr2);

        // then
        assertThat(nestable).isEqualTo(true);
    }

    @Test
    @DisplayName("Пример2 из условия")
    void isNestableExample2() {
        // given
        int[] arr1 = new int[] {3, 1};
        int[] arr2 = new int[] {4, 0};

        // when
        boolean nestable = Task3.isNestable(arr1, arr2);

        // then
        assertThat(nestable).isEqualTo(true);
    }

    @Test
    @DisplayName("Пример3 из условия: повторяющиеся числа")
    void isNestableExample3() {
        // given
        int[] arr1 = new int[] {9, 9, 8};
        int[] arr2 = new int[] {8, 9};

        // when
        boolean nestable = Task3.isNestable(arr1, arr2);

        // then
        assertThat(nestable).isEqualTo(false);
    }

    @Test
    @DisplayName("Пример4 из условия")
    void isNestableExample4() {
        // given
        int[] arr1 = new int[] {1, 2, 3, 4};
        int[] arr2 = new int[] {2, 3};

        // when
        boolean nestable = Task3.isNestable(arr1, arr2);

        // then
        assertThat(nestable).isEqualTo(false);
    }

    @Test
    @DisplayName("arr1 из одного числа, вложенного в arr2")
    void isNestableArr1SingleIntNested() {
        // given
        int[] arr1 = new int[] {3};
        int[] arr2 = new int[] {-4, 4};

        // when
        boolean nestable = Task3.isNestable(arr1, arr2);

        // then
        assertThat(nestable).isEqualTo(true);
    }

    @Test
    @DisplayName("arr1 из одного числа, не вложенного в arr2")
    void isNestableArr1SingleIntNotNested() {
        // given
        int[] arr1 = new int[] {-1};
        int[] arr2 = new int[] {-1, 100};

        // when
        boolean nestable = Task3.isNestable(arr1, arr2);

        // then
        assertThat(nestable).isEqualTo(false);
    }

    @Test
    @DisplayName("arr1 пуст")
    void isNestableArr1Empty() {
        // given
        int[] arr1 = new int[] {};
        int[] arr2 = new int[] {-10, -8};

        // when
        boolean nestable = Task3.isNestable(arr1, arr2);

        // then
        assertThat(nestable).isEqualTo(true);
    }

    @Test
    @DisplayName("arr2 из одного числа")
    void isNestableArr2SingleInt() {
        // given
        int[] arr1 = new int[] {3, 3, 3};
        int[] arr2 = new int[] {3};

        // when
        boolean nestable = Task3.isNestable(arr1, arr2);

        // then
        assertThat(nestable).isEqualTo(false);
    }

    @Test
    @DisplayName("arr2 пуст")
    void isNestableArr2Empty() {
        // given
        int[] arr1 = new int[] {3, 3};
        int[] arr2 = new int[] {};

        // when
        boolean nestable = Task3.isNestable(arr1, arr2);

        // then
        assertThat(nestable).isEqualTo(false);
    }
}
