package com.inheritance;

public class VehicleUse {
    public static void main(String[] args) {
        vehicle V = new vehicle();
        V.print();
        Car c = new Car();
        c.numGear = 10;
        c.color = "red";
        c.print();
    }
}
