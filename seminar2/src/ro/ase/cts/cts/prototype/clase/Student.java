package ro.ase.cts.cts.prototype.clase;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;
	public static float sumaFinantata = 20;
	
	
	public String getFacultate() {
		return facultate;
	}

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	public int getAnStudii() {
		return anStudii;
	}

	public void setAnStudii(int anStudii) {
		this.anStudii = anStudii;
	}


	public Student() {
		super();
		
	}

	public static void setSumaFinantata(float sumaFinantata) {
		Student.sumaFinantata = sumaFinantata;
	}

	@Override
	public float getFinantare() {
		return sumaFinantata;
	}

	public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, String facultate, int an_studii) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.facultate = facultate;
		this.anStudii = an_studii;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Angajat: ").append(super.toString()).append(", Facultate = ").append(this.facultate)
				.append(", An studii = ").append(this.anStudii).append(".");
		return builder.toString();
	}

	
}
