package ro.ase.cts.cts.clase;

public class Main {
    public static void main(String[] args) {
        Sectiune bauturi =new Sectiune("bauturi");
        Sectiune deserturi =new Sectiune("deseruri");

        Produs cola = new Produs("Cola");
        Produs frape = new Produs("Frape");
        Produs tiramisu = new Produs("Tiramisu");

        bauturi.adaugaNod(cola);
        bauturi.adaugaNod(frape);
        deserturi.adaugaNod(tiramisu);

        bauturi.printareElement();
        deserturi.printareElement();



        Sectiune meniu = new Sectiune("Meniu");
        meniu.adaugaNod(bauturi);
        meniu.adaugaNod(deserturi);

        //meniu.printareElement();

        System.out.println("-----------");
        deserturi.adaugaNod(frape);
        bauturi.stergeNod(frape);
    }
}
