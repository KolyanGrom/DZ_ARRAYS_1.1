package ru.netology.stats;

public class StatsService {
    public int calcAverageAmount(long[] sales) {

        int average = 0;

        for (int i = 0; i < sales.length; i++) {
            average += sales[i];
        }
        return average / 12;

    }

    public int calculateAmountSales(long[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;

    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int howManyMonthMinSales(long[] sales) {
        int minScoreMonth = 0;

        StatsService service = new StatsService();
        int calcAverageAmount = service.calcAverageAmount(sales);
        for (long t : sales) {
            if (t <= calcAverageAmount) {
                minScoreMonth = minScoreMonth + 1;
            }
        }


        return minScoreMonth;
    }

    public int howManyMonthMaxSales(long[] sales) {
        int maxScoreMonth = 0;

        StatsService service = new StatsService();
        int calcAverageAmount = service.calcAverageAmount(sales);
        for (long t : sales) {
            if (t > calcAverageAmount) {
                maxScoreMonth = maxScoreMonth + 1;
            }
        }


        return maxScoreMonth;
    }


}
