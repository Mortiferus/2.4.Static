package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    /* Продажи суммарно */
    @Test
    void shouldCalculateSalesSum() {
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.salesSum();
        assertEquals(expected, actual);
    }

    /* Продажи средне */
    @Test
    void shouldCalculateSalesAverage() {
        StatsService service = new StatsService();
        float expected = 15;
        float actual = service.salesAverage();
        assertEquals(expected, actual);
    }

    /* Месяц продажи максимум */
    @Test
    void shouldSpecifyMaximumSalesMonth() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.salesMaximumMonth();
        assertEquals(expected, actual);
    }

    /* Месяц продажи минимум */
    @Test
    void shouldSpecifyMinimumSalesMonth() {
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.salesMinimumMonth();
        assertEquals(expected, actual);
    }

    /* Количество месяцев продаж ниже среднего */
    @Test
    void shouldCalculateSalesBelowAverageMonths() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.salesBelowAverage();
        assertEquals(expected, actual);
    }

    /* Количество месяцев продаж выше среднего */
    @Test
    void shouldCalculateSalesAboveAverageMonths() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.salesAboveAverage();
        assertEquals(expected, actual);
    }
