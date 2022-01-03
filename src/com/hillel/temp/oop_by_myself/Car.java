package com.hillel.temp.oop_by_myself;

public class Car {
    String brand;           // Марка
    String model;           // Модель
    String bodyType;        // Тип кузова
    String color;           // Цвет
    int vin;             // Уникальный ID обьекта
    double engineV;         // обьем двигателья
    int horsePower;         // конских сил
    double tankVolume;      // обьем бака (литров)
    double fuelInTank;      // количество топлива в баке
    double fuelConsumption; // расход на 100 км
    int seats;              // количество мест

    // расход топлива

    // проехать расстояние
    void drive (double distance) {
        fuelInTank = fuelInTank - distance / 100 * fuelConsumption;
    }

    //заправить авто
    void fillTank (double fuel) {
        fuelInTank = fuelInTank + fuel;
    }
}
