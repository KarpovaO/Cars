package ru.pflb;

public abstract class Person {
    protected int age;  //возраст в годах
    protected String name; //строка с ФИО

    public String toString() {
        return "ФИО" + name + "Лет: " + age;
    }
}
