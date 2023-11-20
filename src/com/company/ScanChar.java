package com.company;

public class ScanChar {

    public static char scanChar(String s) {
        // TODO Auto-generated method stub
        // Iterate over each character from A to Z.
        for (char c = 'A'; c <= 'Z'; c++) {
            // Check to see if the character corresponds with the ASCII art.
        /*    if (AsciiArt.printChar(c).equals(s)) {
                // Return the character if it does.
                return c;
            }*/

        }

        // Optionally use a null character to indicate that the string passed
        // doesn't correspond to any valid ASCII art.
        return (char) 0;

    }
}
