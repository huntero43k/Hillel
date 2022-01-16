package com.hillel.temp.oop1;

public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing 737");

        // проверяем состояние и характеристики самолета
        System.out.println("AIRPLANE NAME: " + airplane.getName());
        System.out.println("ENGINE STATE: " + airplane.getEngineState());
        System.out.println("TAKE_OFF STATE: " + airplane.getTakeOffState());
        System.out.println("CURRENT HEIGHT: " + airplane.getCurrentHeight());
        System.out.println("FLY_MODE ACCESS: " + airplane.getFlyModeState());
        System.out.println("MIN/MAX FLY HEIGHT: " + airplane.getMinFlyHeight() + "-" + airplane.getMaxFlyHeight() + " meters");

        //заводим двигатель
        airplane.start();
            System.out.println("--------------------------------------------------\n" +
                            "Engine ON!\n" + "Please fasten your seatbelts, put your seats and table trays " +
                            "to a horizontal position for take-off.\n" + "--------------------------------------------------");

        // проверяем доступ на взлет
        System.out.println("--------------------------------------------------\n" +
                            "Airplane takeoff is available: " + airplane.getTakeOffState() +
                            "\n--------------------------------------------------");

        // взлетаем
        airplane.takeOff();
            System.out.println("^^^^^^^^^^ The plane is taking off! ^^^^^^^^^^\n" +
                            "Good job! " + "We have switched to FLY_MODE.\n" +
                            "In this mode, we can gain and decrease the flight altitude" +
                            " in the range of min-max 500m-8000m\n" +
                            "--------------------------------------------------");

        // тест значения высоты полета по умолчанию после взлета
        //System.out.println(airplane.getCurrentHeight());

        // тестирование ошибки при попытке заглушить двигатель во время полета
        //airplane.stop();

        // меняем высоту полета
        airplane.changeCurrentHeight(501);
            System.out.println("Current height: " + airplane.getCurrentHeight());
        airplane.changeCurrentHeight(5522);
            System.out.println("Current height: " + airplane.getCurrentHeight());
        airplane.changeCurrentHeight(7500);
            System.out.println("Current height: " + airplane.getCurrentHeight());
        airplane.changeCurrentHeight(500);
            System.out.println("Current height: " + airplane.getCurrentHeight());

        // тест введения значения высоты за рамками диапазона
        //airplane.changeCurrentHeight(10000);

        // проверяем возможность посадки
        System.out.println("--------------------------------------------------\n" +
                            "Landing allowed: " + airplane.getLandState() +
                            "\n--------------------------------------------------");

        // приземляемся
        airplane.land();
            System.out.println("--------------------------------------------------\n" +
                            "We have arrived at our destination.\n" + "Thank you for choosing our company. Have a nice day!\n" +
                            "--------------------------------------------------\n");
        // выключаем двигатель
        airplane.stop();

        // на последок проверяем состояние и характеристики самолета
        System.out.println("AIRPLANE NAME: " + airplane.getName());
        System.out.println("ENGINE STATE: " + airplane.getEngineState());
        System.out.println("TAKE_OFF STATE: " + airplane.getTakeOffState());
        System.out.println("CURRENT HEIGHT: " + airplane.getCurrentHeight());
        System.out.println("FLY_MODE ACCESS: " + airplane.getFlyModeState());
        System.out.println("MIN/MAX FLY HEIGHT: " + airplane.getMinFlyHeight() + "-" + airplane.getMaxFlyHeight() + " meters");
    }
}
