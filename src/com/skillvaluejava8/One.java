package com.skillvaluejava8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class One {

    String name = "john";
    public Optional<String> getName(){
        return Optional.of(name);
    }
}
class Two{
    One one = new One();
    public Optional<One> getOne(){
        return Optional.of(one);
    }
}
class Three{
    Two two = new Two();
    public Optional<Two> getTwo(){
        return Optional.ofNullable(two);

    }


}
class Tes{
    public static void main(String args[]){
       Optional<String> result= new Three().getTwo().flatMap(Two::getOne).map(One::getName).orElse(Optional.of("N/A"));

       List<String> lis = new ArrayList<>();
       lis.add("hello");
        lis.add("to");
        lis.add("all");
        lis.add("world");

    }


        }