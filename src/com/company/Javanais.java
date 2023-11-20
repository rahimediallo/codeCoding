package com.company;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Javanais {
         public static String translate(String text) {
             final Set<Character> VOWELS = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'))
                    ;
             StringBuilder result = new StringBuilder();

             boolean previousCharWasVowel = false;
             for(int i=0; i<text.length(); i++){
                 char c = text.charAt(i);
                 if(VOWELS.contains(c)){
                     if(!previousCharWasVowel){
                         result.append("av");
                         }
                     previousCharWasVowel = true;
                     }else{previousCharWasVowel = false;
                     }result.append(c);
                 }
             return result.toString();


}

         /* Ignore and do not change the code below */
         public static void main(String args[]) {
             Scanner in = new Scanner(System.in);
             String text = in.nextLine();
             PrintStream outStream = System.out;
            System.setOut(System.err);
             String javanais = translate(text);
             System.setOut(outStream);
             System.out.println(javanais);
             }
 /* Ignore and do not change the code above */
         }

