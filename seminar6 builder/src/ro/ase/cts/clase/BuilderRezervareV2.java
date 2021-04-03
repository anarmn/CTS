package ro.ase.cts.clase;

public class BuilderRezervareV2 implements AbstractBuilder{
    private int codRezervare;
    private boolean areMancareInclusa;
    private boolean areScaunErgonomic;
    private boolean areBauturaInclusa;
    private boolean areMuzicaAmbientalaInclusa;
    private String genMuzica;


    @Override
    public Rezervare build() {
        return new Rezervare(codRezervare, areMancareInclusa, areScaunErgonomic, areBauturaInclusa, areMuzicaAmbientalaInclusa, genMuzica);
    }

    public BuilderRezervareV2() {
        codRezervare=1000;
        genMuzica="rock";
    }

    public BuilderRezervareV2 setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
        return this;
    }

    public BuilderRezervareV2 setAreMancareInclusa(boolean areMancareInclusa) {
        this.areMancareInclusa = areMancareInclusa;
        return this;
    }

    public BuilderRezervareV2 setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
        return this;
    }

    public BuilderRezervareV2 setAreBauturaInclusa(boolean areBauturaInclusa) {
        this.areBauturaInclusa = areBauturaInclusa;
        return this;
    }

    public BuilderRezervareV2 setAreMuzicaAmbientalaInclusa(boolean areMuzicaAmbientalaInclusa) {
        this.areMuzicaAmbientalaInclusa = areMuzicaAmbientalaInclusa;
        return this;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }
}
