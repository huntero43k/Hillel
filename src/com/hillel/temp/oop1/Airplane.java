package com.hillel.temp.oop1;

public class Airplane {
    private String model;       // модель самолета
    private String type;        // тип (пасажирский/грузовой)
    private boolean engine;     // состояние двигателя (вкл/выкл)
    private int capacity;       // вместимость (число мест)
    private int cruisingSpeed;  // крейсерская скорость (средне-оптимальная скорость полета км/час)
    private int maxFlyHeight;   // максимальная высота полета (8000м)
    private int minFlyHeight;   // минимальная высота полета (500м)
    private double tankVolume;  // обьем бака (литров)
    private double fuelInTank;  // к-во топлива в баке (литров)
    private double flightRange; // дальность полета

    Airplane

    public boolean engineOn(boolean engineTurnOn) {
        engineTurnOn = true;
        return engineTurnOn;
    }

    public boolean engineOff(boolean engineTurnOff) {
        engineTurnOff = true;
        return engineTurnOff;
    }

    public boolean fly(boolean flyUp) {
        flyUp = true;
        return flyUp;
    }

    public int raiseHeight (int heightUp) {
        return heightUp;
    }

    public int lowerHeight (int heightDown) {
        return heightDown;
    }

    public boolean land(boolean lendOn, boolean engine) {
        lendOn = true;
        if (lendOn == true) {
            engine = false;
            }
            return engine;
    }




}