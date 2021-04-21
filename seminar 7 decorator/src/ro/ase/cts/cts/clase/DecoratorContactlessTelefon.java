package ro.ase.cts.cts.clase;

public class DecoratorContactlessTelefon extends DecoratorAbstract{
    @Override
    public void platesteContactLess() {

        System.out.println( ((Card)super.getCard()).getTitular() + " a realizat o plata contactless cu telefonul");
    }

    public DecoratorContactlessTelefon(CardBancar card) {
        super(card);
    }
}
