package edu.hw1;

public class Task3 {
    private Task3() {
    }

    /**
     * Checks if the first array can be nested inside the second array
     *
     * @param arr1 the first array of integers
     * @param arr2 the second array of integers
     * @return true if min(a1) > min(a2) and max(a1) < max(a2), false otherwise
     */
    public static boolean isNestable(int[] arr1, int[] arr2) {
        if (arr2.length <= 1) {
            return false;
        }
        if (arr1.length == 0) {
            return true;
        }
        int max1 = arr1[0];
        int min1 = arr1[0];
        for (int elem : arr1) {
            if (elem < min1) {
                min1 = elem;
            }
            if (elem > max1) {
                max1 = elem;
            }
        }
        int max2 = arr2[0];
        int min2 = arr2[0];
        for (int elem : arr2) {
            if (elem < min2) {
                min2 = elem;
            }
            if (elem > max2) {
                max2 = elem;
            }
        }
        return min1 > min2 && max1 < max2;
    }

}
