package util;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static final double converterReaisParaDolar(double reais, double dollarRate) {
        return reais * dollarRate;
    }
    // Método para aplicar o IOF de 6% no valor convertido
    public static double aplicarIof(double valorSemIOF) {
        return valorSemIOF * (1 + IOF);
    }
}