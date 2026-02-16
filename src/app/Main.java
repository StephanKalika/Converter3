package app;

public class Main {
    private static final double CONV_K = 1.8;
    private static final int OFFSET = 32;

    public static void main(String[] args) {
        System.out.println("Temperature Converter App.");

        double fahr = 68;
        double cels = 20;

        double celsius = convFahrToCels(fahr);
        double fahrenheit = convCelsToFahr(cels);

        System.out.println("Result is " + celsius + " Celsius and " + fahrenheit + " Fahrenheit.");
    }

    private static double convFahrToCels(double fahr) {
        return (fahr - OFFSET) / CONV_K;
    }

    private static double convCelsToFahr(double cels) {
        return (cels * CONV_K) + OFFSET;
    }
}