package com.hillel.lesson06.oop;

class Marker {
    final String color;
    boolean isOpen;

    Marker (String color) {
        this.color = color;
    }

    void draw (String text) {
        if ( ! isOpen) {
         throw new RuntimeException("Marker is closed!");
        } else {
            System.out.println(color + ":\"" + text + "\"");
        }
    }

    void open() {
        isOpen = true;
    }

    void closed() {
        isOpen = false;
    }


}
//    final String color;
//    boolean isOpen;
//
//    Marker(String color) {
//        this.color = color;
//    }
//
//    void draw(String text) {
//        if (! isOpen) {
//            throw new RuntimeException("Marker is closed!");
//        } else {
//            System.out.println(color + ":\"" + text + "\"");
//        }
//    }
//    void open() {
//        isOpen = true;
//    }
//    void closed() {
//        isOpen = false;
//    }
//}
