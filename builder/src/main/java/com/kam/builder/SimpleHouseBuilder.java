package com.kam.builder;

public class SimpleHouseBuilder implements HouseBuilder{

    private House house;

    public SimpleHouseBuilder() {
        this.reset();
    }

    public void reset() {
        this.house = new House();
    }

    @Override
    public void buildWalls() {

    }

    @Override
    public void buildDoors() {

    }

    @Override
    public void buildWindows() {

    }

    @Override
    public void buildRoof() {

    }

    @Override
    public void buildGarage() {

    }

    @Override
    public void buildGarden() {

    }

    @Override
    public House getHouse() {
        return null;
    }
}
