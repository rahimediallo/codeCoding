package com.jav8.expressionlamda;

import com.jav8.expressionlamda.Personne;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class TestReferenceMethodeInstance {

    public static void main(String args[]){

        Personne[] p ={ new Personne("ali", "rahime"),
                        new Personne("himera", "toto"),
        };
        Supplier<Personne> supplier= Personne::new;
        System.out.println(supplier.get());


     ComparaisonPersonne comparaisonPersonne = new ComparaisonPersonne();
        Arrays.sort(p, comparaisonPersonne::comParNom);
        System.out.println(Arrays.deepToString(p));
        ///
        String [] element = new String []{"aaa","ccc", "bbb"};
        Arrays.sort(element, (o1,o2)->o1.compareTo(o2));
        System.out.println(Arrays.toString(element));
        //
        Runnable monTraitement = ()->{
            System.out.println("debut rahim");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("fin");
        };

        Consumer<String> c = System.out::print;
        c.andThen(c).accept("bonjour");

        Function<Integer,Long> doubler =(i)->(long)i*2;
        System.out.println(doubler.apply(4));

        Function<Long, Long> lamoitie = i-> {
                long result = i/2;
            System.out.println("le resultat de la moitier"+result);
            return result;
        };
    }


}
