/* Demonstracja tworzenia różnych typów obiektów z różną liczbą i różnymi 
typami argumentów*/

package com.java21days;

import java.util.StringTokenizer; 

class TokenTester {
    
    public static void main(String[] arguments) {
        // Tworzenie egzemplarzy klasy StringTester
        StringTokenizer st1, st2; /* Można umieścić też klasę przed nazwą 
        obiektu (wiersz 17 i 25)*/
        
        // Definicja argumentu (zmiennej egzemplarza) - obiekt String o nazwie quote 1
        String quote1 = "GOOG 530,80 -9,98";  
        /* Tworzenie nowego obiektu wskazanej klasy (StringTokenizer) 
        z domyślnym sposobem podziału (spacja) */
        st1 = new StringTokenizer(quote1);          
        System.out.println("Token 1: " + st1.nextToken());
        System.out.println("Token 2: " + st1.nextToken());
        System.out.println("Token 3: " + st1.nextToken());
        
        String quote2 = "RHT@75,00@0,22";
        /* Tworzenie drugiego obiektu StringTokenizer z dwoma argumentami. 
        Drugi argument wskazuje że to @ jest znacznikiem podziału na tokeny*/
        st2 = new StringTokenizer(quote2, "@"); 
        System.out.println("\nToken 1: " + st2.nextToken());
        System.out.println("Token 2: " + st2.nextToken());
        System.out.println("Token 3: " + st2.nextToken());
    }
}