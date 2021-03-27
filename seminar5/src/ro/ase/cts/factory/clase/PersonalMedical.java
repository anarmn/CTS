package ro.ase.cts.factory.clase;

public abstract class PersonalMedical {
    private String nume;
    private int salariu;

    public PersonalMedical(String nume, int salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalMedical{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }
}
