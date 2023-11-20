package com.skillvaluejava8;

public interface Drawable {
    default void draw(){
        System.out.println("Drawing a drawable");
    }
}
