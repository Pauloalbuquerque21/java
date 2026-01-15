package clientes.colecoes;

import clientes.dominio.Cliente;
import clientes.dominio.enums.TipoSexo;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;

public class OrganizacaoClientes {

    private Map<TipoSexo, List<Cliente>> mapa;

    public OrganizacaoClientes() {
        this.mapa = new HashMap<>();
    }

    public void adicionar(Cliente cliente) {
        boolean jaContemSexo = mapa.containsKey(cliente.getSexo());

        if(jaContemSexo){
            List<Cliente> clientes = mapa.get(cliente.getSexo());
        } else{
            List<Cliente> clientes = new ArrayList<>();
            clientes.add(cliente);
            mapa.put(cliente.getSexo(), clientes);
        }
    }

    public List<Cliente> buscarPorSexo(TipoSexo tipo){
        return mapa.get(tipo);
    }

    public List<TipoSexo> obterTiposAdicionados(){
        Set<TipoSexo> tipoSexos = mapa.keySet();
        return new ArrayList<>(tipoSexos);
    }

    public void imprimirClientes(TipoSexo tipo){
        List<Cliente> clientes = mapa.get(tipo);
        if(clientes != null) {
            for (Cliente c : clientes) {
                System.out.println(c);
            }
        } else {
            System.out.println("Lista vazia!");
        }
    }





}
