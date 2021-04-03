package ro.ase.cts.clase;

public class Rezervare {
    private int codRezervare;
    private boolean areMancareInclusa;
    private boolean areScaunErgonomic;
    private boolean areBauturaInclusa;
    private boolean areMuzicaAmbientalaInclusa;
    private String genMuzica;

    public Rezervare(int codRezervare, boolean areMancareInclusa, boolean areScaunErgonomic, boolean areBauturaInclusa, boolean areMuzicaAmbientalaInclusa, String genMuzica) {
        this.codRezervare = codRezervare;
        this.areMancareInclusa = areMancareInclusa;
        this.areScaunErgonomic = areScaunErgonomic;
        this.areBauturaInclusa = areBauturaInclusa;
        this.areMuzicaAmbientalaInclusa = areMuzicaAmbientalaInclusa;
        this.genMuzica = genMuzica;
    }



    public void setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
    }

    public void setAreMancareInclusa(boolean areMancareInclusa) {
        this.areMancareInclusa = areMancareInclusa;
    }

    public void setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
    }

    public void setAreBauturaInclusa(boolean areBauturaInclusa) {
        this.areBauturaInclusa = areBauturaInclusa;
    }

    public void setAreMuzicaAmbientalaInclusa(boolean areMuzicaAmbientalaInclusa) {
        this.areMuzicaAmbientalaInclusa = areMuzicaAmbientalaInclusa;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("codRezervare=").append(codRezervare);
        sb.append(", areMancareInclusa=").append(areMancareInclusa);
        sb.append(", areScaunErgonomic=").append(areScaunErgonomic);
        sb.append(", areBauturaInclusa=").append(areBauturaInclusa);
        sb.append(", areMuzicaAmbientalaInclusa=").append(areMuzicaAmbientalaInclusa);
        sb.append(", genMuzica=").append(genMuzica);
        sb.append('}');
        return sb.toString();
    }
}
