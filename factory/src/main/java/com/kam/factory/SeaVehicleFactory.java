package com.kam.factory;

import com.kam.factory.items.Ship;
import com.kam.factory.items.Transport;

public class SeaVehicleFactory extends TransportVehicleFactory{
    @Override
    protected Transport createTransport() {
        return new Ship();
    }
}
