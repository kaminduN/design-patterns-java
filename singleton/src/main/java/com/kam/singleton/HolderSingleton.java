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
        super();
        System.out.println("2. HolderSingleton created");
    }

    // static inner class - inner classes are not loaded until they are
    // referenced. This is a way to create a singleton class lazily.
    private static class SingletonHolder {
        private final static HolderSingleton SINGLETON_INSTANCE = new HolderSingleton();
    }

    public static HolderSingleton getInstance() {
        System.out.println("1. HolderSingleton getInstance");
        return SingletonHolder.SINGLETON_INSTANCE;
    }


//    public static void main(String[] args) {
//        HolderSingleton obj = HolderSingleton.getInstance();
//        HolderSingleton anotherObj = HolderSingleton.getInstance();
//        if (obj == anotherObj) {
//            System.out.println("3. obj and anotherObj are the same instance");
//        } else {
//            System.out.println("FAIL: obj and anotherObj are NOT the same instance");
//        }
//    }
}
