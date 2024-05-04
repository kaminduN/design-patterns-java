package com.kam.factory;

import com.kam.factory.items.Transport;
import com.kam.factory.items.Truck;

public class TruckVehicleFactory extends TransportVehicleFactory{
    @Override
    protected Transport createTransport() {
        return new Truck();
    }
}
