package ro.ase.cts.cts.clase;

public class FabricaAtacant implements FabricaJucatori{
    @Override
    public Jucator creeazaJucator(String nume, int nrTricou) {
        return new Atacant(nume, nrTricou) {
        };
    }
}
