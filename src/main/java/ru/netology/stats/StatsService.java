package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];
        }
        return sumSales;
    }

    public long averageSumSales(long[] sales) {
        int monthCount = sales.length;
        long sumSales = sumSales(sales);
        return sumSales / monthCount;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }


    public int sumLessAverageSalesMonth(long[] sales) {
        long averageSales = averageSumSales(sales);
        int sumMinAverageSalesMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (averageSales > sales[i]) {
                sumMinAverageSalesMonth = sumMinAverageSalesMonth + 1;
            }
        }
        return sumMinAverageSalesMonth;
    }

    public int sumMoreAverageSalesMonth(long[] sales) {
        long averageSales = averageSumSales(sales);
        int sumMoreAverageSalesMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (averageSales < sales[i]) {
                sumMoreAverageSalesMonth = sumMoreAverageSalesMonth + 1;
            }
        }
        return sumMoreAverageSalesMonth;
    }

}
