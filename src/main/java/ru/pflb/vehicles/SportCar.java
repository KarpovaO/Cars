package ru.pflb.vehicles;

import ru.pflb.details.Engine;
import ru.pflb.professions.Driver;

public class SportCar extends Car {
    int maxVelocity = 200; //максимальная скорость в км/ч

    public SportCar(String model, VehicleClass vehicleClass, Engine engine, Driver driver) {
        super(model, vehicleClass, engine, driver);
        weight = 200;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Максимальная скорость " + maxVelocity;
    }
}
