package pl.javastart.task;

public class WedlugSkaliPodatkowej extends FormaOpodatkowania {

    private static final double KWOTA_1_PROG = 10_000.0;
    private static final double KWOTA_2_PROG = 100_000.0;
    private static final double DRUGA_STAWKA_PODATKU_SKALA = 0.18;
    private static final double TRZECIA_STAWKA_PODATKU_SKALA = 0.32;

    @Override
    public double wyliczPodatek(double przychody, double dochody) {
        if (dochody <= KWOTA_1_PROG) {
            return 0;
        }
        if (dochody <= KWOTA_2_PROG) {
            double kwotaDoOpodatkowania = dochody - KWOTA_1_PROG;
            return kwotaDoOpodatkowania * DRUGA_STAWKA_PODATKU_SKALA;
        } else {
            double podatekDoZaplatyPowyzej1Progu = (KWOTA_2_PROG - KWOTA_1_PROG) * DRUGA_STAWKA_PODATKU_SKALA;
            double kwotaPowzyej2Progu = dochody - KWOTA_2_PROG;
            double podatekDoZaplatyPowyzej2Progu = kwotaPowzyej2Progu * TRZECIA_STAWKA_PODATKU_SKALA;
            return podatekDoZaplatyPowyzej1Progu + podatekDoZaplatyPowyzej2Progu;
        }
    }
}
