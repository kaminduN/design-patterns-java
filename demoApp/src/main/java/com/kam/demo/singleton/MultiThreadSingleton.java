package com.kam.demo.singleton;

import com.kam.singleton.HolderSingleton;
import com.kam.singleton.Singleton;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiThreadSingleton {

    public static void runDemo() {
        // This will create two threads and both will try to create a Singleton object.
        // The same class behaves incorrectly in a multithreaded environment.
        // Multiple threads can call the creation method simultaneously and get several instances of Singleton class.
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());

        threadFoo.start();
        threadBar.start();

        whenCallgetInstance_thenReturnSingleton();
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



    public static void whenCallgetInstance_thenReturnSingleton() {
        Set<HolderSingleton> setHoldingSingletonObj = new HashSet<>();
        List<Future<HolderSingleton>> futures = new ArrayList<>();

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Callable<HolderSingleton> runnableTask = () -> {
            System.out.println("run called for:" + Thread.currentThread().getName());
            return HolderSingleton.getInstance();
        };

        int count = 0;
        while(count < 10) {
            futures.add(executorService.submit(runnableTask));
            count++;
        }
        futures.forEach(e -> {
            try {
                setHoldingSingletonObj.add(e.get());
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        });
        executorService.shutdown();
        System.out.println("size should be 1 =>" + setHoldingSingletonObj.size());
    }

}
