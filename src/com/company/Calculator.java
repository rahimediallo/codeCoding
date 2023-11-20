package com.company;

import java.math.BigDecimal;

public class Calculator {

    public static String sum(String... numbers) {
        BigDecimal sum = BigDecimal.ZERO;

        for (String numberStr : numbers) {
            BigDecimal number = new BigDecimal(numberStr);
            sum = sum.add(number);
        }

        return sum.toString();
    }

    public static void main(String[] args) {
        String result = Calculator.sum("99.35", "1.10");
        System.out.println(result);  // Résultat exact : 100.45
    }
}

