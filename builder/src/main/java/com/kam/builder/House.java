package com.kam.builder;

public class House {

    public House() {
        this.walls = "";
        this.doors = "";
        this.windows = "";
        this.roof = "";
    }

    private String walls;
    private String doors;
    private String windows;
    private String roof;

    public String getWalls() {
        return walls;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String getWindows() {
        return windows;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }
}
