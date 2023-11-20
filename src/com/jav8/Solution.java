package com.jav8;

import java.io.PrintStream;
import java.util.Scanner;

public class Solution {

    public static String encode(String plainText) {
        if (plainText == null || plainText.length() <= 1) {
            return plainText;
        }

        StringBuilder encodedText = new StringBuilder(plainText.length() * 2);

        int count = 1;
        for (int i = 1; i < plainText.length(); i++) {
            if (plainText.charAt(i) == plainText.charAt(i - 1)) {
                count++;
            } else {
                encodedText.append(count);
                encodedText.append(plainText.charAt(i - 1));
                count = 1;
            }
        }

        // Ajouter le dernier groupe de caractères
        encodedText.append(count);
        encodedText.append(plainText.charAt(plainText.length() - 1));

        return encodedText.toString();
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String plainText = in.nextLine();
        PrintStream outStream = System.out;
         System.setOut(System.err);
         String encoded = encode(plainText);
         System.setOut(outStream);
         System.out.println(encoded);
    }
}


