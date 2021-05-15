public class Spectator extends SpectatorAbstract{
    private String nume;

    public Spectator(String nume) {
        this.nume = nume;
    }

    @Override
    public void seAseazaLaCoada() {
        System.out.println(nume + " se aseaza la coada");
    }

    @Override
    public void prezintaBilet() {
        System.out.println(nume + " prezinta bilet");
    }

    @Override
    public void seFaceControlCorporal() {
        System.out.println(nume + " este trecut prin controlul corporal");
    }

    @Override
    public void ocupaLoc() {
        System.out.println(nume + " ocupa un loc");
    }
}
