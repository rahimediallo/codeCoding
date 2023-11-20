package com.jav8.expressionlamda;

import java.util.function.DoubleToIntFunction;
import java.util.function.Function;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;

public class Calculatrice {

    public long calculer(int a, int b, OperationEntiere operationEntiere){

        return operationEntiere.effectuer(a,b);
    }




    public static void main(String args[]){
        Calculatrice calculatrice= new Calculatrice();
        OperationEntiere addition =(a,b)-> a+b;
        OperationEntiere soustraction = (a,b)->a-b;
        System.out.println(calculatrice.calculer(4,3, addition));

        DoubleToIntFunction dtif =(x) ->{return (int) x;};
        System.out.print(dtif.applyAsInt(3.14));
        System.out.println("________________________________");
        ToIntBiFunction<String, String> somme=(x,y)->
                Integer.parseInt(x)+ Integer.parseInt(y);
            System.out.println(somme.applyAsInt("10", "40"));
        System.out.println("andThen Compose");
        Function<Long, Long> doubler =(i)->{
            long resultat=(long) i*2;
            System.out.println("doubler" +resultat);
            return resultat;
        };
        Function<Long, Long> lamoitie =(i)->{
            long resultat= i/2;
            System.out.println("lamoiyie" +resultat);
            return resultat;
        };

        System.out.println(doubler.andThen(lamoitie).apply(3L));
        System.out.println(doubler.compose(lamoitie).apply(3L));


    }
}
