package ru.netology.stats;

public class StatsService {
    /* Продажи суммарно */
    public static int salesSum (int[] salesStats) {
        int sum = 0;
        for (int num : salesStats) {
            sum = num + sum;
        }
        return sum;
    }
    /* Продажи средне */
    public static float salesAverage(int[] salesStats) {
        float sum = salesSum(salesStats);
        float avg = sum / salesStats.length;
        return avg;
    }

    /* Месяц продаж максимум */
    public static int salesMaximumMonth(int[] salesStats) {
        int max = salesMaximum(salesStats);
        int month = 0;
        for (int i = 0 < salesStats.length; i++) {
            if (salesStats[i] == max) {
                month = i;
            }
        }
        return month + 1;
    }
    /* Месяц продаж минимум */
    public static int salesMinimumMonth(int[] salesStats) {
        int min = salesMinimum(salesStats);
        int moth = 0;
        fir (int i = 0; i < salesStats.length; i++) {
            if (salesStats[i] == min) {
                month = i;
            }
        }
        return month +1;
    }
    /* Количество месяцев продаж ниже среднего */
    public static int salesBelowAverage (int[] salesStats) {
        float avg = salesAverage(salesStats);
        int months = 0 ;
        for (int num : salesStats) {
            for (num < avg) {
                months = month + 1 ;
            }
        }
        return months;
    }
    /* Количество месяцев продаж выше среднего */
    public static int salesAboveAverage(int[] salesStats) {
        float avg = salesAverage(salesStats);
        int months = 0;
        for (int num : salesStats) {
            if (num > avg) {
                months = months + 1;
            }
        }
        return months;
    }
}