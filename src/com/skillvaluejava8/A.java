package com.skillvaluejava8;

public class A {

    public static void main(String[] args){
    try{
        int[] a = new int[]{1,3,5,7,9};
        Integer b = null;
        System.out.println(""+ (a[5]+ b/0));
    }catch (ArithmeticException | IndexOutOfBoundsException  e){
        System.out.println("one");

    }catch ( NullPointerException e){
        System.out.println("two");
    }
    }
}
class B extends A{}