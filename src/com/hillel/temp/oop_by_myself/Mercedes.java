package com.hillel.temp.oop_by_myself;

public class Mercedes {
    public static void main(String[] args) {
        Car MercedesGClass = new Car();
        MercedesGClass.brand = "Mercedes-Benz";
        MercedesGClass.model = "G-Class Mercedes-AMG G63 G-Tonic 4Matic";
        MercedesGClass.bodyType = "off-road";
        MercedesGClass.horsePower = 585;
        MercedesGClass.color = "black";
        MercedesGClass.vin = 89467898;
        MercedesGClass.engineV = 5.0;
        MercedesGClass.tankVolume = 100;
        MercedesGClass.seats = 4;
        MercedesGClass.fuelInTank = 90;

        MercedesGClass.drive(200);
        System.out.println(MercedesGClass.fuelInTank);
    }

}
