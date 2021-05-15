package ro.ase.cts.clase;

public class Main {
    public static void main(String[] args) {
        SpectatorAbstract spectator = new Spectator("Gigel");
        SpectatorAbstract spectator1 = new SpectatorVIP("Gigel", 1);


        spectator.intraPeStadion();
        System.out.println("----------");
        spectator1.intraPeStadion();
    }
}
