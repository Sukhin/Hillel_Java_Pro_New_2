package app;

public class Main {

    private static final double CONV_F = 1.60934;

    public static void main(String[] args) {
        System.out.println("Distance Unit Converter \n");
        double miInput = 5;
        double kmResult = convMiToKm(miInput);
        System.out.printf("Result is: %.3f miles equal %.3f kilometer.", miInput, kmResult);
    }

    private static double convMiToKm(double miInput) {
        return miInput * CONV_F;
    }
}