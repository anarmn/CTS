package ro.ase.cts.clase;

public class Facade {
    public static boolean esteMasaPregatita(Masa masa)
    {
        if (OperatorMese.esteLibera(masa.getNrMasa())){
            Piccolo piccolo = new Piccolo("gigiel");
            if (piccolo.esteDebarasata(masa.getNrMasa())){
                if( piccolo.esteAranjata(masa.getNrMasa())){
                    return true;
                }
            }
    }return false;
    }
}
