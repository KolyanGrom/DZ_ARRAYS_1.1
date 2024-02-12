import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class salesStatisticsServiceTest {

    @Test
    public void shouldFindMinMonthSale() {

        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 0, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 4;
        int actualMonth = service.minSales(sale);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void sumAllSaleMonth() {

        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 0, 19, 20, 7, 14, 14, 18};
        int expectedSum = 160;
        int actualSum = service.calculateAmountSales(sale);

        Assertions.assertEquals(expectedSum, actualSum);


    }

    @Test
    public void averageSaleAllMonth() {

        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 75, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverage = 20;
        int actualAverage = service.calcAverageAmount(sale);

        Assertions.assertEquals(expectedAverage, actualAverage);

    }

    @Test
    public void shouldFindMaxMonthSale() {

        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 6;
        int actualMonth = service.maxSales(sale);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    public void shouldHowManyMonthMinSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinMonthSale = 7;
        int actualMinMonthSale = service.howManyMonthMinSales(sales);

        Assertions.assertEquals(expectedMinMonthSale, actualMinMonthSale);

    }

    @Test
    public void shouldHowManyMonthMaxSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxMonthSale = 5;
        int actualMaxMonthSale = service.howManyMonthMaxSales(sales);

        Assertions.assertEquals(expectedMaxMonthSale, actualMaxMonthSale);

    }


}
