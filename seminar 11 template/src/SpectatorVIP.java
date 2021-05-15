public class SpectatorVIP extends SpectatorAbstract {
    private String nume;
    private int nrLoja;

    public SpectatorVIP(String nume, int nrLoja) {
        this.nume = nume;
        this.nrLoja = nrLoja;
    }

    @Override
    public void seAseazaLaCoada() {
    }

    @Override
    public void prezintaBilet() {
        System.out.println(nume + " prezinta bilet pentru loja");
    }

    @Override
    public void seFaceControlCorporal() {
        System.out.println(nume + " trece prin controlul corporal");
    }

    @Override
    public void ocupaLoc() {
        System.out.println(nume + "ocupa loc la loja " + nrLoja);
    }
}
