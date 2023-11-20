package com.skillvaluejava8;

import java.util.function.BiFunction;

public class Hello {
    public String name;
    public String sayBye(String name){
        return name;

    }

    public static void main (String[] args){
        HelloWorld hello =(p)-> p;
        Hello h = new Hello();
        BiFunction<String, String ,String> f = (part1,part2) -> (part1 + part2);
        final String result = f.apply(h.sayBye("Hello world"),f.apply("bye bye",hello.sayHello("world")));
        System.out.println(result);
    }
    // le code affichera Hello world bye bye world
}
