package com.java21days;

import java.awt.Point;

class Box2 {
    /* Definicja prostokątnego kształtu za pomocą czterech zmiennych 
    określających lewy górny i prawy dolny róg prostokąta */
    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;
    // Gdy powstaje nowy egzemplarz klasy Box wszystkie zmienne ustawiane są na 0
    
    Box2(int x1, int y1, int x2, int y2) {
        // Ustawienie wartości zmiennych 
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;     
    }
    /* Wywołanie pierwszego konstruktora do którego przekazywane są wszystkie 
    przekazywane parametry */
    Box2(Point topLeft, Point bottomRight) {
       this(topLeft.x, topLeft.y, bottomRight.x, bottomRight.y);          
    }
    /* Wywołanie pierwszego konstruktora do którego przekazywane są wszystkie 
    przekazywane parametry */
    Box2(Point topLeft, int w, int h) {
         this(topLeft.x, topLeft.y, topLeft.x + w,topLeft.y + h); 
    }
    
    // Wyświetlenie współrzędnych prostokąta
    void printBox() {
        System.out.print("Box: <" + x1 + "," + y1);
        System.out.print("," + x2 + "," + y2 + ">");
    }
     public static void main(String[] argumetns) {
         Box2 rect;
         
         System.out.println("Wywołanie Box2 ze " 
                 + "współrzędnymi (25,25) i (50,50):");
         rect= new Box2(25,25,50,50);
         rect.printBox();
         
         System.out.println("\nWywołanie Box2 z " 
                 + "punktami ((10,10)) i (20,20):");
         rect = new Box2(new Point(10,10), new Point(20,20));
         rect.printBox();
         
         System.out.println("\nWywołanie Box2 z " 
                 + "punktem (10,10), szerokością 50 i wysokością 50:");
         /* Operator new służy jako argument metody - w ten sposób do metody 
         trafia obiekt utworzony poprzez wywołanie konstruktora. New z nazwa 
         klasy jest wyrażeniem które zwraca obiekt */
         rect = new Box2(new Point(10,10), 50, 50);
         rect.printBox();
     }
}

         