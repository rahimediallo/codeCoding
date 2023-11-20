package com.jav8;

import com.sun.tools.javac.util.List;


import java.security.acl.Group;
import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private static List<Person> getPeople() {
        return List.of(
                new Person("rahime", 20, Gender.FEMALE),
                new Person("Pierre", 2, Gender.MALE),
                new Person("Fatou", 90, Gender.FEMALE),
                new Person("abdou", 43, Gender.MALE),
                new Person("himera", 33, Gender.FEMALE)
        );
    }
    public static void main(String[] rags) {

        List<Person> people = getPeople();
        //filter
        java.util.List<Person> femeles = people.stream()
                .filter(person -> person.getGenre().equals(Gender.FEMALE))
                .collect(Collectors.toList());

        femeles.forEach(System.out::println);

        //sort
        java.util.List<Person> sorted= people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());
        sorted.forEach(System.out::println);

        //AllMatch
      boolean allMatch=people.stream()
                .allMatch(person -> person.getAge()>7);
        System.out.println(allMatch);

        //AnyMatch
        boolean anymatch = people.stream()
                .anyMatch(person -> person.getAge()> 121);
        System.out.println(anymatch);

        //noMatch
        boolean noMatch = people.stream()
                .noneMatch(person -> person.getName().equals("antonio"));
        System.out.println(noMatch);
        //Max
        people.stream()
                .max(Comparator.comparing(Person::getAge));
               // .ifPresent(System.out::println);

        //Group
        Map<Gender, java.util.List<Person>> groupByGender= people.stream()
                .collect(Collectors.groupingBy(Person::getGenre));
                groupByGender.forEach((gender, people1) -> {
                    System.out.println(gender);
                    people1.forEach(System.out::println);
                    System.out.println();
                });

                //count
      int cc = (int) people.stream()
                .filter(person -> person.getAge()>20)
                .count();
            System.out.println(cc);

       /* //retourner le nom de la  femelle qui a l'age max
        Optional<String> oldermaxfemele;
        oldermaxfemele = people.stream()
                .filter(person -> person.getGenre().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge);
                        //.map(Person::getName);
        oldermaxfemele.ifPresent(System.out::println);*/

        // supprimer rahime
      java.util.List  <Person> pp= people.stream()
                .filter(person -> person.getName().equals("rahime"))
                .collect(Collectors.toList());
                people.remove(pp);
              pp.forEach(System.out::println);


        BiFunction<Integer, String, String> concat = (Integer i, String s) -> s + ": " + i;

        assert "un: 1".equals(concat.apply(1, "un"));

        ///
        int [] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        int sum = Arrays.stream(array).filter(i->i%2==0).sum();
        System.out.println(sum);
        //IntStream.of(2,4,6,8,10).collect(Collectors.summingInt());

        IntStream.rangeClosed(1,10).filter(i->i%2==0).sum();
        System.out.print(sum);
        Map<String, Integer> nameMap = new HashMap<>();
        Integer value = nameMap.computeIfAbsent("John", String::length);

        //
       java.util.List<String> names = Arrays.asList("Angela", "Aaron", "Bob", "Claire", "David");

       java.util.List<String> namesWithA = names.stream()
                .filter(name -> name.startsWith("A"))

                .collect(Collectors.toList());
                System.out.print(namesWithA);

        int min1 = Arrays.stream(new int[]{10, 2, 3, 4, 5})
                .min()
                .orElse(0);
        System.out.print(min1);


    }


    int sums = Arrays.stream(new int[]{1, 2, 3})
            .filter(i -> i >= 2)
            .map(i -> i * 3)
            .sum();



}