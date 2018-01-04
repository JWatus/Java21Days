package com.java21days;

public class PrimeThreads {
    public static void main(String[] arguments) {
        PrimeThreads pt = new PrimeThreads(arguments);
    }

    public PrimeThreads(String[] arguments) {
        PrimeFinder[] finder = new PrimeFinder[arguments.length]; 
        // Pętla tworzaca jeden obiekt PrimeFinder dla kazdego przekazanego do programu argumentu wiersza poleceń
        for (int i = 0; i < arguments.length; i++) { 
            try {  /* Wszsytkie metody konwertujące tekst na liczbę zgłaszają wyjątki NumberFormatException
                   więc znajdują się w bloku try-catch obsługujących argumenty nie będące liczbami */
                long count = Long.parseLong(arguments[i]); // Argumenty są tekstami - konstruktor PrimeFinder wymaga wartości typu long - konwersja
                finder[i] = new PrimeFinder(count);
                System.out.println("Szukam liczby pierwszej " + count);
            } catch (NumberFormatException nfe) {
                System.out.println("Błąd: " + nfe.getMessage());
            } // Po utworzeniu obiektu PrimeFinder zaczyna on działać we własnym wątku
        }
        boolean complete = false; // Pętla sprawdzająca czy wątek PrimeFinder został ukończony
        while (!complete) {
            complete = true;
            for (int j = 0; j < finder.length; j++) {
                if (finder[j] == null) continue;
                if (!finder[j].finished) {
                    complete = false;
                } else {
                    displayResult(finder[j]); // Gdy wątek został ukończony metoda displayResult wyświetla znalezioną liczbę pierwszą
                    finder[j] = null; // Wątek ustawiony na null - następuje zwolnienie zasobów
                }
            }
            try {
                Thread.sleep(1000); // Zatrzymanie pętli while na jedną sekundę w każdym przebiegu pętli
                // Ułatwia to maszynie wirtualnej przydzielenie czasu procesora pozostałym wątkom  więc wykonają się szybciej
            } catch (InterruptedException ie) {
                // nic nie rób
            }
        }
    }

    private void displayResult(PrimeFinder finder) {
        System.out.println("Liczba pierwsza " + finder.target
            + " to " + finder.prime);
    }
}
