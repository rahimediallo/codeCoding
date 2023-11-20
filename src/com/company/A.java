package com.company;
import java.math.BigInteger;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class A {
    public static boolean ab(int b, int c){
        return (b + c == 1 || b == 1 || c == 1);
    }

    static boolean isFoo(String param){
            return param!=null && param.equals("foo");
        }

     static int findLarest(int[] numbers){
        int max = numbers[0];
        for(int i=0; i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }

        }
         OptionalInt MAX = IntStream.of(numbers).max();

        return max;




     }
    static String concat(String[] strings) {
        String le = String.join("", strings);
       return le;
       /* String result="";
        for(int i=0; i<strings.length; i++){
            result+=strings[i];
        }
        return result;*/
    }

//    public static char scanChar(String s) {
//
//        // Iterate over each character from A to Z.
//        for (char c = 'A'; c <= 'Z'; c++) {
//            // Check to see if the character corresponds with the ASCII art.
//            if (AsciiArt.printChar(c) == s) {
//                // Return the character if it does.
//                return c;
//            }
//        }
//
//        // Optionally use a null character to indicate that the string passed
//        // doesn't correspond to any valid ASCII art.
//        return (char) 0;
//
//    }
public static String get(int c, int i) {
     BigInteger result = BigInteger.ONE;
     int k = Math.min(i, c - i);

     for (int j = 0; j < k; j++) {
         result = result.multiply(BigInteger.valueOf(c - j)).divide(BigInteger.valueOf(
                j + 1));
         }

     return result.toString();
     }

    public static void main(String[] args) {
        System.out.println(A.ab(0, +1));
       System.out.println( A.isFoo("foo"));


        String[] ff={"f","o","o","bar"};
        String gg =concat(ff);
        String[] lz={};
       System.out.println( A.concat(ff));
      //  System.out.println(gt);
        int i=0;
        System.out.println(i++);

    }

}

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
}

class Application {
    /**
     * @return the name of the given animal
     */
    static String getAnimalName(Animal a) {
        return a.getName();
    }
}