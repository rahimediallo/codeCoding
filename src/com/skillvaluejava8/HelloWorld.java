package com.skillvaluejava8;


@FunctionalInterface
public interface HelloWorld {
    // une seule methode abstraite
    public String sayHello(String name);
    // methode de la classe object
    public String toString();
    public boolean equals(Object obj);

}
