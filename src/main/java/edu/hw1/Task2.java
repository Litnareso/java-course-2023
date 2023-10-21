package edu.hw1;

public class Task2 {
    private final static int DEC_BASE = 10;

    private Task2() {
    }

    /**
     * Counts number of digits of a curNum in the decimal system
     *
     * @param number the decimal curNum
     * @return a curNum of digits
     */
    public static int countDigits(int number) {
        int curNum = number;
        int digitsNum = 1;
        if (-DEC_BASE < curNum && curNum < DEC_BASE) {
            return digitsNum;
        } else {
            ++digitsNum;
        }
        if (curNum < 0 && curNum % DEC_BASE != 0) {
            curNum += DEC_BASE - curNum % DEC_BASE;
        }
        curNum = Math.abs(curNum / DEC_BASE);
        while (curNum / DEC_BASE != 0) {
            curNum /= DEC_BASE;
            ++digitsNum;
        }
        return digitsNum;
    }

}
