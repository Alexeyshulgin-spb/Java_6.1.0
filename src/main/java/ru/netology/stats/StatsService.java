package ru.netology.stats;

public class StatsService {

    public static long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale = totalSale + sale;

        }
        return totalSale;

    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;

    }

    public int maxiMonthSale(long[] sales) {
        int maxiMonthSale = 0;
        long maxiSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxiSale) {
                maxiMonthSale = i;
                maxiSale = sales[i];
            }
        }
        return maxiMonthSale + 1;

    }
    public int miniMonthSale(long[] sales) {
        int minMonthSale = 0;
        long minSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                minMonthSale = i;
                minSale = sales[i];
            }
        }
        return minMonthSale + 1;

    }
    public int monthBelowAverage(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale < average(sales)){
                count = count + 1;
            }
            
        }
        return count;
    }
    public int monthAboveAverage(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale > average(sales)){
                count = count + 1;
            }

        }
        return count;
    }


}
