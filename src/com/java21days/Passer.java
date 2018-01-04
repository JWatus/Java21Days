package com.java21days;

class Passer {
    
    void toUpperCase(String[] text) {
        for (int i=0; i < text.length; i++) {
        text[i] = text[i].toUpperCase();
        }
    }
    /* Aplikacja Passer wykorzystuje argumenty wiersza poleceń umieszczone
    w tablicy arguments */
    public static void main(String[] arguments) {
        /* Aplikacja Passer tworzy obiekt passer i wywołuje jego metodę 
        toUpperCase() przekazując tablicę arguments jako argument */
        Passer passer = new Passer();
        passer.toUpperCase(arguments);
        for (int i = 0; i < arguments.length; i++) {
            System.out.print(arguments[i] + " ");
        }
        System.out.println();
    }
}