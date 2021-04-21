package ro.ase.cts.cts.clase;

class Piccolo {
    private String nume;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean esteDebarasata(int nrMasa){
        return (nrMasa%3==0);
    }

    public boolean esteAranjata(int nrMasa){
        return (nrMasa%5==0);
    }

    public Piccolo(String nume) {
        this.nume = nume;
    }
}
