package ro.ase.cts.cts.program;


import ro.ase.cts.clase.*;
import ro.ase.cts.cts.clase.*;

public class Main {
    public static void afiseazaInfoJucator(FabricaJucatori fabricaJucatori, String nume, int nrTricou){
        Jucator jucator = fabricaJucatori.creeazaJucator(nume, nrTricou);
        System.out.println(jucator.toString());

    }
    public static void main(String[] args) {
        afiseazaInfoJucator(new FabricaAtacant(), "Popmescu", 32);
        afiseazaInfoJucator(new FabricaPortar(), "Gigi", 12);
        afiseazaInfoJucator(new FabricaMijlocasi(), "Dorel", 2);
    }
}
