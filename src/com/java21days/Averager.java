package com.java21days;

class Averager {
    public static void main(String[] arguments) {
        int sum = 0;
        // Sprawdzenie czy przekazano do aplikacji przynajmniej jeden argument
        if (arguments.length > 0) {
            // Iteracja po wszystkich tekstach znajdujących się w tablicy arguments
            for (int i = 0; i < arguments.length; i++) {
                // Konwersja z obiektów String na liczby
                sum += Integer.parseInt(arguments[i]);
                 
            }
            System.out.println("Suma wynosi: " + sum);
            System.out.println("Średnia wynosi: " + (float)sum/arguments.length);
        }
    }
}