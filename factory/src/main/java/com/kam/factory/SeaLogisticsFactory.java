package com.kam.factory;

import com.kam.factory.items.Transport;

public class SeaLogisticsFactory implements LogisticsCompanyFactory{

        SeaVehicleFactory ships = new SeaVehicleFactory();
        @Override
        public Transport planDelivery() {
            Transport ship = ships.createTransport();
            return ship;
        }
}
