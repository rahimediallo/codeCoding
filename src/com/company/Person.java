package com.company;

import java.util.Date;

public final class Person {
    private  final String name;
    private  final Date birthDate;

    public Person(String name, Date birthDate) {
        this.name = name;
        this.birthDate = new Date(birthDate.getTime());
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return new Date(birthDate.getTime()) ;
    }

    public static void main(String[] args){
        Person person = new Person("bill", new Date());
       // Person person = new Person("bil", new Date());
        System.out.println(person.getName());
        System.out.println(person.getBirthDate());
    }
}
