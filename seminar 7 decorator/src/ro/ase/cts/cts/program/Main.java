package ro.ase.cts.cts.program;

import ro.ase.cts.cts.clase.Card;
import ro.ase.cts.cts.clase.DecoratorContactlessCard;
import ro.ase.cts.cts.clase.DecoratorContactlessTelefon;

public class Main {
    public static void main(String[] args) {
        Card card = new Card("Ana D");
        card.platesteOnline();
        card.platestePOS();
        System.out.println("...............");
        DecoratorContactlessCard decoratorContactlessCard = new DecoratorContactlessCard(card);
        decoratorContactlessCard.platesteContactLess();
        decoratorContactlessCard.platesteOnline();

        System.out.println("...............");
        DecoratorContactlessTelefon decoratorContactlessTelefon = new DecoratorContactlessTelefon(card);
        decoratorContactlessTelefon.platesteContactLess();

    }


}
