package com.kam.factory;

public class DemoApp {

    //this is example of factory pattern
    public static void main(String[] args) {

        TransportVehicleFactory truckFactory = new TruckVehicleFactory();
        TransportVehicleFactory shipFactory = new SeaVehicleFactory();

        truckFactory.createTransport().deliver();
        shipFactory.createTransport().deliver();


    }
}
