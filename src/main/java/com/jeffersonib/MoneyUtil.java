package com.jeffersonib;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MoneyUtil {

    public static String format(double money) {
        return format(money, "$");
    }

    public static String format(double money, String symbol) {
        if (symbol == null) {
            throw new IllegalArgumentException("El símbolo no puede ser nulo");
        }

        String sign = "";
        if (money < 0) {
            sign = "-";
            money = money * -1;
        }

        BigDecimal value = BigDecimal.valueOf(money).setScale(2, RoundingMode.HALF_UP);
        return sign + symbol + value;
    }
}
