package ru.pflb.details;

public class Engine {
    int power; //значение мощности двигателя в ваттах
    String vendor; //название производителя

    public Engine(int power, String vendor) {
        this.power = power;
        this.vendor = vendor;
    }

    public String toString() {
        return vendor + power + " Вт";
    }

}
