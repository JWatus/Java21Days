package org.cadenhead.ecommerce;

import java.util.*;

public class Storefront {
    // Wszystkie produkty przechowywane są w zmiennej egzemplarza catalog
    private LinkedList catalog = new LinkedList();

    /* Metoda addItem() tworzy nowy obiekt Item na podstawie czterech przekazanych
    do metody argumentów. Po utworzeniu elementu jest on przekazywany do listy
    catalog wywołaniem metody add() i przekazaniem Item jako argumentu */
    public void addItem(String id, String name, String price, String quant) {

        Item it = new Item(id, name, price, quant);
        catalog.add(it);
    }
/* Metody getItem()i getSize() zapewniają interfejs dla informacji przekazywanych
w zmiennej catalog. */
    
/* Metoda getItem() wywołuje metodę catalog.get(int) przekazując indeks jako argument
i zwracając obiekt znajdujący się we wskazanym miejscu */
    public Item getItem(int i) {
        return (Item) catalog.get(i);
    }
/* Metoda getSize() wywołuje metodę catalog.size(int) która zwraca
liczbę elementów przechowywanych w catalog */
    public int getSize() {
        return catalog.size();
    }
/* Metoda sort() to miejsce w którym zwracana jest wcześniejsza implementacja
interfejsu Comparable w klasie Item; sortuje ona listy lub inne struktury danych 
na podstawie naturlanego porządku zdefiniowanego dzieki metodzie compareTo() */
    public void sort() {
        Collections.sort(catalog);
    }
}
