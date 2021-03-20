package ro.ase.cts.clase;

public class ParlamentLazy {
    private String tara;
    private int nrParlamentari;
    private int durataMandat;
    private String denumireSediu;

    private static ParlamentLazy parlamentLazy =null;

    public static synchronized ParlamentLazy getInstance(String tara, int nrParlamentari, int durataMandat, String denumireSediu){
        if (parlamentLazy==null){
            parlamentLazy = new ParlamentLazy(tara, nrParlamentari, durataMandat, denumireSediu);
        }
        return parlamentLazy;
    }

    private ParlamentLazy() {
        tara = "";
        nrParlamentari=0;
        durataMandat=0;
        denumireSediu="";
    }

    private ParlamentLazy(String tara, int nrParlamentari, int durataMandat, String denumireSediu) {
        this.tara = tara;
        this.nrParlamentari = nrParlamentari;
        this.durataMandat = durataMandat;
        this.denumireSediu = denumireSediu;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public void setNrParlamentari(int nrParlamentari) {
        this.nrParlamentari = nrParlamentari;
    }

    public void setDurataMandat(int durataMandat) {
        this.durataMandat = durataMandat;
    }

    public void setDenumireSediu(String denumireSediu) {
        this.denumireSediu = denumireSediu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ParlamentLazy{");
        sb.append("tara='").append(tara).append('\'');
        sb.append(", nrParlamentari=").append(nrParlamentari);
        sb.append(", durataMandat=").append(durataMandat);
        sb.append(", denumireSediu='").append(denumireSediu).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
