package ro.ase.cts.clase;

public class Leasing {
    private String numeClient;
    private int suma;

    public Leasing(String numeClient, int suma) {
        this.numeClient = numeClient;
        this.suma = suma;
    }

    public void oferaLeasing(){
        System.out.println(numeClient + " a primit un leasing in valoare de "+ suma);
    }
}