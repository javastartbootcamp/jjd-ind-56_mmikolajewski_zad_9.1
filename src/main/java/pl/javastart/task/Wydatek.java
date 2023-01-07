package pl.javastart.task;

public class Wydatek {
    private String name;
    private double kwota;

    public Wydatek(String name, double kwota) {
        this.name = name;
        this.kwota = kwota;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }
}
