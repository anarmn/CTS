package ro.ase.cts.program;

import ro.ase.cts.clase.Cont;
import ro.ase.cts.clase.ContCredit;
import ro.ase.cts.clase.ContCurent;
import ro.ase.cts.clase.ContEconomii;

public class Main {
    public static void main(String[] args) {
        Cont contCurent = new ContCurent(200);
        Cont contCredit = new ContCredit(150);
        Cont contEconomii = new ContEconomii(1000);

        contCurent.setSuccesorCont(contCredit);
        contCredit.setSuccesorCont(contEconomii);

        contCurent.realizeazaPlata(100);
        contCurent.realizeazaPlata(100);
        contCurent.realizeazaPlata(100);
        contCurent.realizeazaPlata(100);
        contCurent.realizeazaPlata(100);
        contCurent.realizeazaPlata(100);

    }
}
