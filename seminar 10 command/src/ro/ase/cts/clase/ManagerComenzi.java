package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
    private List<ComandaAbstracta> listaComenzi = new ArrayList<>(); //e o coada

    public void adaugaComanda(ComandaAbstracta comandaAbstracta){
        this.listaComenzi.add(comandaAbstracta);
    }

    public void executaComanda(){
        //executam de la inceputul listei
        if (listaComenzi.size() !=0){
            this.listaComenzi.get(0).executa();
            this.listaComenzi.remove(0);
        }else {
            throw new IndexOutOfBoundsException();
        }
    }
}
