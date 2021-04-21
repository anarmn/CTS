package ro.ase.cts.cts.clase;

public abstract class DecoratorAbstract implements CardBancar{
    private CardBancar card;

    public DecoratorAbstract(CardBancar card) {
        this.card = card;
    }

    public abstract void platesteContactLess();

    @Override
    public void platestePOS() {
        this.card.platestePOS();
    }

    @Override
    public void platesteOnline() {
        this.card.platesteOnline();
    }

    public CardBancar getCard() {
        return card;
    }
}
