package com.kam.demo;

import com.kam.singleton.Singleton;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Singleton obj = Singleton.getInstance();
        System.out.println(obj.showMessage());
    }
}
