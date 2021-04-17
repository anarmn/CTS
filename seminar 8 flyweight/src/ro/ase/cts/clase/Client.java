package ro.ase.cts.clase;

public class Client implements FlyWeightAbstract {
    private String numeClient;
    private String nrTelefon;
    private String email;

    @Override
    public void printeazaRezervare(Rezervare rezervare) {
        System.out.println(this.toString() + " si "+ rezervare.toString());
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public Client(String numeClient, String nrTelefon, String email) {
        this.numeClient = numeClient;
        this.nrTelefon = nrTelefon;
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
