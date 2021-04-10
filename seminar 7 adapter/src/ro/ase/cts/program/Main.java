package ro.ase.cts.program;

import ro.ase.cts.clase.AdapterLeasing;
import ro.ase.cts.clase.AdapterLeasingClase;
import ro.ase.cts.clase.Leasing;
import ro.ase.cts.clase.Creditable;
public class Main {

    public static void printeazaInformatiiCredit(Creditable credit){
        credit.crediteaza(); //functia asta reprezinta laptopul unde trb card sd
    }
    public static void main(String[] args) {
        Leasing leasing = new Leasing("Ana", 100);
        AdapterLeasing adapterLeasing = new AdapterLeasing(leasing); //ca si cum introduce cardul micro sd in adaptor

        printeazaInformatiiCredit(adapterLeasing); //folosim cardul care acum e sd la laptop

        System.out.println("......adapter de clase..........");
        AdapterLeasingClase adapterLeasingClase = new AdapterLeasingClase("Gigel", 779); //aici trb sa ne facem pe loc un leasing, nu putem lucra cu unul existent
        printeazaInformatiiCredit(adapterLeasingClase);
    }
}
