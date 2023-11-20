package com.company;

import java.util.ArrayList;
import java.util.List;

class Solution1 {
    /**
     * @param numbers A list of integersæ
     * @return The reversed list with only even numbers
     */
    public static List<Integer> spell(List<Integer> numbers) {
        List<Integer> enchantedNumbers = new ArrayList<>();
        
        for (int i = numbers.size() - 1; i >= 0; i--) {
            int num = numbers.get(i);
            if (num % 2 == 0) { // Vérifie si le nombre est pair
                enchantedNumbers.add(num);
            }
        }
        
        return enchantedNumbers;
    }

    public static void main(String args[]) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);
        numbers.add(12);
        
        List<Integer> enchantedNumbers = spell(numbers);
        System.out.println(enchantedNumbers); // Devrait afficher les nombres pairs inversés
    }
}