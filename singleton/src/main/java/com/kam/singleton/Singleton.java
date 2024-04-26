package com.kam.singleton;

/**
 * Hello world!
 *
 */
public class Singleton
{
     private static Singleton instance = null;

    private Singleton() {    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String showMessage() {
        System.out.println("in Singleton.showMessage()");
        return "Hello World!";
    }
}
