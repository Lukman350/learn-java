package dev.lukmann.util;

public class MathUtil {

    // sum(0,1,2,3,4,5) dapat menerima banyak parameter maupun non parameter
    // sum(1) / sum()
    public static int sum(int... values) {
        int total = 0;

        for (int value : values) {
            total += value;
        }

        return total;
    }

}
