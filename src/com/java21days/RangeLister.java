package com.java21days;

class RangeLister {
    // Utworzenie metody makeRange
    int[] makeRange(int lower, int upper) {
        // Utworzenie pustej tablicy liczb całkowitych
        int[] range = new int[(upper - lower) + 1];
        // Wypełnienie tablicy w pętli for
       for(int i = 0; i < range.length; i++) {
           range[i] = lower++;
       }
       // Zwrócenie wartości
       return range;
    }
    
    public static void main(String[] arguments) {
        // Deklaracja zmiennej 
        int[] range;
        // Stworzenie obiektu lister
        RangeLister lister = new RangeLister();
        
        // Wywołanie metody makeRange z parametrami (4,13) przez metodę main()
        range = lister.makeRange(4,13);
        System.out.print("Tablica: [ ");
        for (int i = 0; i < range.length; i++) {
            System.out.print(range[i] + " ");
        }
        System.out.println("]");
    }
}