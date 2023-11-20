package com.company;

import java.util.HashMap;
import java.util.Map;

    public class CasinoRestaurant {
        public static int computeDayGains(int nbSeats, int[] payingGuests, int[] guestMovements) {
            Map<Integer, Integer> guestPayouts = new HashMap<>(); // stocke les montants payés par chaque touriste
            int totalGains = 0; // gains totaux du restaurant

            for (int i = 0; i < guestMovements.length; i++){
                int guestId = guestMovements[i];

                if (i % 2 == 0) {
                    // Arrivée du touriste
                    if (nbSeats > 0) {
                        // S'il y a des places disponibles, le touriste est placé
                        nbSeats--;
                        guestPayouts.put(guestId, payingGuests[guestId]);
                    } else {
                        // S'il n'y a pas de places disponibles, le touriste attend
                        guestPayouts.put(guestId, 0);
                    }
                } else {
                    // Départ du touriste
                    if (guestPayouts.containsKey(guestId)) {
                        totalGains += guestPayouts.remove(guestId);
                        nbSeats++;
                    }
                }
            }

            return totalGains;
        }

        public static void main(String[] args) {
            int nbSeats = 5;
            int[] payingGuests = {15, 20, 10, 25, 30};
            int[] guestMovements = {0, 1, 2, 3, 4, 0, 2, 1, 3, 4};

            int gains = computeDayGains(nbSeats, payingGuests, guestMovements);
            System.out.println("Gains du restaurant pour la journée : " + gains);
        }
    }
