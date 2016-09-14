package com.ivan;

import com.ivan.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan on 09/09/2016.
 */
public class Main {

    public static void main(String[] args) {
        List<Person> peoples = new ArrayList<>();

        peoples.add(new Person("Ivan", "Premgi", 20));
        peoples.add(new Person("Arfy", "Shah", 24));
        peoples.add(new Person("Joe", "Wogan", 21));
        
    }

}
