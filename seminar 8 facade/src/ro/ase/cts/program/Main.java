package ro.ase.cts.program;

import ro.ase.cts.clase.Facade;
import ro.ase.cts.clase.Masa;

public class Main {

    public static void main(String[] args) {
//        Masa masa = new Masa(30, 10);
//        if (OperatorMese.esteLibera(masa.getNrMasa())){
//            Piccolo piccolo = new Piccolo("Mihai");
//            if (piccolo.esteDebarasata(masa.getNrMasa())){
//               if( piccolo.esteAranjata(masa.getNrMasa())){
//                   System.out.println("Poftiti va rog la masa!");
//               }else{
//                   System.out.println("Masa nu e libera");
//               }
//            }else{
//                System.out.println("Masa nu e libera");
//            }
//        }else{
//            System.out.println("Masa nu e libera");
//        }

        Masa masa1 = new Masa(30, 5);
        if (Facade.esteMasaPregatita(masa1)){
            System.out.println("Masa poate fi ocupata de client");
        }else{
            System.out.println("Mai asteptati");
        }

    }

}
