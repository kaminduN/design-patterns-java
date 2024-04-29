package com.kam.singleton;

/**
 * Naïve Singleton (single-threaded)
 *
 */
public class Singleton
{
    private static Singleton instance = null;
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
    public static synchronized Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }

    public String showMessage() {
        System.out.println("in Singleton.showMessage()");
        return this.value;
    }
}
