package com.company;

import java.util.Arrays;

public class SolutionIstowin {

    public static boolean isTwin(String a, String b) {
        char[] first = a.toLowerCase().toCharArray();
        char[] second = b.toLowerCase().toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first, second);
    }

    public static void main(String[] args) {

        System.out.println(SolutionIstowin.isTwin("Hello", "world")); // false
        System.out.println(SolutionIstowin.isTwin("acb", "bca")); // true
        System.out.println(SolutionIstowin.isTwin("Lookout", "Outlook")); // true
    }
}
