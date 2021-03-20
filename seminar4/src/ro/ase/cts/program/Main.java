package ro.ase.cts.program;

import ro.ase.cts.clase.Parlament;
import ro.ase.cts.clase.ParlamentLazy;

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
    }
}
