package com.company;

import java.util.stream.IntStream;

public class Fizbuz {
    public static void fizBuz(int n){
        IntStream.rangeClosed(1, n).mapToObj(i ->
                         i % 3 == 0 ?
                        (i % 5 == 0 ? "FizzBuzz" : "Fizz") :
                        (i % 7 == 0 ? "Buzz" : i))
                .forEach(System.out::println);


    }

 public static void   main(String args[]){
        fizBuz(100);

    }
}

