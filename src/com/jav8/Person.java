package com.jav8;

public class Person {

    private final String name;
    private final int age;
    private final Gender genre;

    public Person(String name, int age, Gender genre) {
        this.name = name;
        this.age = age;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", genre=" + genre +
                '}';
    }
}
