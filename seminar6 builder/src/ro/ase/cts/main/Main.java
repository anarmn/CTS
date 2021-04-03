package ro.ase.cts.main;

import ro.ase.cts.clase.BuilderRezervare;
import ro.ase.cts.clase.BuilderRezervareV2;
import ro.ase.cts.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        BuilderRezervare builderRezervare = new BuilderRezervare()
                .setCodRezervare(1)
                .setAreBauturaInclusa(true)
                .setAreMuzicaAmbientalaInclusa(true)
                .setGenMuzica("folk");
        Rezervare rezervare = builderRezervare.build();
        System.out.println(rezervare.toString());

        Rezervare rezervare2 = new BuilderRezervare()
                .setCodRezervare(3)
                .setAreBauturaInclusa(true).build();

        System.out.println(rezervare2.toString());
        
        BuilderRezervareV2 builderRezervareV2 = new BuilderRezervareV2()
                .setAreMancareInclusa(true)
                .setAreScaunErgonomic(true);

        Rezervare rezervareNoua = builderRezervareV2.setCodRezervare(10).build();
        Rezervare rezervareNoua2 = builderRezervareV2.setCodRezervare(11).build();

        System.out.println(rezervareNoua.toString());
        System.out.println(rezervareNoua2.toString());
    }
}
