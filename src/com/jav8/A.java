package com.jav8;

public interface A {
    default void printSomething(){
        System.out.println("Something");
    }
}
