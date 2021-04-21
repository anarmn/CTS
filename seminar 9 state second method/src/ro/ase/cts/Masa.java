package ro.ase.cts;

public class Masa {
    private int nrMasa;
    private Stare stare;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
        this.stare = new StareLibera();
    }

    void setStare(Stare stare) {
        this.stare = stare;
    }

    public Stare getStare() {
        return stare;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public void ocupaMasa(){
        StareOcupata stareOcupata = new StareOcupata();
        stareOcupata.modificaStare(this);
    }

    public void elibereazaMasa(){
        StareLibera stareLibera = new StareLibera();
        stareLibera.modificaStare(this);
    }

    public void rezervaMasa(){
        StareRezervata stareRezervata = new StareRezervata();
        stareRezervata.modificaStare(this);
    }
}
