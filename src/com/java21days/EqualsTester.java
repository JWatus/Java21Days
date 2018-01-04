package com.java21days;

class EqualsTester {
    public static void main(String [] arguments) {
        // Tworzenie egzemplarzy klasy StringTester
        String str1, str2;
        // Przypisanie tekstu do str1
        str1 = "Chłopie, ale to się rozrasta.";
        // Przypisanie wartości str1 do str2
        str2 = str1;
       // Teraz str1 i str2 wskazują na ten sam obiekt
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
        System.out.println("Ten sam obiekt? " + (str1==str2));
        
        /* Tworzenie nowego obiektu String o takiej samej wartości 
        jak str1 i zapisanie go w str2*/
        str2 = new String(str1);
        
        // Teraz str1 i str2 ,aja taką samą zawartość choć są różnymi obiektami   
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
        System.out.println("Ten sam obiekt? " + (str1==str2));
        System.out.println("Ta sama wartość? " + str1.equals(str2));
    }
}