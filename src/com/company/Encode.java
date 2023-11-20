package com.company;

public class Encode {


    public static String encode(String plainText) {
        StringBuilder encoded = new StringBuilder();
        int count = 1;
        for (int i = 1; i < plainText.length(); i++) {
            if (plainText.charAt(i) == plainText.charAt(i - 1)) {
                count++;
            } else {
                encoded.append(count).append(plainText.charAt(i - 1));
                count = 1;
            }
        }
        encoded.append(count).append(plainText.charAt(plainText.length() - 1));

        return encoded.toString();
    }

    public static String decode(String cypherText) {
        StringBuilder decoded = new StringBuilder();
        int count = 0;

        for (char ch : cypherText.toCharArray()) {
            if (Character.isDigit(ch)) {
                count = count * 10 + (ch - '0');
            } else {
                for (int i = 0; i < count; i++) {
                    decoded.append(ch);
                }
                count = 0;
            }
        }

        return decoded.toString();
    }

    public static void main(String[] args) {
        String encoded = encode("aaaabcccaaa");
        System.out.println("Encoded: " + encoded); // Should print "4a1b3c3a"

        String decoded = decode("4a1b3c3a");
        System.out.println("Decoded: " + decoded); // Should print "aaaabcccaaa"
    }
}
