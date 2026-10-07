package com.jeffersonib;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoneyUtilTest {

    @Test
    public void moneyTest() {
        String money = MoneyUtil.format(1000);
        assertEquals("$1000.00", money);
    }

    @Test
    public void moneyRoundTest() {
        String money = MoneyUtil.format(1000.2378);
        assertEquals("$1000.24", money);
    }

    @Test
    public void negativeMoneyTest() {
        String money = MoneyUtil.format(-1000);
        assertEquals("-$1000.00", money);
    }

    @Test
    public void euroMoneyTest() {
        String money = MoneyUtil.format(1000, "€");
        assertEquals("€1000.00", money);
    }

    @Test
    public void negativeEuroMoneyTest() {
        String money = MoneyUtil.format(-1000, "€");
        assertEquals("-€1000.00", money);
    }

    @Test(expected = IllegalArgumentException.class)
    public void notNullSymbolMoneyTest() {
        MoneyUtil.format(1000, null);
    }
}
