package ro.ase.cts.clase;

public abstract class SpectatorAbstract {

    public abstract void seAseazaLaCoada();
    public abstract void prezintaBilet();
    public abstract void seFaceControlCorporal();
    public abstract void ocupaLoc();

    public final void intraPeStadion(){
        seAseazaLaCoada();
        prezintaBilet();
        seFaceControlCorporal();
        ocupaLoc();
    }

}
