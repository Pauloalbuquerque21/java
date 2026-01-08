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

}
