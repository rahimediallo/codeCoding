package com.skillvaluejava8;

public interface GpuAccelerated {
    default void draw(){
        System.out.println("Drawing with GPU acceleration");
    }
}
