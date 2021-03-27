package ro.ase.cts.prototype.clase;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;

	private static float sumaFinantata=30;
	
	public int getClasa() {
		return clasa;
	}

	public void setClasa(int i) {
		this.clasa = i;
	}

	public String getTutore() {
		return tutore;
	}

	public void setTutore(String tutore) {
		this.tutore = tutore;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Elev: ").append(super.toString()).append(", Clasa = ").append(this.clasa)
				.append(", Tutore = ").append(this.tutore).append(".");
		return builder.toString();
	}
	
	public Elev() {
		super();
	}

	@Override
	public float getFinantare() {
		return sumaFinantata;
	}

	public static void setSumaFinantata(float sumaFinantata) {
		Elev.sumaFinantata = sumaFinantata;
	}

	public Elev(String nume, String prenume, int varsta, int punctaj,
				int nrProiecte, String[] denumiriProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nrProiecte,denumiriProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}
	

}
