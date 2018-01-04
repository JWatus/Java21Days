// Definicja i określenie nazwy klasy; wszystko między { i } to treść klasy
class MarsRobot{
// Definicja zmiennych egzemplarza
   String status;       // Przechowuje obiekty typu String
   int speed;           // Przechowuje wartość typu int
   float temperature;   // Przechowuje wartość typu float
   
   // Definicja pierwszej z metod egzemplarza
   void checkTemperature() {
       if (temperature < -62) {
           status = "powrót do domu";
           speed = 5;    
       }
   }
   // Definicja drugiej z metod egzemplarza
   void showAttributes() {
       System.out.println("Status: " + status);
       System.out.println("Prędkość: " + speed);
       System.out.println("Temperatura: " + temperature);
   }
}
