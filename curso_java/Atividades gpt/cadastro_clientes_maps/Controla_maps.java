package cadastro_clientes_maps;

import java.util.HashMap;
import java.util.Map;

public class Controla_maps {

    private Map<String, Cliente> clientes;

    public Controla_maps() {
        this.clientes = new HashMap<>();
    }

    public void adicionarCliente(Cliente cliente){

        if (clientes.containsKey(cliente.getCpf())) {
            System.out.println("Cpf já existe");
        }else{
            clientes.put(cliente.getCpf(), cliente);
            System.out.println("Cliente adicionado");
        }
    }

    public String buscarPorCpf(String cpf){
        String nomeCliente = clientes.get(cpf);
        return nomeCliente;
    }

}
