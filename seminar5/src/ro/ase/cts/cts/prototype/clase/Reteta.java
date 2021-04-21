package ro.ase.cts.cts.prototype.clase;

import java.util.ArrayList;
import java.util.List;

public class Reteta implements AbstractPrototype{
    private List<String> denumiresolutii;
    private List<Integer> cantitati;

    public Reteta(List<String> denumiresolutii, List<Integer> cantitati) {
        this.denumiresolutii = denumiresolutii;
        this.cantitati = cantitati;
        //facem validari =>consumam resurse
    }

    private Reteta() {
        //nu consuma resurse
    }

    public List<String> getDenumiresolutii() {
        return denumiresolutii;
    }

    public void setDenumiresolutii(List<String> denumiresolutii) {
        this.denumiresolutii = denumiresolutii;
    }

    public List<Integer> getCantitati() {
        return cantitati;
    }

    public void setCantitati(List<Integer> cantitati) {
        this.cantitati = cantitati;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("denumiresolutii=").append(denumiresolutii);
        sb.append(", cantitati=").append(cantitati);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public AbstractPrototype copiaza() {
        Reteta copie = new Reteta();
        copie.cantitati = new ArrayList<>();
        copie.cantitati.addAll(this.cantitati);

        copie.denumiresolutii = new ArrayList<>();
        copie.denumiresolutii.addAll(this.denumiresolutii);

        return copie;
    }
}
