package com.jav8.expressionlamda;

import com.skillvaluejava8.Triange;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Test {
    static   void executer() {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[]  args){

        List<String> fruits = Arrays.asList("melon", "abricot", "fraise");
        afficher(fruits, String::format);
        Consumer<String> afficher =(param)->System.out.print("papa"+param);

        Comparator<String> compa = (chaine1, chaine2)
                ->Integer.compare(chaine1.length(),chaine2.length());

         new Thread(new Runnable() {
             @Override
             public void run() {
                executer();
             }


         }).start();
         new Thread(()-> executer()).start();
    }




    public static void afficher(List<String> liste, MonFormateur formateur){
        int i =0;
        for(String element: liste){
            i++;
            System.out.println(formateur.formater("%3d %s", i ,element));
        }
    }



}
interface MonFormateur{
    String formater(String format, Object arguments, String element);
}