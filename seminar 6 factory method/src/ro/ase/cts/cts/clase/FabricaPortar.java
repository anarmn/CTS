package ro.ase.cts.cts.clase;

public class FabricaPortar implements FabricaJucatori {
    @Override
    public Jucator creeazaJucator(String nume, int nrTricou) {
        return new Portar(nume, nrTricou) {
        };
    }
}
