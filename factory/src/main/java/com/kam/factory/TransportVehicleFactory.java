package com.kam.factory;

import com.kam.factory.items.Transport;

//This class is responsible for creating every new Transport vehicle instance
public abstract class TransportVehicleFactory {

    public Transport create() {
        Transport transport = createTransport();
        //any additional operations can be added here
        return transport;
    }

    protected abstract  Transport createTransport();

}
