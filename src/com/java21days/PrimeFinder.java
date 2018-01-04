package com.java21days;

public class PrimeFinder implements Runnable {
    public long target;     // max wartość dla której analizuje sie liczby pierwsze
    public long prime;      // przechowuje wartość znalezionej liczby pierwszej
    public boolean finished = false; // wskazuje czy osiągnięto cel
    private Thread runner;  // zmienna przechowująca obiekt Thread wykorzystywany do uruchomienia wątku
// Metoda konstruktora ustawia zmienną egzemplarza target i uruchamia wątek 
    PrimeFinder(long inTarget) {
        target = inTarget;
        if (runner == null) {
            runner = new Thread(this);
            runner.start(); // wywołanie metody start() powoduje wykonanie metody run() zawartej w klasie
        }
    }

    public void run() { // metoda ta wykonuje większość pracy zwiazanej z wątkiem
        long numPrimes = 0; // liczba znalezionych do tej pory liczb pierwszych
        long candidate = 2; // liczba bedaca kandydatem na liczbe pierwsza - rozpoczyna sie od pierwszej mozliwej liczby pierwszej czyli 2
        while (numPrimes < target) { // petla ta wykonuje dzialania az do momentu znalezienia odpowiedniej liczby liczb pierwszych
            if (isPrime(candidate)) { /* wywołanie metody isPrime, jeśli jest liczba pierwsza - zwiększenie wartości o 1, a zmienna prime otrzymuje
                wartość znalezionej liczby pierwszej */
                numPrimes++;
                prime = candidate;
            }
            candidate++; // zmienna candidate zwiększa się o 1 i pętla zaczyna się od początku
        }
        finished = true; // zakonczenie wszystkich działań - watek nie wykonuje już żandych prac, został ukończony
    }
// Metoda sprawdzająca czy aktualny kandydat(candidate) jest liczbą pierwszą, zwraca wartośc true jeśli jest to liczba pierwsza, false jak nie
    boolean isPrime(long checkNumber) {
        double root = Math.sqrt(checkNumber); 
        for (int i = 2; i <= root; i++) {
            if (checkNumber % i == 0)
                return false;
        }
        return true;
    }
}
