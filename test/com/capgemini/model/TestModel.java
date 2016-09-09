package com.capgemini.model;

import com.ivan.model.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan on 09/09/2016.
 */
public class TestModel {

    @Test
    public void test(){
        List<Person> peoples = new ArrayList<>();

        peoples.add(new Person("Ivan", "Premgi", 20));
        peoples.add(new Person("Arfy", "Shah", 24));
        peoples.add(new Person("Joe", "Wogan", 21));

        Assert.assertEquals(peoples.size(),3);
    }

}
