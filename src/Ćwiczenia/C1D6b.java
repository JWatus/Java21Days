package Ćwiczenia;

import java.util.*;

public class C1D6b {
    private LinkedList catalog = new LinkedList();

    public void addItem(String id, String name, String price,
        String quant, String discount) {

        C1D6 it = new C1D6(id, name, price, quant, discount);
        catalog.add(it);
    }

    public C1D6 getItem(int i) {
        return (C1D6)catalog.get(i);
    }

    public int getSize() {
        return catalog.size();
    }

    public void sort() {
        Collections.sort(catalog);
    }
}

