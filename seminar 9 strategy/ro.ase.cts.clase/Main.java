public class Main {

    public static void main(String[] args) {
        Client client = new Client("ionel", new PlataCard());
        client.platesteNota(200);
        client.setPlata(new PlataCash());
        client.platesteNota((float)100.2);
        client.setPlata(new PlataBonuriMasa());
        client.platesteNota((float)20.3);
    }
}
