package ro.ase.cts.prototype.clase;

public class Restaurant {
    private String nume;
    private int nrAngajati;
    private float cifraAfaceri;

    private static Restaurant restaurant = null;

    public static synchronized Restaurant getInstance(String nume, int nrAngajati, float cifraAfaceri){
        if (restaurant==null){
            restaurant = new Restaurant(nume, nrAngajati, cifraAfaceri);
        }
        return restaurant;
    }

    private Restaurant(String nume, int nrAngajati, float cifraAfaceri) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
        this.cifraAfaceri = cifraAfaceri;
    }

    private Restaurant() {
        nume = "";
        nrAngajati=0;
        cifraAfaceri=0;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setNrAngajati(int nrAngajati) {
        this.nrAngajati = nrAngajati;
    }

    public void setCifraAfaceri(float cifraAfaceri) {
        this.cifraAfaceri = cifraAfaceri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Restaurant{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append(", cifraAfaceri=").append(cifraAfaceri);
        sb.append('}');
        return sb.toString();
    }
}
