package com.company;

public class Pi {
    public static double approx(int iterations) {
        double in = 0;
        for (int i = 0; i < iterations; i++) {
            double x = Math.random();
            double y = Math.random();
            if (x * x + y * y <= 1) {
                in++;
            }
        }
        return 4 * (in / iterations);
    }
}
