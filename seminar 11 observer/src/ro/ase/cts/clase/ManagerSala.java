package ro.ase.cts.clase;

public class ManagerSala extends Subiect{
    private String numeSala;

    public ManagerSala(String numeSala) {
        this.numeSala = numeSala;
    }

    public void anuntaMeci(String tipMeci){
        super.notificaAbonat(this.numeSala + "va gazdui meciul de " + tipMeci);
    }
}
