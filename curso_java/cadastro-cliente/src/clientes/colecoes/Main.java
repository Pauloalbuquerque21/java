package clientes.colecoes;

import clientes.dominio.Cliente;
import clientes.dominio.enums.TipoSexo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){



    }

    private static void repositorioComArray() {
        RepositorioClientes repositorioClientes = new RepositorioClientes();

        Cliente cliente = new Cliente();
        cliente.setCpf("0123");
        cliente.setNome("Fulano");
        cliente.setSexo(TipoSexo.M);

        Cliente cliente2 = new Cliente();
        cliente2.setCpf("01234");
        cliente2.setNome("Cicrano");
        cliente2.setSexo(TipoSexo.M);

        repositorioClientes.adicionar(cliente);
        repositorioClientes.adicionar(cliente2);
        repositorioClientes.imprimirClientes();
    }
}
