package com.kam.demo.singleton;

import com.kam.singleton.Singleton;

public class MultiThreadSingleton {

    public static void runDemo() {
        // This will create two threads and both will try to create a Singleton object.
        // The same class behaves incorrectly in a multithreaded environment.
        // Multiple threads can call the creation method simultaneously and get several instances of Singleton class.
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());

        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(singleton.showMessage());
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println(singleton.showMessage());
        }
    }

}
