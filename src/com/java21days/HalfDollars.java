package com.java21days;

class HalfDollars {
    public static void main(String[] arguments) {
        // Trzy zmienne lokalne przechowujące tablice liczb całkowitych
        int[] denver = { 1_700_000, 4_600_000, 2_100_000 };
        /* Denver.length - nadanie takiego samego rozmiaru jak tablica denver.
        Z racji tego że do poniższych pozycji nie zostały przypisane żadne 
        wartości każdy ich element otrzymuje wartość początkową 0 */
        int[] philadelphia = new int[denver.length];
        int[] total = new int[denver.length];
        // Nowa zmienna całkowita
        int average;
        
        // Przypisanie nowych wartości trzem elementom tablicy philadelphia
        philadelphia [0] = 1_800_000;
        philadelphia [1] = 5_000_000;
        philadelphia [2] = 2_500_000;
        
        // Przypisanie nowych wartości tablicy total
        total[0] = denver[0] + philadelphia[0];
        total[1] = denver[1] + philadelphia[1];
        total[2] = denver[2] + philadelphia[2];
        average = (total[0] + total[1] + total[2]) / 3;
        
        //Wyświetlenie wartości przechowywanych w tablicy total
        System.out.print("Produkcja w 2012: ");
        System.out.format("%,d%n", total[0]);
        System.out.print("Produkcja w 2013: ");
        System.out.format("%,d%n", total[1]);
        System.out.print("Produkcja w 2014: ");
        System.out.format("%,d%n", total[2]);
        System.out.print("Średnia produkcja: ");
        System.out.format("%,d%n", average);
    } 
}