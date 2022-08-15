package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackerTest {
    @Test
    public void shouldPay100MoreWhenPay900(){
        CashbackHacker cashbackHacker = new CashbackHacker ();
        int expected = 100;
        int actual = cashbackHacker.remain(900);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldPay900MoreWhenPay1100(){
        CashbackHacker cashbackHacker = new CashbackHacker ();
        int expected = 900;
        int actual = cashbackHacker.remain(1100);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldPay0MoreWhenPay1000(){
        CashbackHacker cashbackHacker = new CashbackHacker ();
        int expected = 0;
        int actual = cashbackHacker.remain(1000);
        assertEquals(actual, expected);
    }

}