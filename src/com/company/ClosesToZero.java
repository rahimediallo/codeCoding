package com.company;

import java.util.Arrays;

public class ClosesToZero {


    public static int getClosestToZero(int[] a) {
        int currentValue = 0;
        int closestVal = a[0];
        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            currentValue = a[i] * a[i];
            if (currentValue <= (closestVal * closestVal)) {
                closestVal = a[i];
            }
            if(a==null){
                return 0;
            }
        }
        return closestVal;
    }

    public static void main(String[] args) {

        int[] testingArray = {8,5,-3,3,2};

        int result = getClosestToZero(testingArray);

        System.out.println("The Closest Number To Zero in this Array is : " + result);

    }
}
