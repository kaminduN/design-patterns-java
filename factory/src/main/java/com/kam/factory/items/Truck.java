package com.kam.factory.items;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by truck");
    }

    @Override
    public Transport createTransportVahicle() {
        return new Truck();
    }
}
