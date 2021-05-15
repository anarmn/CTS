package ro.ase.cts.clase;

public class Main {
    public static void main(String[] args) {
        ManagerSala managerSala = new ManagerSala("Dorin Popa");

        Observer client = new Client("Doru");
        Observer client1 = new Client("DoruMihai");

        managerSala.adaugaAbonat(client);
        managerSala.adaugaAbonat(client1);

        managerSala.anuntaMeci("fotbal");

        managerSala.stergeAbonat(client);
        managerSala.anuntaMeci("volei");
    }
}
