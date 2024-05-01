package com.kam.singleton;

/**
 * Naïve Singleton (single-threaded)
 *
 */
public class Singleton
{
    private static Singleton instance = null;

    // can we use final here?
    private String value;


    private Singleton(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        this.value = value;
    }

    // synchronized keyword is used to make getInstance() thread-safe.
    //but this can suffer from performance issues due to the synchronized keyword.
    //lazy initialization
    public static synchronized Singleton getInstanceTSafe(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }

    //this reduces the overhead of calling the synchronized method by using double-checked locking.
    //the synchronized block is used only for the first call and only if the instance is null.
    //lazy initialization
    public static Singleton getInstance(String value) {
        if (instance == null) {
           synchronized (Singleton.class) {
               if (instance == null) {
                   instance = new Singleton(value);
               }
           }
        }
        return instance;
    }

    public String showMessage() {
        System.out.println("in Singleton.showMessage()");
        return this.value;
    }
}
