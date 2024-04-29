package com.kam.demo;

import com.kam.demo.singleton.MultiThreadSingleton;
//import com.kam.demo.singleton.SingleThreadSingleton;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

//        SingleThreadSingleton.runDemo();

        MultiThreadSingleton.runDemo();

    }
}
