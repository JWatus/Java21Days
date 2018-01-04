package Ćwiczenia;

import java.util.StringTokenizer; 

class C1D3 {
    
    public static void main(String[] arguments) {
      
        String data = "15/07/1992";
        
        StringTokenizer uro = new StringTokenizer(data, "/"); 
        System.out.println("Urodziny: " + data);
        System.out.println("Dzień: " + uro.nextToken());
        System.out.println("Miesiąc: " + uro.nextToken());
        System.out.println("Rok: " + uro.nextToken());
    }
}

class Birthday {
    public static void main(String[] arguments) {
        String birthday = "29/04/2016";
        String day = birthday.substring(0, 2);
        String month = birthday.substring(3, 5);
        String year = birthday.substring(6, 10);
        System.out.println("Urodziny: " + birthday);
        System.out.println("DzieĹ„: " + day);
        System.out.println("MiesiÄ…c: " + month);
        System.out.println("Rok: " + year);
    }
}