package com.hillel.temp.oop1;

public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing 737");

        // проверяем состояние и характеристики самолета
        System.out.println("Имя самолета: " + airplane.getName());
        System.out.println("Двигатель: " + airplane.getEngineState());
        System.out.println("Возможность взлета: " + airplane.getTakeOffState());
        System.out.println("Текущая высота: " + airplane.getCurrentHeight());
        // System.out.println("Минимальная-Максимальная высота полета:" + airplane.getMinFlyHeight());

        //заводим двигатель
        airplane.start();
            System.out.println("Engine ON!\n" + "Please fasten your seatbelts, put your seats and table trays " +
                            "are in the upright position for take-off.\n" + "----------------------------------------");

        airplane.takeOff();
            System.out.println("The plane is taking off! ^^^^^^^^\n" + "----------------------------------------\n" +
                            "Good job! " + "We have switched to flight mode.\n" +
                            "In this mode, we can gain and decrease the flight altitude" +
                            " in the range of 500m (min) up to 8000m (max)\n" +
                            "--------------------------------------------------");
        // тест значения высоты полета по умолчанию после взлета
        //System.out.println(airplane.getCurrentHeight());
        // тестирование ошибки при попытке заглушить двигатель во время полета
        //airplane.stop();
        airplane.changeCurrentHeight(501);
        System.out.println(airplane.getCurrentHeight());
        airplane.changeCurrentHeight(7999);
        System.out.println(airplane.getCurrentHeight());
        // тест введения значения высоты за рамками диапазона
        //airplane.changeCurrentHeight(10000);
        System.out.println(airplane.getLandState());
    }
}
