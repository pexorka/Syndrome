package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMaxUnderFirstIndex() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 10};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMaxEquallyFirstIndex() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMaxOverFirstIndex() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22};
        long expected = 22;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}