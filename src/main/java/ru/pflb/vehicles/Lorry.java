package ru.pflb.vehicles;

import ru.pflb.details.Engine;
import ru.pflb.professions.Driver;

public class Lorry extends Car {
    int loadingAmount = 8490; //грузоподъемность в киллограммах

    public Lorry(String model, VehicleClass vehicleClass, Engine engine, Driver driver) {
        super(model, vehicleClass, engine, driver);
        weight = 500;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Грузоподъемность " + loadingAmount;
    }
}