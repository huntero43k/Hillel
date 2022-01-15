package com.hillel.temp.oop1;

import java.util.Scanner;

public class Airplane {
    private String name;            // модель самолета
    private String engineState;     // состояние двигателя (ON or OFF)
    private boolean takeOffState;   // возможность взлететь
    private boolean landState;      // возможность приземлиться
    private int currentHeight;      // текущая высота
    final private int minFlyHeight;   // минимальная высота полета (500м)
    final private int maxFlyHeight;  // максимальная высота полета (8000м)

    Airplane(String name) {
        this.name = name;
        this.minFlyHeight = 500;
        this.maxFlyHeight = 8000;
        setEngineState("OFF");
        setTakeOffState(false);
        setLandState(false);
        setCurrentHeight(0);
    }

    //functions

    // включение двигателя
    public void start() {
        if (this.engineState.equals("ON")) {
            System.out.println("Engine is already ON!");
        } else {
            this.setEngineState("ON");
        }
    }
    // выключение двигателя
    public void stop() {
        if (this.engineState.equals("OFF")) {
            System.out.println("Engine is already OFF!");
        } else if (this.engineState.equals("ON") && takeOffState == true) {
            try {
                throw new Exception("Attempt to turn off the engine resulted in an ERROR!");
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.exit(0);
        }
        else {
            setEngineState("OFF");
        }
    }

    // взлететь
    public void takeOff() {
        if (this.engineState.equals("ON")) {
            setTakeOffState(true);
            setCurrentHeight(minFlyHeight);
        }
        else {
            System.out.println("The engine is OFF, it is impossible to take off =( Please turn ON engine\n");
        }
    }
    //
//    public void fly() {
//        setCurrentHeight(minFlyHeight);
//        Scanner scanner = new Scanner(System.in);
//        if (takeOffState == true) {
//            setLandState(true);
//            System.out.println("Please chose your flight high:");
//            while (currentHeight >= minFlyHeight && currentHeight <= maxFlyHeight) {
//                System.out.println("Current height is: " + currentHeight + "\n" + "Please input new height: ");
//                currentHeight = scanner.nextInt();
//            } if (currentHeight < minFlyHeight && currentHeight > maxFlyHeight && currentHeight != 0) {
//                System.out.println("Out of fly range!\n" + "If you want to land, please input 0");
//                fly();
//            } if (scanner.nextInt() == 0) {
//                land();
//            }
//        }
//    }

    // изменение высоты полета
    public int changeCurrentHeight(int currentHeight) {
        if (currentHeight >= minFlyHeight && currentHeight <= maxFlyHeight) {
            setCurrentHeight(currentHeight);
        } else {
            System.out.println("");
            try {
                throw new Exception("Entered value out of range || min 500 - 8000 max ||");
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.exit(0);
        }
        return currentHeight;
    }

    void land() {
        if (this.currentHeight > 0) {

        }

    }

    //getters and setters

    public String getName() {
        return name;
    }

    public String getEngineState() {
        return engineState;
    }

    private void setEngineState(String engineState) {
        this.engineState = engineState;
    }

    public boolean getTakeOffState() {
        return takeOffState;
    }

    private void setTakeOffState(boolean takeOffState) {
        this.takeOffState = takeOffState;
    }

    public int getCurrentHeight() {
        return currentHeight;
    }

    private void setCurrentHeight(int currentHeight) {
        this.currentHeight = currentHeight;
    }

    public boolean getLandState() {
        return landState;
    }

    private void setLandState(boolean landState) {
        this.landState = landState;
    }

    public void getMinFlyHeight() {
        System.out.println(minFlyHeight);
    }

    public void getMaxFlyHeight() {
        System.out.println(maxFlyHeight);
    }

}