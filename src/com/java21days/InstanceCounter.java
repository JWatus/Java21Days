package com.java21days;

public class InstanceCounter {
    /* Definicja prywatnej zmiennej klasowej przechowującej liczbę
    utworzonych obiektów. Zmienna klasowa inicjalizowana jest w momencie
    tworzenia klasy */
    private static int numInstances = 0;
   
    // Pobranie wartości zmiennej klasowej
    // Metoda dotyczy klasy jako całości - zadeklarowana jako zmienna klasowa
    // Protected - tylko ta klasa i jej podklasy zainteresowane będą tą wartością
    protected static int getCount() {
        return numInstances;
        
    }  
    private static void addInstance() {
        numInstances++;
    }
    /* Konstruktor klasy - zostaje on wywołany za każdym razem gdy utworzymy 
    nowy obiekt za pomocą new */
    
    InstanceCounter() {
        InstanceCounter.addInstance();
    }
    
    /* main() - klasę można uruchomić jako aplikację i przetestować wszystkie
    metody. Powstaje tu 500 obiektów klasy InstanceCounter a następnie zostaje 
    wyświetlona zawartość zmiennej addInstances */
    public static void main(String[] arguments) {
        System.out.println("Rozpoczynanie z " + 
                InstanceCounter.getCount() + " obiektów");
        for (int i = 0; i < 500; ++i) {
        new InstanceCounter();
        }
        System.out.println("Utworzono " + 
                InstanceCounter.getCount() + " obiektów");       
    }
}