package com.jav8.expressionlamda;

import java.util.*;
import java.util.function.Predicate;

public class TestCollections {

    public static void main (String[]args){
        List<String> langages = new ArrayList<>();
        langages.add("jav");
        langages.add("python");
        langages.add("c");
        langages.add("VB");
        int i=0;
        for(String string: langages){
          //  System.out.println(string);
        }

       /* Collections.sort(langages, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });*/
        Predicate<String> pred =(s)-> s.length()<=4;
        pred=(s)->s.contains("c");
        langages.sort((o1,o2)->o1.compareToIgnoreCase(o2));
        langages.stream().filter(pred).forEach(System.out::println);

        langages.sort((o1,o2)->o1.compareToIgnoreCase(o2));
      //  langages.forEach(System.out::println);

    }
}
