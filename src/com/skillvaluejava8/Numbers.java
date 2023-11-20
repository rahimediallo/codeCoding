package com.skillvaluejava8;

import java.util.Arrays;
import java.util.List;

public class Numbers {

    public static List<Integer> numbers = Arrays.asList(1,2,3,4);
    public static void main(String args[]){
        System.out.println(ListUtil.toString(numbers));
    }
}
