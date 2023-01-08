package ru.pflb.vehicles;

import ru.pflb.details.Engine;
import ru.pflb.professions.Driver;

public class Lorry extends Car {
    int loadingAmount = 8490; //грузоподъемность в киллограммах
    VehicleClass vehicleClass = VehicleClass.LARGE;

    public Lorry(String model, Engine engine, Driver driver) {
        super(model, engine, driver);
        weight = 500;
    }


    public String toString() {
        return "Модель: " + model +
                "Класс: " + vehicleClass + System.lineSeparator() +
                "Характеристики: " + System.lineSeparator() +
                "Вес: " + weight + System.lineSeparator() +
                "Двигатель: " + engine + System.lineSeparator() +
                "Водитель: " + driver + System.lineSeparator() +
                "Грузоподъемность " + loadingAmount;
    }
}