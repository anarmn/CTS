package ro.ase.cts.clase;

public class DecoratorContactlessCard extends DecoratorAbstract{
    public DecoratorContactlessCard(CardBancar card) {
        super(card);
    }

    @Override
    public void platesteContactLess() {
        System.out.println( ((Card)super.getCard()).getTitular() + " a realizat o plata contactless");
    }
}
