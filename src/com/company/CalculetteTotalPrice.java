package com.company;

import java.util.Arrays;

public class CalculetteTotalPrice {

    public static int calculateTotalPrice1(int[] prices,int discount) {
        int total1=0;
        int len=prices.length;
        Arrays.sort(prices);
        for(int i=0;i<len-1;i++) {
            total1=total1+prices[i];
        }
        return (int) ( (total1+(float) ((prices[len-1])-((prices[len-1])*discount/100f))));

    }
    public static void main(String[] args) {
        int[] prices= {101,30,2,80,10};
        System.out.println(calculateTotalPrice1(prices, 20));

    }
}
