package com.hillel.temp.oop1;

import java.util.Scanner;

public class Airplane {
    private String name;            // модель самолета
    private String engineState;     // состояние двигателя (ON or OFF)
    private boolean takeOffState;   // возможность взлететь
    private boolean landState;      // возможность приземлиться
    private int currentHeight;      // текущая высота
    private int capacity;       // вместимость (число мест)
    //private int cruisingSpeed;  // крейсерская скорость (средне-оптимальная скорость полета км/час)
    final private int minFlyHeight = 500;   // минимальная высота полета (500м)
    final private int maxFlyHeight = 8000;  // максимальная высота полета (8000м)
    //private double tankVolume;  // обьем бака (литров)
    //private double fuelInTank;  // к-во топлива в баке (литров)
    //private double flightRange; // дальность полета

//    Airplane() {
//        this.model = "Boeing 737";
//        this.type = "Passenger";
//    }

    //functions
    public void start() {
        if (this.engineState == "ON") {
            System.out.println("Engine is already ON");
        } else {
            this.setEngineState("ON");
            System.out.println("Engine ON!\n" + "Please fasten your seatbelts,put your seats and table trays " +
                    "are in the upright position for take-off.");
            System.out.println("----------------------------------------");
        }
    }

    public void stop() {
        if (this.engineState == "OFF") {
            System.out.println("Engine is already OFF");
        } else {
            this.setEngineState("OFF");
        }
        //выдать ошибку, если кто-то пытаеться выключить двигатель в полете
        //метод можно вызвать только когда самолет приземлился
        //engineOn = true;
        //System.out.println("Двинатель выключен, любые методы запрещены");
    }
    // взлететь
    public void takeOff() {
        if (this.engineState == "ON") {
            setTakeOffAbility(true);
            System.out.println("The plane is taking off! ^^^^^^^^");
            System.out.println("----------------------------------------");
            System.out.println("Good job!\n" + "We have switched to flight mode.\n" +
                    "In this mode, we can gain and decrease the flight altitude" +
                    " in the range of 500m (min) up to 8000m (max)\n");
            System.out.println("--------------------------------------------------");
        }
        else {
            System.out.println("The engine is OFF, it is impossible to take off =( Please turn ON engine\n");
        }
    }
    //
    public void fly() {
        setCurrentHeight(minFlyHeight);
        Scanner scanner = new Scanner(System.in);
        if (getTakeOffStateAbility() == true) {
            setLandState(true);
            System.out.println("Please chose your flight high:");
            while (currentHeight >= minFlyHeight && currentHeight <= maxFlyHeight) {
                currentHeight = scanner.nextInt();
                System.out.println("Current height is: " + currentHeight);
            } if (currentHeight < minFlyHeight && currentHeight > maxFlyHeight && currentHeight != 0) {
                System.out.println("Out of fly range!\n" + "If you want to land, please input 0");
                fly();
            } if (scanner.nextInt() == 0) {
                land();
            }
        }


    }

    public int raiseHeight (int heightUp) {
        return heightUp;
    }

    public int lowerHeight (int heightDown) {
        return heightDown;
    }

    void land() {
        System.out.println("Hello!");
        return;
    }

    //getters and setters

    public String getEngineState() {
        return engineState;
    }

    public void setEngineState(String engineState) {
        this.engineState = engineState;
    }

    public boolean getTakeOffStateAbility() {
        return takeOffState;
    }

    public void setTakeOffAbility(boolean takeOffState) {
        this.takeOffState = takeOffState;
    }

    public int getCurrentHeight() {
        return currentHeight;
    }

    public void setCurrentHeight(int currentHeight) {
        this.currentHeight = currentHeight;
    }

    public boolean getLandState() {
        return landState;
    }

    public void setLandState(boolean landState) {
        this.landState = landState;
    }

}