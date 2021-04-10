package ro.ase.cts.program;

import ro.ase.cts.clase.Card;
import ro.ase.cts.clase.DecoratorContactlessCard;
import ro.ase.cts.clase.DecoratorContactlessTelefon;

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
