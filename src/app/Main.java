package app;

public class Main {
    private static final double CONV_K = 1.8;
    private static final int OFFSET = 32;

    public static void main(String[] args) {
        System.out.println("Temperature Converter App.");
        double fahr = 68;
        double celsius = convFahrToCels(fahr);
        System.out.println(fahr + " F is " + celsius + " C.");
    }

    private static double convFahrToCels(double fahr) {
        return (fahr - OFFSET) / CONV_K;
    }
}