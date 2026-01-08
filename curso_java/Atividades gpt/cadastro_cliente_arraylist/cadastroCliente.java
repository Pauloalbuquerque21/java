package cadastro_cliente_arraylist;

import java.util.ArrayList;
import java.util.List;


public class cadastroCliente {
    private List<cliente> clientes;

    public cadastroCliente(){
        this.clientes = new ArrayList<>();
    }

    public void adicionarCliente(cliente cliente){
        clientes.add(cliente);
    }

    public void listarCliente(){
        for (cliente c : clientes){
            System.out.println(c);
        }

    }

    public boolean buscarPorCpf(String cpf) {
        for (cliente c : clientes) {
            if (c.getCpf().equals(cpf)) {
                return true;
            }

        }
        return false;
    }

    public boolean removerPorCpf(String cpf){
        for (int c = 1; c < clientes.size();c++){
            if(clientes.get(c).getCpf().equals(cpf)){
                clientes.remove(c);
                return true;
            }

        }
        return false;
    }


}
