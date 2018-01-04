package com.java21days;

class ArrayCopier {
    public static void main(String[] arguments) {
        // Deklaracja tablic
        int[] array1 = { 7, 4, 8, 1, 4, 1, 4 };
        float[] array2 = new float[array1.length];
        
        /* Iteracja przez array1 za pomocą pętli for w celu wyświetlenia 
        wartości z tablicy */
        System.out.print("array1: [");
        for (int i=0; i  <array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println("]");
        
        //Przypisanie wartości array2(i przy okazji konwertujemy) oraz ich wyświetlenie
        System.out.print("array2: [ ");
        int count = 0;
        /* Test w pętli while sprawdza czy zaszedł jeden z dwóch warunków 
        opuszczenia petli */
        while ( count < array1.length && array1[count] !=1) {
            array2[count] = (float) array1[count];
            System.out.print(array2[count++] + " ");
        }
        System.out.println("]");
    }
}