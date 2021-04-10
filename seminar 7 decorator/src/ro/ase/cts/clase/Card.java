package ro.ase.cts.clase;

public class Card implements CardBancar{
    private String titular;

    public Card(String titular) {
        this.titular = titular;
    }

    @Override
    public void platestePOS() {
        System.out.println(titular + " a platit cu POS");
    }

    @Override
    public void platesteOnline() {
        System.out.println(titular + " a platit online");
    }

    public String getTitular() {
        return titular;
    }
}
