package edu.hw2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task4Test {

    @Test
    @DisplayName("Вызов функции из теста")
    void callFromTest() {
        Task4.CallingInfo info = Task4.callingInfo();
        assertThat(info).isEqualTo(new Task4.CallingInfo("edu.hw2.Task4Test", "callFromTest"));
    }

}
