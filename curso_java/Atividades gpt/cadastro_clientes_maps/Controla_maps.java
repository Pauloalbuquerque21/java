package cadastro_clientes_maps;

import java.util.HashMap;
import java.util.Map;

public class Controla_maps {

    private Map<String, Cliente> clientes;

    public Controla_maps() {
        this.clientes = new HashMap<>();
    }

    public void adicionarCliente(Cliente cliente) {

        if (clientes.containsKey(cliente.getCpf())) {
            System.out.println("Cpf já existe");
        } else {
            clientes.put(cliente.getCpf(), cliente);
            System.out.println("Cliente adicionado");
        }
    }

    public String buscarPorCpf(String cpf) {
        Cliente cliente = clientes.get(cpf);

        if (clientes != null) {
            return cliente.getNome();
        }
        return null;

    }

    public void removerPorCpf(String cpf) {

        if (clientes.containsKey(cpf)) {
            Cliente cliente = clientes.get(cpf);
            System.out.println("O usuário "+cliente.getNome()+" do cpf "+cpf+" ");
            clientes.remove(cpf);
        } else{
            System.out.println("O Cpf "+cpf+" não se encontra na coleção");
        }

    }

    /*
    public void listarClientes(){

        for()
    }
    */
}
