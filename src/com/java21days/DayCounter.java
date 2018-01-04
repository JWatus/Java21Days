package com.java21days;

class DayCounter {
    /* We wszystkich aplikacjach Javy argumenty wiersza poleceń przechowuje 
    się w tablicy obiektów String.
    W aplikacji DayCounter tablica ta nazywa się arguments - pierwszy argument
    wiersza poleceń trafia do arguments[0], drugi do arguments[1] itd */
    public static void main(String[] arguments) {
        // Utworzenie zmiennych 
        int yearIn = 2016;
        int monthIn = 1;
        /* Sprawdzenie za pomocą arguments.length czy tablica zawiera przynajmniej
        jeden element */
        if (arguments.length > 0)
        /* Jeżeli powyższy warunek jest prawdziwy - wywołanie metody Integer
        w celu przekazania wartości arguments[0] */
            monthIn = Integer.parseInt(arguments[0]);
        if (arguments.length > 1)
            yearIn = Integer.parseInt(arguments[1]);
       /* Wywołanie metody countDays() z argumentami monthIn i year In 
       a następnie wyświetlenie wyniku */
       System.out.println(monthIn + "/" + yearIn + " ma " 
               + countDays(monthIn, yearIn) + " dni.");
    }
    
    static int countDays(int month, int year) {
        // Liczba dni przechowywana jest w zmiennej count
        int count = -1;
        // Użycie month jako wartości warunkowej
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                count = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                count = 30;
                break;
            case 2:
                if(year % 4 == 0)
                    count = 29;
                else
                    count = 28;
                if ((year % 100 == 0) & (year % 400 !=0))
                    count = 28;
        }
        // Zwrócenie wartości count
        return count;
    }
}