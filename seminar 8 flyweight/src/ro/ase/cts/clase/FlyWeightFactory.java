package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
    private Map<String, FlyWeightAbstract> clienti;

    public FlyWeightFactory() {
        this.clienti = new HashMap<>();
    }

    public FlyWeightAbstract getClient(String nrTelefon){
        FlyWeightAbstract client = clienti.get(nrTelefon);
        if (client==null){
            client = new Client("gigel", "78757565", "ggigle@gmail.com");
            clienti.put(nrTelefon, client);
        }
        return client;
    }
}
