package ru.pflb.vehicles;

import ru.pflb.details.Engine;
import ru.pflb.professions.Driver;

public class Car {
    protected String model; //название модели автомобиля
    protected VehicleClass vehicleClass = VehicleClass.MINI; //класc автомобиля типа vehicleClass
    protected int weight; //вес автомобиля в килограммах
    protected Driver driver; //водитель, за которым закреплен автомобиль
    protected Engine engine; // тип мотора типа Engine


    public Car(String model, Engine engine, Driver driver) {
        this.model = model;
        weight = 50;
        this.engine = engine;
        this.driver = driver;
    }

    public static void start() {
        System.out.println("Поехали");
    }

    public static void stop() {
        System.out.println("Останавливаемся");
    }

    public static void turnRight() {
        System.out.println("Поворот направо");
    }

    public static void turnLeft() {
        System.out.println("Поворот налево");
    }

    public String toString() {
        return "Модель: " + model +
                "Класс: " + vehicleClass + System.lineSeparator() +
                "Характеристики: " + System.lineSeparator() +
                "Вес: " + weight + System.lineSeparator() +
                "Двигатель: " + engine + System.lineSeparator() +
                "Водитель: " + driver + System.lineSeparator();

    }


}
