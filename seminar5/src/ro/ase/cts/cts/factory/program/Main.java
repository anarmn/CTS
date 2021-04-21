package ro.ase.cts.cts.factory.program;

import ro.ase.cts.cts.factory.clase.Factory;
import ro.ase.cts.cts.factory.clase.FactorySingleton;
import ro.ase.cts.cts.factory.clase.PersonalMedical;
import ro.ase.cts.cts.factory.clase.TipPersonal;
import ro.ase.cts.factory.clase.*;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        PersonalMedical medic = factory.create(TipPersonal.MEDIC, "Ionescu", 5000);
        PersonalMedical asistent = factory.create(TipPersonal.ASISTENT, "Dana", 3000);

        System.out.println(medic);
        System.out.println(asistent);

        System.out.println("-------------");
        PersonalMedical medic2 = FactorySingleton.getInstance().create(TipPersonal.MEDIC, "Doru", 7657);
        System.out.println(medic2);
    }
}
