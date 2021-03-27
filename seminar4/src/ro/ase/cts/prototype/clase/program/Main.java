package ro.ase.cts.prototype.clase.program;

import ro.ase.cts.prototype.clase.Parlament;
import ro.ase.cts.prototype.clase.ParlamentLazy;
import ro.ase.cts.prototype.clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        Parlament parlament = Parlament.getInstance();
        Parlament parlament2 = Parlament.getInstance();
        System.out.println(parlament.toString());
        System.out.println(parlament2.toString());

        System.out.println("---------");

        parlament.setTara("Romania");
        parlament2.setNrParlamentari(300);

        System.out.println(parlament.toString());
        System.out.println(parlament2.toString());

        System.out.println("--------");
        ParlamentLazy parlamentLazy = ParlamentLazy.getInstance("Serbia", 323,8, "hufsdfjhgjsdf");
        ParlamentLazy parlamentLazy2 = ParlamentLazy.getInstance("Norvegia", 100,10, "lallala");
        System.out.println(parlamentLazy.toString());
        System.out.println(parlamentLazy2.toString());

        System.out.println("--------");

        Restaurant restaurantLazy = Restaurant.getInstance("Dristor Kebap", 20, (float) 10000.55);
        Restaurant restaurantLazy2 = Restaurant.getInstance("Socului", 15, (float) 9000.55);

        System.out.println(restaurantLazy.toString());
        System.out.println(restaurantLazy2.toString());
    }
}
