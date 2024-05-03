package com.kam.singleton;

import java.io.*;


/**
 * static fields belong to a class (as opposed to an object) and are not serialized.
 * Also, note that we can use the keyword transient to ignore class fields during serialization:
 */
public class SerializeSingleton implements Serializable {


    //EAGER INITIALIZATION
    private static SerializeSingleton instance = new SerializeSingleton();
    private final String value;

    public String getValue() {
        return value;
    }

    public int getNumberValue() {
        return numberValue;
    }

    public static int getStaticNumber() {
        return staticNumber;
    }

    //this value will not persist during serialization
    //variable will be initialized with default value during deserialization
    private transient int numberValue = 20;

    //this value will not persist during serialization
    //variable will be loaded with current value defined in the class during deserialization
    static int staticNumber =10;

    private static final long serialVersionUID = 1L;

    private SerializeSingleton() {

        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        this.value = "FOO";

    }

    public static SerializeSingleton getInstance() {
        return instance;
    }




    //This method is used to replace the object that is created during deserialization with a different object
    //other code related to Singleton
    //this method is called by the JVM when the object is de-serialized,
    //so it returns an instance of singleton
    protected Object readResolve() {
        return getInstance();
    }

//    public static void main(String[] args) throws Exception {
//        SerializeSingleton obj = SerializeSingleton.getInstance();
//        SerializeSingleton anotherObj = SerializeSingleton.getInstance();
//        if (obj == anotherObj) {
//            System.out.println("obj and anotherObj are the same instance");
//        } else {
//            System.out.println("FAIL: obj and anotherObj are NOT the same instance");
//        }
//
//
//        //serialize the singleton object
//        FileOutputStream fos = new FileOutputStream("singleton.ser");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(obj);
////
//        // Deserialization
//        SerializeSingleton deserializedSingletonObject = null;
//        FileInputStream fis = new FileInputStream("singleton.ser");
//        ObjectInputStream ois = new ObjectInputStream(fis);
//        deserializedSingletonObject = (SerializeSingleton) ois.readObject();
//        if (obj == deserializedSingletonObject) {
//            System.out.println("obj and deserializedSingletonObject are the same instance");
//        } else {
//            System.out.println("FAIL: obj and deserializedSingletonObject are NOT the same instance");
//        }
////
//        System.out.println(obj.hashCode() == deserializedSingletonObject.hashCode());
//
//        System.out.println(obj.getValue() +" - "+ deserializedSingletonObject.getValue());
//        System.out.println(obj.getNumberValue() +" - "+ deserializedSingletonObject.getNumberValue());
//        System.out.println(obj.getStaticNumber() +" - "+ deserializedSingletonObject.getStaticNumber());
//
//    }


}
