package org.cadenhead.ecommerce;
// Implementacja interfejsu Comparable ułatwiającego sortowanie obiektów klasy
public class Item implements Comparable {
    // Prywatne zmienne egzemplarza związane z produktem
    private String id;
    private String name;
    private double retail;
    private int quantity;
    private double price;
    // Ustawienie zmiennych egzemplarza przez konstruktor
    Item(String idIn, String nameIn, String retailIn, String qIn) {
        id = idIn;
        name = nameIn;
        retail = Double.parseDouble(retailIn);
        quantity = Integer.parseInt(qIn);
        /* Wartość zmiennej price zależąca od tego ile obecnie produktów jest w 
        magazynie i jaki % zmiennej retail się wtedy przyjmuje */
        if (quantity > 400)
            price = retail * .5D;
        else if (quantity > 200)
            price = retail * .6D;
        else 
            price = retail * .7D;
        /* Zaokrąglenie wartości price na dwa miejsca po przecinku (do najbliżej 
        niższej liczby całkowitej */
        price = Math.floor( price * 100 + 0.5) / 100;
    }
    /* Porównanie dwóch obiektów klasy i posortowanie ich od najwyższej do 
    najniższej ceny */
     public int compareTo(Object obj) {
        Item temp = (Item) obj;
        if (this.price < temp.price) {
            return 1;
        } else if (this.price > temp.price) {
            return -1;
        }
        return 0;
    }
// Metody dostępowe zapewniające pobranie wartości przez inne klasy
     /* Każda z metod rozpoczyna się od get  i zawiera napisaną wielką literą
     nazwę zmiennej (ustawieniem wartości początkowej zajmuje się konstruktor) */
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getRetail() {
        return retail;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
