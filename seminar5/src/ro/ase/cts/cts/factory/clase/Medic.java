package ro.ase.cts.cts.factory.clase;

public class Medic extends PersonalMedical{

    public Medic(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medic{");
        sb.append(super.toString()).append('}');
        return sb.toString();
    }
}
