package ru.netology.stats;

public class StatsService {

    public int sumAllSales(long[] sales) {   //сумма всех продаж
        int sum = 0;

        for (int sale = 0; sale < sales.length; sale++) {
            sum += sales[sale];
        }
        return sum;

    }

    public int averageMonthlySales(long[] sales) {   //средняя сумму продаж в месяц
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];

        }

        return sum / sales.length;
    }

    public int monthMaxSales(long[] sales) {     //номер месяца, в котором был пик продаж
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }

        }
        return maxMonth + 1;
    }

    public int monthMinSales(long[] sales) {     //номер месяца, в котором был минимум продаж
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }

        }
        return minMonth + 1;
    }

    public int monthsBelowAverage(long[] sales) {    //количество месяцев, в которых продажи были ниже среднего
        int averageSales = averageMonthlySales(sales);   //средняя сумму продаж в месяц
        int numberOfMonthsBelow = 0;
        for (int sale = 0; sale < sales.length; sale++) {
            if (sale < averageSales) {
                numberOfMonthsBelow = +1;
            }
        }
        return numberOfMonthsBelow;

    }

    public int monthsAboveAverage(long[] sales) {    //количество месяцев, в которых продажи были выше среднего
        int averageSales = averageMonthlySales(sales);   //средняя сумму продаж в месяц
        int numberOfMonthsAbove = 0;
        for (int sale = 0; sale < sales.length; sale++) {
            if (sale > averageSales) {
                numberOfMonthsAbove = +1;
            }
        }
        return numberOfMonthsAbove;

    }


}







