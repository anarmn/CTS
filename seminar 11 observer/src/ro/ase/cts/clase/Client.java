package ro.ase.cts.clase;

public class Client implements Observer {
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void receptionareMesaj(String mesaj) {
        System.out.println("Clientul a receptionat mesajul " + mesaj);
    }
}
