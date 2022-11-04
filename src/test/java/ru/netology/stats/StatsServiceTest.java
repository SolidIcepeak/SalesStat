package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void SumSalesTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSumSales = 180;
        long actualSumSales = service.sumSales(sales);
        Assertions.assertEquals(expectedSumSales, actualSumSales);
    }

    @Test
    public void AverageSumSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverageSumSales = 15;
        long actualAverageSumSales = service.averageSumSales(sales);
        Assertions.assertEquals(expectedAverageSumSales, actualAverageSumSales);
    }

    @Test
    public void MaxSalesTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxMonth = 8;
        int actualMaxMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void MinSalesTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinMonth = 9;
        int actualMinMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }


    @Test
    public void SumLessAverageSalesMonthTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSumLessAverageSalesMonth = 5;
        int actualSumLessAverageSalesMonth = service.sumLessAverageSalesMonth(sales);
        Assertions.assertEquals(expectedSumLessAverageSalesMonth, actualSumLessAverageSalesMonth);
    }
    @Test
    public void SumMoreAverageSalesMonthTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSumMoreAverageSalesMonth = 5;
        int actualSumMoreAverageSalesMonth = service.sumMoreAverageSalesMonth(sales);
        Assertions.assertEquals(expectedSumMoreAverageSalesMonth, actualSumMoreAverageSalesMonth);
    }

}


