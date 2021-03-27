package ro.ase.cts.factory.clase;

public class Brancardier extends PersonalMedical{

    public Brancardier(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Brancardier{");
        sb.append(super.toString()).append('}');
        return sb.toString();
    }
}
