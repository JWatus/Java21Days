package com.java21days;

import java.awt.Point;
// Rozszerzenie klasy Point
class NamedPoint extends Point {
    String name;
/* Klasa Point ma tylko jeden konstruktor przyjmujący x,y jako argumenty.
   Klasa NamedPoint ma dodatkową zmienną egzemplarza(nazwę pkt) więc definiuje
   konstruktor przyjmując trzy argumenty */
    NamedPoint(int x, int y, String name) {
        super(x, y);
        this.name = name;
    }

    public static void main(String[] arguments) {
        NamedPoint np = new NamedPoint(5, 5, "SmallPoint");
        System.out.println("x wynosi " + np.x);
        System.out.println("y wynosi " + np.y);
        System.out.println("name wynosi " + np.name);
    }
}
