package com.gentb.cacttusedu.models;

/**
 * Created by gentberani on 11/23/17.
 */

public class Person {

    final private int age;
    final private int id;
    final private String name, surname;

    public Person(int id, int age, String name, String surname) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

}
