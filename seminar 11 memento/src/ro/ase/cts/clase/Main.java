package ro.ase.cts.clase;

public class Main {
    public static void main(String[] args) {
        ManagerMemento managerMemento = new ManagerMemento();

        Meci meci = new Meci("Steaua", "Dinamo", 100, 88, 565);
        managerMemento.adaugaMemento(meci.creareMemento());

        meci.setEchipaGazda("Rapid");
        meci.setNrSpectatori(200);
        managerMemento.adaugaMemento(meci.creareMemento());

        System.out.println(meci.toString());

        meci.setMemento(managerMemento.getMemento(0));
        System.out.println(meci.toString());
    }
}
