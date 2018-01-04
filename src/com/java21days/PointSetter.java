package com.java21days; 
// klasa Point z pakietu java.awt reprezentuje punkt w ukł.wsp.
import java.awt.Point; 
// Sprawdzenie i modyfikacja zmiennych egzemplarza w obiekcie Point
class PointSetter { 
    
    public static void main(String[] arguments) {
        // Utworzenie egzemplarza klasy Point
        Point location = new Point(4,13); 
        
        System.out.println("Położenie początkowe:");
        System.out.println("X równe " + location.x);
        System.out.println("Y równe " + location.y);
        
        /* Pobieranie poszczególnych wartości za pomocą notacji kropkowej
        i zamiana wartości x i y */
        
        System.out.println("\nPrzejście do (7,6)");
        location.x = 7;
        location.y = 6;
        
        System.out.println("\nPołożenie końcowe:");
        System.out.println("X równe " + location.x);
        System.out.println("Y równe " + location.y);     
    }   
}