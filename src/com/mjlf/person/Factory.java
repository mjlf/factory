package com.mjlf.person;

/**
 * Created by mjlf on 2016/7/20.
 */
public interface Factory {
   public <T extends  Person> T getInstance(Class<T> c);
}
