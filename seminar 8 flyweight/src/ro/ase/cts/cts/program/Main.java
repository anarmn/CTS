package ro.ase.cts.cts.program;

import ro.ase.cts.cts.clase.FlyWeightFactory;
import ro.ase.cts.cts.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare(1, 1);
        Rezervare rezervare2 = new Rezervare(2, 1);
        Rezervare rezervare3 = new Rezervare(3, 1);

        FlyWeightFactory flyWeightFactory = new FlyWeightFactory();

        flyWeightFactory.getClient("123456").printeazaRezervare(rezervare1);
        flyWeightFactory.getClient("4353454").printeazaRezervare(rezervare2);
        flyWeightFactory.getClient("123456").printeazaRezervare(rezervare3);

    }
}
