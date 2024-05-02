package com.kam.singleton;

/**
 * Singleton using Holder pattern also known as Initialization-on-demand holder idiom.
 * Bill Pugh Singleton Design Pattern
 *
 * The class loader in a Java application loads the static inner class SingletonHelper in the memory only once
 * Since we’re not using synchronized,
 * This eliminates the overhead of locking and unlocking objects while accessing the synchronized methods
 */
public class HolderSingleton {

    private HolderSingleton() {
    }

    private static class SingletonHolder {
        private final static HolderSingleton SINGLETON_INSTANCE = new HolderSingleton();
    }

    public static HolderSingleton getInstance() {
        return SingletonHolder.SINGLETON_INSTANCE;
    }
}
