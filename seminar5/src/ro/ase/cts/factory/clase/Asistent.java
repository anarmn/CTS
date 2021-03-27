package ro.ase.cts.factory.clase;

public class Asistent extends PersonalMedical {
    public Asistent(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Asistent{");
        sb.append(super.toString()).append('}');
        return sb.toString();
    }
}
