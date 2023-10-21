package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class Task1Test {
    private final static int SECONDS_IN_MINUTE = Math.toIntExact(Duration.ofMinutes(1).getSeconds());

    @Test
    @DisplayName("Только минуты")
    void convertOnlyMinutes() {
        // given
        String videoDuration = new String("01:00");

        // when
        int durationInSeconds = Task1.minutesToSeconds(videoDuration);

        // then
        assertThat(durationInSeconds).isEqualTo(SECONDS_IN_MINUTE);
    }

    @Test
    @DisplayName("Только секунды")
    void convertOnlySeconds() {
        // given
        String videoDuration = new String("00:57");

        // when
        int durationInSeconds = Task1.minutesToSeconds(videoDuration);

        // then
        assertThat(durationInSeconds).isEqualTo(57);
    }

    @Test
    @DisplayName("Минуты и секунды")
    void convertBoth() {
        // given
        String videoDuration = new String("13:59");

        // when
        int durationInSeconds = Task1.minutesToSeconds(videoDuration);

        // then
        assertThat(durationInSeconds).isEqualTo(839);
    }

    @Test
    @DisplayName("Некорректно заданы секунды")
    void convertInvalidSeconds() {
        // given
        String videoDuration = new String("10:e");

        // when
        // Task1.minutesToSeconds(videoDuration);

        // then
        assertThatThrownBy(() -> {
            Task1.minutesToSeconds(videoDuration);
        }).isInstanceOf(NumberFormatException.class);
    }

    @Test
    @DisplayName("Некорректно заданы минуты")
    void convertInvalidMinutes() {
        // given
        String videoDuration = new String("43fs9d:24");

        // when
        // Task1.minutesToSeconds(videoDuration);

        // then
        assertThatThrownBy(() -> {
            Task1.minutesToSeconds(videoDuration);
        }).isInstanceOf(NumberFormatException.class);
    }

    @Test
    @DisplayName("Некорректный формат строки")
    void convertInvalidFormat() {
        // given
        String videoDuration = new String("43fs9dff");

        // when
        // Task1.minutesToSeconds(videoDuration);

        // then
        assertThatThrownBy(() -> {
            Task1.minutesToSeconds(videoDuration);
        }).isInstanceOf(NumberFormatException.class);
    }

    @Test
    @DisplayName("Отрицательные минуты")
    void convertNegativeMinutes() {
        // given
        String videoDuration = new String("-100:24");

        // when
        int durationInSeconds = Task1.minutesToSeconds(videoDuration);

        // then
        assertThat(durationInSeconds).isEqualTo(-1);
    }

    @Test
    @DisplayName("Отрицательные секунды")
    void convertNegativeSeconds() {
        // given
        String videoDuration = new String("100:-24");

        // when
        int durationInSeconds = Task1.minutesToSeconds(videoDuration);

        // then
        assertThat(durationInSeconds).isEqualTo(-1);
    }

    @Test
    @DisplayName("Секунд больше чем в одной минуте")
    void convertOver60Seconds() {
        // given
        String videoDuration = new String("100:61");

        // when
        int durationInSeconds = Task1.minutesToSeconds(videoDuration);

        // then
        assertThat(durationInSeconds).isEqualTo(-1);
    }

    @Test
    @DisplayName("Большое число минут")
    void convertLargeMM() {
        // given
        String videoDuration = new String("100000:20");

        // when
        int durationInSeconds = Task1.minutesToSeconds(videoDuration);

        // then
        assertThat(durationInSeconds).isEqualTo(6000020);
    }

    @Test
    @DisplayName("Очень большое число минут")
    void converExtremelytLargeMM() {
        // given
        String videoDuration = new String("1000000000:20");

        // when
        int durationInSeconds = Task1.minutesToSeconds(videoDuration);

        // then
        assertThat(durationInSeconds).isEqualTo(-1);
    }
}
