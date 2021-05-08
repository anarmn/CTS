package ro.ase.cts.clase;

public class ContEconomii extends Cont{

    @Override
    public void realizeazaPlata(float suma) {
        if (super.getSold() >= suma){
            System.out.println("Se realizeaza plata din contul de economii de " + suma);
            super.setSold(super.getSold()-suma);
        }else if (super.getSuccesorCont()!=null){
            super.getSuccesorCont().realizeazaPlata(suma);
        }else {
            System.out.println("Nu se poate realiza plata");
        }
    }

    public ContEconomii(float sold) {
        super(sold);
    }
}
