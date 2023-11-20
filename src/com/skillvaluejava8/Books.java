package com.skillvaluejava8;

import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.IntStream.generate;

@Author("fon")
public class Books {

    public String name;
    public static void main (String args[]){
        Books books = new Books();
      //  Author[] authors= gameOfThrones.

        /// les stream

      Integer som=  IntStream.rangeClosed(1, 10).filter(i->i%2==0).sum();
      System.out.print(som);

      Integer somB = Stream.of(2,4,6,8,10).collect(Collectors.summingInt(i->i));
      System.out.print(somB);
      ///
     Integer ok = IntStream.generate(()->10)
                .limit(3)
                .boxed()
                .collect(Collectors.reducing((a,b)->a+b))
                .orElse(0);
     System.out.println(ok);

    Integer d=    Arrays.asList(1,2,3,4,5,6,7,8,9,10)
                .stream().filter(i->i%2==0)
                .reduce(0,(a,b)-> a+b);
    System.out.println(d);
    }


}
