package ro.ase.cts.program;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.readers.AngajatiReader;
import ro.ase.cts.clase.readers.EleviReader;

import ro.ase.cts.clase.readers.Reader;
import ro.ase.cts.clase.readers.StudentiReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static List<Aplicant> readAplicants(Reader reader) throws FileNotFoundException {
		return reader.readAplicanti();
	}

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = readAplicants(new EleviReader("seminar2/elevi.txt"));
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
