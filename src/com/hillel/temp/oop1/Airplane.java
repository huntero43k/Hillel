package com.hillel.temp.oop1;

public class Airplane {
    private String name;            // имя самолета
    private String engineState;     // состояние двигателя (ON or OFF)
    private boolean takeOffState;   // возможность взлететь
    private boolean landState;      // возможность приземлиться
    private boolean flyModeState;   // разрешение изменения высоты в пределах х-ик самолета
    private int currentHeight;      // текущая высота
    final private int minFlyHeight; // минимальная высота полета (500м)
    final private int maxFlyHeight; // максимальная высота полета (8000м)

    Airplane(String name) {
        this.name = name;
        this.minFlyHeight = 500;
        this.maxFlyHeight = 8000;
        setEngineState("OFF");
        setTakeOffState(false);
        setFlyModeState(false);
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
            setTakeOffState(true);
        }
    }

    // выключение двигателя
    public void stop() {
        if (this.engineState.equals("OFF")) {
            System.out.println("Engine is already OFF!");
        } else if (this.engineState.equals("ON") && flyModeState == true) {
            try {
                throw new Exception("Attempt to turn off the engine resulted in an ERROR!");
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.exit(0);
        }
        else {
            setEngineState("OFF");
            setTakeOffState(false);
        }
    }

    // взлететь
    public void takeOff() {
        if (this.engineState.equals("ON")) {
            setCurrentHeight(minFlyHeight);
            setFlyModeState(true);
            setLandState(true);
            setTakeOffState(false);
        }
        else {
            System.out.println("The engine is OFF, it is impossible to take off =( Please turn ON engine\n");
        }
    }

    // изменить высоту полета
    public int changeCurrentHeight(int currentHeight) {
        if (currentHeight >= minFlyHeight && currentHeight <= maxFlyHeight && flyModeState == true) {
            setCurrentHeight(currentHeight);
        } else {
            try {
                throw new Exception("Entered value out of range || min 500 - 8000 max ||");
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.exit(0);
        }
        return currentHeight;
    }
    // приземлиться
    public void land() {
        if (this.currentHeight > 0 && this.landState == true) {
        setCurrentHeight(0);
        setFlyModeState(false);
        setTakeOffState(true);
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

    public boolean getFlyModeState() {
        return flyModeState;
    }

    private void setFlyModeState(boolean flyModeState) {
        this.flyModeState = flyModeState;
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

    public int getMinFlyHeight() {
        int minFlyHeight = this.minFlyHeight;
        return minFlyHeight;
    }

    public int getMaxFlyHeight() {
        int maxFlyHeight = this.maxFlyHeight;
        return maxFlyHeight;
    }

}