package com.skillvaluejava8;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String[] args){
        Supplier<String > place = ()->"viena";
        Places places =new Places();
        populate(places,  place);
        Consumer<Places> consumer= (p->System.out.println(p.location));

    }
    static <R> void populate(Places t, Supplier <R>
                             supplier){
        t.location = String.valueOf(supplier.get());
    }
    static class Places{
        String location;

    }

    //resultat le code n'affichera rien
}
