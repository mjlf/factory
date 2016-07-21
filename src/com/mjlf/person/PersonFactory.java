package com.mjlf.person;

/**
 * Created by mjlf on 2016/7/20.
 */
public class PersonFactory implements Factory {
    @Override
    public <T extends Person> T getInstance(Class<T> c) {
        Person person = null;
        try {
            person = (Person)Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return (T) person;
    }
}
