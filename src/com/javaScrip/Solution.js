function computeDayGains(nbSeats, payingGuests, guestMovements) {
    const seatedGuests = new Set(); // Set pour suivre les invités actuellement assis
    let totalGains = 0;

    for (const movement of guestMovements) {
        if (seatedGuests.has(movement)) {
            seatedGuests.delete(movement); // Départ de l'invité
        } else if (seatedGuests.size < nbSeats) {
            seatedGuests.add(movement); // Arrivée de l'invité et placement à une place libre
            totalGains += payingGuests[movement]; // Ajout du montant payé par l'invité
        }
    }

    return totalGains;
}