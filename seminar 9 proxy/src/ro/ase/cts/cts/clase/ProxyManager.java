package ro.ase.cts.cts.clase;

public class ProxyManager implements Rezervabil{
    private ManagerRezervari managerRezervari;
    private int nrMinimPersoane;

    public ProxyManager(ManagerRezervari managerRezervari, int nrMinimPersoane) {
        this.managerRezervari = managerRezervari;
        this.nrMinimPersoane = nrMinimPersoane;
    }

    @Override
    public void rezerva(int nrPersoane) {
        if (nrPersoane>=this.nrMinimPersoane) managerRezervari.rezerva(nrPersoane);
        else {
            System.out.println("Rezervarea nu se poate efectua. Veniti fara rezervare la restaurant.");
        }
    }
}
