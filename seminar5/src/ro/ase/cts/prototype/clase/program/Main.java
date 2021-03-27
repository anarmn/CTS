package ro.ase.cts.prototype.clase.program;

import ro.ase.cts.prototype.clase.Reteta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> listaDenumiri = new ArrayList<>();
        listaDenumiri.add("apa");
        List<Integer> listaCantitati = new ArrayList<>();
        listaCantitati.add(10);

        Reteta reteta1 = new Reteta(listaDenumiri, listaCantitati);

        Reteta reteta2 = (Reteta)reteta1.copiaza();

        System.out.println(reteta1);
        System.out.println("--------");
        System.out.println(reteta2);
    }
}
