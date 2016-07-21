package com.mjlf.person;

/**
 * Created by mjlf on 2016/7/20.
 */
public class Test {
    public static void main(String[] args){
        PersonFactory personFactory = new PersonFactory();
        Person person1 = personFactory.getInstance(YellowPerson.class);
        person1.show();

        Person person2 = personFactory.getInstance(WhitePerson.class);
        person2.show();
    }
}
