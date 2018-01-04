package Ćwiczenia;

class C2D3 {
    int height;
    int weight;
    int depth; 
}

class Aplikacja {
    public static void main(String[] arguments) {
        C2D3 thing = new C2D3();
        thing.height = 72;
        thing.weight = 1000;
        thing.depth = 420;
        System.out.println("Wysokość : " + thing.height);
        System.out.println("Szerokość : " + thing.weight);
        System.out.println("Głębokość : " + thing.depth);
    }
}
