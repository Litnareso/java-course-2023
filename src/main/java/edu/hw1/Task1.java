package edu.hw1;

import java.time.Duration;

public class Task1 {
    private final static int SECONDS_IN_MINUTE = Math.toIntExact(Duration.ofMinutes(1).getSeconds());

    private Task1() {
    }

    /**
     * Converts video duration from "mm:ss" format to seconds
     *
     * @param videoDuration a string containing video duration in "mm:ss" format
     * @return an integer - overall video duration in seconds or -1 if the input string is incorrect
     * @throws NumberFormatException if "mm" or "ss" can not be converted to int
     */
    public static int minutesToSeconds(String videoDuration) {
        String[] timeComponents = videoDuration.split(":");
        int mm = Integer.parseInt(timeComponents[0]);
        int ss = Integer.parseInt(timeComponents[1]);
        if (0 > ss || ss >= SECONDS_IN_MINUTE || 0 > mm || mm >= Integer.MAX_VALUE / SECONDS_IN_MINUTE) {
            return -1;
        }
        return mm * SECONDS_IN_MINUTE + ss;
    }
}
