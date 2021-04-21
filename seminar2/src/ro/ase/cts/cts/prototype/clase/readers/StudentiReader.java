package ro.ase.cts.cts.prototype.clase.readers;

import ro.ase.cts.cts.prototype.clase.Aplicant;
import ro.ase.cts.cts.prototype.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader extends Reader {

    public StudentiReader(String numeFisier) {
        super(numeFisier);
    }

    public List<Aplicant> readAplicanti() throws FileNotFoundException, NumberFormatException {
        Scanner scanner = new Scanner(new File(super.numeFisier));
        scanner.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (scanner.hasNext()) {
            Student student = new Student();
            super.readAplicant(scanner, student);

            int an_studii = scanner.nextInt();
            String facultate = (scanner.next()).toString();
            student.setFacultate(facultate);
            student.setAnStudii(an_studii);
            studenti.add(student);
        }
        scanner.close();
        return studenti;
    }

}
