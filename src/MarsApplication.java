class MarsApplication { 
// Utworzenie metody main
/* Static - metoda jest klasowa współdzielona przez wszystkie obiekty 
MarsApplication */
    public static void main(String[] arguments) {
    // Definicja nowego obiektu wykorzystujacego klasę MarsRobot o nazwie spirit
        MarsRobot spirit = new MarsRobot();
        // Przypisanie nowych wartości do zmiennych egzemplarza
        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;
                
        /* Wywołanie metody showAttributes w celu wyświetlenia aktualnych 
        wartości zmiennych */      
        spirit.showAttributes();
        // Wyświetlenie tekstu w nawiasach za pomocą metody System.out.println()  
        System.out.println("Zwiększenie prędkości do 3.");
        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println("Zmiana temperatury na -90");
        spirit.temperature = -90;
        spirit.showAttributes();
        System.out.println("Sprawdzenie temperatury.");
        /* Wywołanie metody checkTemperature obiektu spirit w celu sprawdzenia 
        czy zmienna egzemplarza spadła poniżej wartości granicznej */   
        spirit.checkTemperature();
        spirit.showAttributes();
    }
}