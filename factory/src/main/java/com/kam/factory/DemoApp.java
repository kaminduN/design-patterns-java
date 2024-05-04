package com.kam.factory;

public class DemoApp {
    public static void main(String[] args) {
        TransportVehicleFactory truckFactory = new TruckVehicleFactory();
        TransportVehicleFactory shipFactory = new SeaVehicleFactory();

        truckFactory.createTransport().deliver();
        shipFactory.createTransport().deliver();
    }
}
