package pl.javastart.task;

import java.util.Arrays;

public class Firma {

    private String nazwa;
    private FormaOpodatkowania formaOpodatkowania;

    private int iloscZaksiegowanychPrzychodow = 0;
    private int iloscZaksiegowanychWydatkow = 0;

    private Przychod[] przychody = new Przychod[10];
    private Wydatek[] wydatki = new Wydatek[10];

    public Firma(String nazwa, FormaOpodatkowania formaOpodatkowania) {
        this.nazwa = nazwa;
        this.formaOpodatkowania = formaOpodatkowania;
    }

    public void wyswietlPodsumowanie() {
        double sumaPrzychodow = zsumujPrzychody();
        double sumaWydatkow = zsumujWydatki();
        double dochody = sumaPrzychodow - sumaWydatkow;

        System.out.printf("======= Firma: %s ===========\n", nazwa);
        System.out.printf("Forma opodatkowania: %s\n", "TODO");
        System.out.printf("Suma przychodów: %.2f zł\n", sumaPrzychodow);
        System.out.printf("Suma wydatków: %.2f zł\n", zsumujWydatki());
        if (formaOpodatkowania instanceof RyczaltEwidencjonowany) {
            System.out.printf("Podatek do zapłacenia: %.2f zł", formaOpodatkowania.wyliczPodatek(sumaPrzychodow));
        } else {
            System.out.printf("Podatek do zapłacenia: %.2f zł", formaOpodatkowania.wyliczPodatek(dochody));
        }
        System.out.print("\n\n");
    }

    private double zsumujWydatki() {
        double sumaWydatkow = 0;
        for (Wydatek wydatek : wydatki) {
            if (wydatek != null) {
                sumaWydatkow += wydatek.getKwota();
            }
        }

        return sumaWydatkow;
    }

    private double zsumujPrzychody() {
        double sumaPrzychodow = 0;
        for (Przychod przychod : przychody) {
            if (przychod != null) {
                sumaPrzychodow += przychod.getKwota();
            }
        }
        return sumaPrzychodow;
    }

    public void dodajPrzychod(String nazwa, double wartosc) {
        sprawdzZapelnienieTablicyPrzychodow();
        przychody[iloscZaksiegowanychPrzychodow] = new Przychod(nazwa, wartosc);
        iloscZaksiegowanychPrzychodow++;
        // TODO
    }

    public void dodajWydatek(String nazwa, double wartosc) {
        sprawdzZapelnienieTablicyWydatkow();
        wydatki[iloscZaksiegowanychWydatkow] = new Wydatek(nazwa, wartosc);
        iloscZaksiegowanychWydatkow++;
        // TODO
    }

    private void sprawdzZapelnienieTablicyPrzychodow() {
        if (iloscZaksiegowanychPrzychodow == przychody.length) {
            Arrays.copyOf(przychody, przychody.length * 2);
        }
    }

    private void sprawdzZapelnienieTablicyWydatkow() {
        if (iloscZaksiegowanychWydatkow == wydatki.length) {
            Arrays.copyOf(wydatki, wydatki.length * 2);
        }
    }
}
