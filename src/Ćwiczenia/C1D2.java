package Ćwiczenia;

public class C1D2 {
    public static void main(String[] arguments) {
        double inw = 14000;
        System.out.println(" wartość inwestycji na początku wynosi " + inw);
        inw = inw + .4 * inw;
        System.out.println(" wartość inwestycji po pierwszym roku wynosi " + inw);
        inw = inw - 1500;   
        System.out.println(" wartość inwestycji po drugim roku wynosi " + inw);
        inw = inw + .12 * inw;   
        System.out.println(" wartość inwestycji po trzecim roku wynosi " + inw);
    }
}