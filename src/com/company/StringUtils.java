package com.company;

public class StringUtils {
    static String concat(String[] strings) {
        String le = String.join("",strings);
        return le;
    }
    public static void main(String[] args){
        String[] l={"", "a","b", "bbb"};
        System.out.println(concat(l));
    }
}
