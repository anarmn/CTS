package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ComponentaAbstracta{
    private String numeSectiune;
    private List<ComponentaAbstracta> listaComponente = new ArrayList<>();

    public String getNumeSectiune() {
        return numeSectiune;
    }

    public List<ComponentaAbstracta> getListaComponente() {
        return listaComponente;
    }


    public Sectiune(String numeSectiune) {
        this.numeSectiune = numeSectiune;
    }

    @Override
    public void printareElement() {
        System.out.println("Sectiune " + this.numeSectiune);
        for(ComponentaAbstracta componentaAbstracta : listaComponente){
            componentaAbstracta.printareElement();
        }
    }

    @Override
    public void adaugaNod(ComponentaAbstracta componentaAbstracta) {
        if (componentaAbstracta!=null)
        listaComponente.add(componentaAbstracta);
    }

    @Override
    public void stergeNod(ComponentaAbstracta componentaAbstracta) {
        if (componentaAbstracta!=null)
        listaComponente.remove(componentaAbstracta);
    }

    @Override
    public ComponentaAbstracta getNod(int pozitie) {
        if(pozitie>0 && listaComponente.size()<=pozitie){
           return listaComponente.get(pozitie);
        }
        throw new IndexOutOfBoundsException();
    }
}
