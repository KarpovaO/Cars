package ru.pflb.professions;

import ru.pflb.Person;

public class Driver extends Person {
    int drivingExperience; // кол-во целых лет опыта
    int licenseId;  //номер водительского удостоверения

    public Driver(String name, int age, int drivingExperience, int licenseId) {
        this.name = name;
        this.age = age;
        this.drivingExperience = drivingExperience;
        this.licenseId = licenseId;
    }

    public String toString() {
        return name + "Возраст " + age + " лет, Стаж " + drivingExperience + " года, № удостоверения " + licenseId;
    }

}
