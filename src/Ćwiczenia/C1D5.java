package Ćwiczenia;

public class C1D5 {
    String status;
    int speed;
    float temperature;

    C1D5(String inStatus, int inSpeed, float inTemperature) {
        status = inStatus;
        speed = inSpeed;
        temperature = inTemperature;
    }    
    
    void checkTemperature() {
        if (temperature < -80) {
            status = "powrĂłt do domu";
            speed = 5;
        }
    }

    void showAttributes() {
        System.out.println("Status: " + status);
        System.out.println("PrÄ™dkoĹ›Ä‡: " + speed);
        System.out.println("Temperatura: " + temperature);
    }
    
    public static void main(String[] arguments) {
        C1D5 spirit = new C1D5("eksploracja", 2, -80);

        spirit.showAttributes();
        System.out.println("ZwiÄ™kszanie prÄ™dkoĹ›ci do 3.");
        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println("Zmiana temperatury na -100.");
        spirit.temperature = -100;
        spirit.showAttributes();
        System.out.println("Sprawdzenie temperatury.");
        spirit.checkTemperature();
        spirit.showAttributes();
    }
}
