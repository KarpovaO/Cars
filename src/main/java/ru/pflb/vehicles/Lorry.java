package ru.pflb.vehicles;

import ru.pflb.details.Engine;
import ru.pflb.professions.Driver;

public class Lorry extends Car {
    int loadingAmount = 8490; //грузоподъемность в киллограммах
    VehicleClass vehicleClass = VehicleClass.LARGE;

    public Lorry(String model) {
        super(model);
        weight = 500;
        Engine engine = new Engine(6, "CUMMINS ");
        this.engine = engine;
        Driver driver1 = new Driver("Вася Иванов ", 20, 2, 5566545);
        this.driver = driver1;
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