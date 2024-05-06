package com.kam.builder;

public interface HouseBuilder {
    void buildWalls();
    void buildDoors();
    void buildWindows();
    void buildRoof();
    void buildGarage();
    void buildGarden();
    House getHouse();
}
