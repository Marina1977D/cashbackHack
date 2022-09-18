package ru.netology.service;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class CashbackHackServiceTest {

    @Test
    public void shouldSetHighBound() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1001);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void shouldSetLowBound() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(999);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void shouldSetEqualBoundary() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void shouldSetHighBoundJunit5() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1001);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldSetLowBoundJunit5() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(999);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void shouldSetEqualBoundaryJunit5() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);
        Assert.assertEquals(expected,actual);

    }
}