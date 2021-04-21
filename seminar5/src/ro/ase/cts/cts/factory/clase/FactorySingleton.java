package ro.ase.cts.cts.factory.clase;

public class FactorySingleton {
    private static FactorySingleton factorySingleton = null;

    public static synchronized FactorySingleton getInstance(){
        if (factorySingleton==null){
            factorySingleton = new FactorySingleton();
        }
        return factorySingleton;
    }

    private FactorySingleton() {
    }



    public PersonalMedical create(TipPersonal tip, String nume, int salariu){
        switch (tip){
            case MEDIC : return new Medic(nume, salariu);
            case ASISTENT: return new Asistent(nume, salariu);
            case BRANCARDIER:return new Brancardier(nume, salariu);
            default:throw new IllegalArgumentException("Tipul nu este corect");
        }
    }
}

