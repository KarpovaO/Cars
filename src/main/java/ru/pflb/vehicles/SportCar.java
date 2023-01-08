package ru.pflb.vehicles;

import ru.pflb.details.Engine;
import ru.pflb.professions.Driver;

public class SportCar extends Car {
    int maxVelocity = 200; //максимальная скорость в км/ч
    VehicleClass vehicleClass = VehicleClass.SPORTS_CAR;

    public SportCar(String model, Engine engine, Driver driver) {
        super(model, engine, driver);
        weight = 200;
    }

    public String toString() {
        return "Модель: " + model +
                "Класс: " + vehicleClass + System.lineSeparator() +
                "Характеристики: " + System.lineSeparator() +
                "Вес: " + weight + System.lineSeparator() +
                "Двигатель: " + engine + System.lineSeparator() +
                "Водитель: " + driver + System.lineSeparator() +
                "Максимальная скорость " + maxVelocity;
    }
}
