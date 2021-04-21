package ro.ase.cts.cts.prototype.clase.readers;

import ro.ase.cts.cts.prototype.clase.Angajat;
import ro.ase.cts.cts.prototype.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends Reader{

    public AngajatiReader(String numeFisier) {
        super(numeFisier);
    }

    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(super.numeFisier));
        scanner.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (scanner.hasNext()) {
           Angajat angajat = new Angajat();
           super.readAplicant(scanner, angajat);
            int salariu = scanner.nextInt();
            String ocupatie = scanner.next();
            angajat.setSalariu(salariu);
            angajat.setOcupatie(ocupatie);
            angajati.add(angajat);
        }
        scanner.close();
        return angajati;
    }



}
