package com.kam.factory;

import com.kam.factory.items.Transport;
import com.kam.factory.items.Truck;

public class RoadLogisticsFactory implements LogisticsCompanyFactory{

    TruckVehicleFactory trucks = new TruckVehicleFactory();
    @Override
    public Transport planDelivery() {
        Transport truck = trucks.createTransport();
        return truck;
    }

}
