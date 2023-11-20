package com.company;

public class Calc {

    public static int calc(int[] array, int n1, int n2) {
        int sum = 0;
        // if(n1==0){
        //     return  array[n2];
        //  }
        for (int i = n1; i <= n2; i++) {
            sum += array[i];
        }

        //return array[n2] - array[n1-1];
        return sum;
    }

    public static void main(String[] args) {
        // System.out.println( calc([1,2,3,4,5], int n1=2,int n2=4 ));
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        System.out.print((calc(arr, 1, 0)));
    }
}


