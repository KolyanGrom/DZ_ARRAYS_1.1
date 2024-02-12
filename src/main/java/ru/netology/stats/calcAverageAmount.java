package ru.netology.stats;

public class calcAverageAmount {
    public int calcAverageAmount(long[] sales) {

        int average = 0;

        for (int i = 0; i < sales.length; i++) {
            average += sales[i];
        }
        return average / 12;

    }
}
