package ro.ase.cts.clase;

public class FabricaMijlocasi implements FabricaJucatori {
    @Override
    public Jucator creeazaJucator(String nume, int nrTricou) {
        return new Mijlocas(nume, nrTricou);
    }
}
