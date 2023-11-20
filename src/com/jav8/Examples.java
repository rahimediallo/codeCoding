package com.jav8;

import com.apple.eawt.AppEvent;

import java.util.*;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Examples {

    public static void main(String[] args) {
        final IntFunction<Integer> integerIntFunction = (int x) -> x * 10;

        System.out.println(integerIntFunction);
        new Implementation().printSomething();
       // List<Integer> numbers = asList(10, 1, 1000, 100);
       // Collections.sort(numbers, (a, b) ->a.comparaTo(b) );

        Integer n = 4;
        Function<Integer, Integer> modulo = (Integer a) -> a % n;

        assert modulo.apply(8) == 0;


        assert IntStream.range(0, 10).sum() == 45;


        Random random = new Random();
        Stream.generate(() -> random.nextInt())
                .limit(10)
                .forEach(System.out::println);

        System.out.println("___________________________");
        Musicien musicien = new Musicien();
        musicien.performance(new Instrument() {
            @Override
            public void jouer() {
                System.out.println("bing bing bing");
            }
        });

        System.out.println("--------------------");
        musicien.performance(()->System.out.println("bin bin bin "));


    }

    interface Instrument{
        void jouer();
    }
    static class Musicien {
        void performance(Instrument instrument){
            System.out.println("Le musicien joue 'vive le vent'");
            instrument.jouer();
        }
    }

}
