package cadastro_clientes_maps;

import java.util.HashMap;
import java.util.Map;

public class Controla_maps {

    private Map<String, Cliente> clientes;

    public Controla_maps() {
        this.clientes = new HashMap<>();
    }

    public adicionarCliente(Cliente cliente){
        clientes.put(cliente.getCpf(),cliente.getNome());
    }

}
