package ro.ase.cts.clase;

public class FabricaFundas implements FabricaJucatori{
    @Override
    public Jucator creeazaJucator(String nume, int nrTricou) {
        return new Fundas(nume, nrTricou);
    }
}
