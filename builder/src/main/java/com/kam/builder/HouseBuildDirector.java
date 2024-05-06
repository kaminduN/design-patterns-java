package com.kam.builder;

public class HouseBuildDirector {
    private HouseBuilder houseBuilder;

    public HouseBuildDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House construct() {
        houseBuilder.buildWalls();
        houseBuilder.buildDoors();
        houseBuilder.buildWindows();
        houseBuilder.buildRoof();
        houseBuilder.buildGarage();
        houseBuilder.buildGarden();
        return houseBuilder.getHouse();
    }
}
