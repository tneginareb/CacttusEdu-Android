package com.gentb.cacttusedu.models;

import java.util.ArrayList;

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

    public String getName() {
        return name;
    }


    public static ArrayList<Person> getDummyArray() {
        ArrayList<Person> persons = new ArrayList<>();
        Person person = new Person(1, 19,
                "Arianit", "Bobaj");
        persons.add(person);

        person = new Person(2, 21,
                "Meriton", "Ferati");
        persons.add(person);

        person = new Person(3, 23,
                "Ndriqim", "Haxhaj");
        persons.add(person);


        person = new Person(4, 20,
                "Endrit", "Zhuri");
        persons.add(person);


        person = new Person(5, 24,
                "Arlind", "Rexhepi");
        persons.add(person);
        return persons;
    }
}
