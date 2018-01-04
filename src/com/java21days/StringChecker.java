package com.java21days;

class StringChecker {
    
    public static void main(String[] arguments) {
        // Utworzenie nowego obiektu String
        String str = "Lannister zawsze spłaca swoje długi.";
        // Wyświetlenie tekstu
        System.out.println("Tekst to: " + str);    
        // Wywołanie metody lenght()
        System.out.println("Długośc tekstu: " 
                + str.length());
        // Wywołanie metody charAt()
        System.out.println("Znak na pozycji 6.: " 
                + str.charAt(6));
        /* Wywołanie metody substring() - od znaku do znaku, mozna wywolac tez 
        z jednym argumentem  - wtedy metoda zwraca fragment od wskazanego znaku 
        do końca*/
        System.out.println("Fragment od znaku 10. do 16.: " 
                + str.substring(10,16));
        // Wywołanie metody indeksOf()
        System.out.println("Indeks pierwszej litery 't': " 
                + str.indexOf('t'));   
        // Wywołanie metody indeksOf() - inne użycie
        System.out.println("Indeks początku podtekstu: " 
                + "\"długi\": " + str.indexOf("długi"));
        // Wywołanie metody toUpperCase()
        System.out.println("Tekst zapisany wielkimi literami: " 
                + str.toUpperCase());
    }
}