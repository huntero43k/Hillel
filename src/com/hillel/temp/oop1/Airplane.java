package com.hillel.temp.oop1;

import java.util.Scanner;

public class Airplane {
    private String model;       // модель самолета
    private String type;        // тип (пасажирский/грузовой)
    private boolean engineOn;     // состояние двигателя (вкл/выкл)
    private int capacity;       // вместимость (число мест)
    //private int cruisingSpeed;  // крейсерская скорость (средне-оптимальная скорость полета км/час)
    final private int minFlyHeight = 500;   // минимальная высота полета (500м)
    final private int maxFlyHeight = 8000;   // максимальная высота полета (8000м)
    //private double tankVolume;  // обьем бака (литров)
    //private double fuelInTank;  // к-во топлива в баке (литров)
    //private double flightRange; // дальность полета

//    Airplane() {
//        this.model = "Boeing 737";
//        this.type = "Passenger";
//    }

    void setEngineOn() {
        engineOn = true;
        System.out.println("Двигатель включен!\n" + "Пристегните ремни безопасности, переведите столики перед вами " +
                "и спинку Вашего кресла в вертикальное положении во время взлёта.\n");
    }

    void setEngineOff() {
        //выдать ошибку, если кто-то пытаеться выключить двигатель в полете
        //метод можно вызвать только когда самолет приземлился
        engineOn = true;
        System.out.println("Двинатель выключен, любые методы запрещены");
    }
    // взлететь
    void takeOff() {
        if (engineOn == true) {
            System.out.println("Взлетамем!");

        }
        else {
            System.out.println("Двигатель включен,");
        }
    }
    void fly() {
        System.out.println("Мы перешли в режим полета.\n" + "В данном режиме мы можем набирать и снижать высоту" +
                " самолета в пределах от 500м. до 8000м.\n");
        int currentHeight = minFlyHeight;
        Scanner scanner = new Scanner(System.in);

        if (minFlyHeight >= 500 && maxFlyHeight <= 8000) {
            System.out.println("Введите желаемую высоту полета >= 500 && <=8000");
            if (scanner.hasNextInt()) {
                currentHeight = scanner.nextInt();
            }
            if (currentHeight < minFlyHeight || currentHeight > maxFlyHeight) {
                System.out.println("Вы ввели недопустимую высоту, желаете приземлиться? [Y/N]\n");
                String choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("y")) {
                    land();
                    }
                }
//            else {
//                System.out.println("Вы совершили ошибку, попробуйте еще раз!");
//                currentHeight = scanner.nextInt();
//            }
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

}