package app;

public class Main {

    private static final double CONV_F = 1.60934;

    public static void main(String[] args) {
        System.out.println("Distance Unit Converter \n");
        double miInput = 5;
        double kmInput = 10;
        double kmResult = convMiToKm(miInput);
        double miResult = convKmToMi(kmInput);
        System.out.printf("Result is: %.3f miles equal %.3f kilometer. \n" + "Result is: %.3f kilometer %.3f miles.", miInput, kmResult, kmInput, miResult);
    }

    private static double convMiToKm(double miInput) {
        return miInput * CONV_F;
    }

    private static double convKmToMi(double kmInput) {
        return kmInput / CONV_F;
    }
}