package com.java21days;

class HexReader {
    String[] input = { "000A110D1D260219 ",
        "78700F1318141E0C ",
        "6A197D45B0FFFFFF " };

    public static void main(String[] arguments) {
        HexReader hex = new HexReader();
        for (int i = 0; i < hex.input.length; i++)
            hex.readLine(hex.input[i]);
    }

    void readLine(String code) {
        try {
            for (int j = 0; j + 1 < code.length(); j += 2) {
/* Odczytanie dwóch znaków z code przekazanego do metody readLine() przez 
wywołanie metody substring(int,int). Pierwszy argument tej metody określa indeks 
pierwszego znaku, który ma zostać pobrany, a drugi wskazuje indeks ostatniego 
znaku +1 */
                String sub = code.substring(j, j + 2);
/* Wersja dwuargumentowa metody parseInt - drugi fragment określa podstawę do 
konwertowanej wartości; użycie 16 spowoduje konwersje z liczby szesnastkowej */
                int num = Integer.parseInt(sub, 16);
// Wartość szesnastkowa FF ma zakończyć sekwencję - nie należy pokazywać wartości
                if (num == 255) {
                    return;
                }
                System.out.print(num + " ");
            }
/* Ze względu na to że instrukcja znajduje się w bloku try-finally kod z bloku 
finally zostanie wykonany niezależnie od tego w jaki sposób nastąpiło wyjście 
z bloku try. Tekst "**" pojawi się na końcu wiersza z wartościami dziesiętnymi */
        } finally {
            System.out.println("**");
        }
        return;
    }
}
