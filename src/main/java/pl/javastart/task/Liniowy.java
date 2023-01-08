package pl.javastart.task;

public class Liniowy extends FormaOpodatkowania {
    private static final double KWOTA_1_PROG = 10_000.0;
    private static final double LINIONA_STAWKA_PODATKU = 0.19;

    @Override
    public double wyliczPodatek(double przychody, double dochody) {
        if (dochody <= KWOTA_1_PROG) {
            return 0;
        }
        double dochodMinusKwotaWolna = dochody - KWOTA_1_PROG;
        return dochodMinusKwotaWolna * LINIONA_STAWKA_PODATKU;

    }
}
