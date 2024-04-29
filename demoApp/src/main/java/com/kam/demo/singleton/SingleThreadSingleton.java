package com.kam.demo.singleton;

import com.kam.singleton.Singleton;

public class SingleThreadSingleton {

    public static void runDemo(){
        Singleton obj = Singleton.getInstance("FOO");
        System.out.println(obj.showMessage());

        Singleton anotherObj0 = Singleton.getInstance("BAR");//this will return the same instance as obj
        System.out.println(anotherObj0.showMessage());
        if (obj == anotherObj0) {
            System.out.println("obj and anotherObj0 are the same instance");
        } else {
            System.out.println("FAIL: obj and anotherObj0 are NOT the same instance");
        }
    }
}
