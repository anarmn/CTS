package ro.ase.cts.cts.factory.clase;

public class Factory {
    public PersonalMedical create(TipPersonal tip, String nume, int salariu){
        switch (tip){
            case MEDIC : return new Medic(nume, salariu);
            case ASISTENT: return new Asistent(nume, salariu);
            case BRANCARDIER:return new Brancardier(nume, salariu);
            default:throw new IllegalArgumentException("Tipul nu este corect");
        }
    }
}
