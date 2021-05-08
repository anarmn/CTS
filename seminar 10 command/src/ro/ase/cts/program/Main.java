package ro.ase.cts.program;

import ro.ase.cts.clase.ComandaCreare;
import ro.ase.cts.clase.Executant;
import ro.ase.cts.clase.ManagerComenzi;
import ro.ase.cts.clase.ComandaRetragere;

public class Main {
    public static void main(String[] args) {
        ManagerComenzi managerComenzi = new ManagerComenzi();

        Executant cont = new Executant("Gigel Vasile");

        ComandaCreare comandaCreare = new ComandaCreare(cont, 1000);
        managerComenzi.adaugaComanda(comandaCreare);

        managerComenzi.adaugaComanda(new ComandaRetragere(cont, 200));

        managerComenzi.adaugaComanda(new ComandaRetragere(cont,2000));

        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();

    }
}
