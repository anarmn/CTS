package ro.ase.cts.prototype.clase.readers;

import ro.ase.cts.prototype.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class Reader {

    protected String numeFisier;

    public Reader(String numeFisier) {
        this.numeFisier = numeFisier;
    }

    public abstract List<Aplicant>  readAplicanti() throws FileNotFoundException;

    public void readAplicant(Scanner scanner, Aplicant aplicant){
        String nume = scanner.next();
        String prenume = scanner.next();
        int varsta = scanner.nextInt();
        int punctaj = scanner.nextInt();
        int nrProiecte = scanner.nextInt();
        String[] numeProiecte = new String[5];
        for (int i = 0; i < nrProiecte; i++)
            numeProiecte[i] = scanner.next();
        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setDenumiriProiecte(numeProiecte, nrProiecte);
    }

}
