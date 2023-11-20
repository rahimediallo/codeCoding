package com.jav8.expressionlamda;

public class ComparaisonPersonne {

    public int comParNom(Personne p1, Personne p2){
        return p1.getNom().compareTo(p2.getNom());
    }

    public int comParPrenom(Personne p1, Personne p2){
        return p1.getPrenom().compareTo(p2.getPrenom());
    }
}
