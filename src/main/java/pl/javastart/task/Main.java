package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Firma firma = new Firma("JanuszPOL", new NaCzarno());

        firma.dodajPrzychod("Remont Mieszkania", 20_000);
        firma.dodajWydatek("Gładzie i farby", 1_000);

        firma.wyswietlPodsumowanie();

        Firma janNowakServices = new Firma("Jan Nowak IT Services", new RyczaltEwidencjonowany());

        janNowakServices.dodajPrzychod("Programowanie", 15_000);
        janNowakServices.dodajWydatek("Energetyki", 200);

        janNowakServices.wyswietlPodsumowanie();

        Firma gumisiePrzetwornia = new Firma("Gumisie, wytwórnia rozkoszy", new WedlugSkaliPodatkowej());

        gumisiePrzetwornia.dodajPrzychod("sok z gumijagów", 100_000);
        gumisiePrzetwornia.dodajPrzychod("dropsy z gumijagód", 50_000);
        gumisiePrzetwornia.dodajWydatek("jagody", 10_000);
        gumisiePrzetwornia.dodajWydatek("magiczny proszek", 10_000);

        gumisiePrzetwornia.wyswietlPodsumowanie();
    }

}
