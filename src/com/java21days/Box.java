package com.java21days;

import java.awt.Point;

class Box {
    /* Definicja prostokątnego kształtu za pomocą czterech zmiennych 
    określających lewy górny i prawy dolny róg prostokąta */
    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;
    // Gdy powstaje nowy egzemplarz klasy Box wszystkie zmienne ustawiane są na 0
    
    Box buildBox(int x1, int y1, int x2, int y2) {
        // Ustawienie wartości zmiennych za pomocą metody egzemplarza
        /* Argumenty mają takie same nazwy jak zmienne egzemplarza - this służy 
        do odniesienia się do zmiennych egzemplarza */
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        /* Metoda przyjmuje cztery wartości całkowite i zwraca referencje do
        wynikowego obiektu Box */
        return this;
    }
    // Przeciążenie buildBox() tworząc drugą wersje metody
    // Jako argumenty dwa obiekty Point
    Box buildBox(Point topLeft, Point bottomRight) {
        x1 = topLeft.x;
        y1 = topLeft.y;
        x2 = bottomRight.x;
        y2 = bottomRight.y;
        return this;             
    }
    // Kolejne podejście - definiowanie narożnika, szerokości, wysokości
    Box buildBox(Point topLeft, int w, int h) {
        x1 = topLeft.x;
        y1 = topLeft.y;
        x2 = (x1 + w);
        y2 = (y1 + h);
        return this;
    }
    // Wyświetlenie współrzędnych prostokąta
    void printBox() {
        System.out.print("Box: <" + x1 + "," + y1);
        System.out.print("," + x2 + "," + y2 + ">");
    }
     public static void main(String[] argumetns) {
         Box rect = new Box();
         
         System.out.println("Wywołanie buildBox ze " 
                 + "współrzędnymi (25,25) i (50,50):");
         rect.buildBox(25,25,50,50);
         rect.printBox();
         
         System.out.println("\nWywołanie buildBox z " 
                 + "punktami ((10,10)) i (20,20):");
         rect.buildBox(new Point(10,10), new Point(20,20));
         rect.printBox();
         
         System.out.println("\nWywołanie buildBox z " 
                 + "punktem (10,10), szerokością 50 i wysokością 50:");
         /* Operator new służy jako argument metody - w ten sposób do metody 
         trafia obiekt utworzony poprzez wywołanie konstruktora. New z nazwa 
         klasy jest wyrażeniem które zwraca obiekt */
         rect.buildBox(new Point(10,10), 50, 50);
         rect.printBox();
         
     }
}