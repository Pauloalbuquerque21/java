package clientes.colecoes;

import clientes.dominio.Cliente;
import clientes.dominio.enums.TipoSexo;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1,"Fulano");
        mapa.put(2,"Cicrano");
        mapa.put(3,"Maria");

        String nome = mapa.get(2);
        System.out.println(nome);

        //mapa.remove(1);

        System.out.println(mapa.get(1));

        boolean contemChave = mapa.containsKey(2);
        System.out.println("Contem a chave 2: " + contemChave);

        boolean contemValor = mapa.containsValue("Fulano");
        System.out.println("Contem o valor Fulano? " + contemValor);



    }

    private static void repositorioComArrays(){
        Cliente cliente = new Cliente();
        cliente.setCpf("0123");
        cliente.setNome("Fulano");
        cliente.setSexo(TipoSexo.M);

        Cliente cliente2 = new Cliente();
        cliente2.setCpf("01234");
        cliente2.setNome("Cicrano");
        cliente2.setSexo(TipoSexo.M);

        //asList, trasforma em lista, ou seja, vai pegar o objeto cliente e
        // cliente2 e colocarem eles em uma lista.
        List<Cliente> clientes = Arrays.asList(cliente, cliente2);

        //clientes.sort(Cliente::compareTo);

        for (Cliente c : clientes){
            System.out.println(c);
        }
    }




    private static void repositorioComSet(){
        //Não permiti adicionar o mesmo a mesma informação
        //
        Set<String> linguagens = new HashSet<>();
        linguagens.add("Java");
        linguagens.add("JavaScript");
        linguagens.add("Python");
        linguagens.add("java");


        for (String l : linguagens) {
            System.out.println(l);
        }

    }


    private static void repositorioComList(){
        List<Cliente> listaClientes = new ArrayList<>();

        Cliente cliente = new Cliente();
        cliente.setCpf("0123");
        cliente.setNome("Fulano");
        cliente.setSexo(TipoSexo.M);

        Cliente clienteRepetido = new Cliente();
        clienteRepetido.setCpf("0123");
        clienteRepetido.setNome("Fulano");
        clienteRepetido.setSexo(TipoSexo.M);

        Cliente cliente2 = new Cliente();
        cliente2.setCpf("01234");
        cliente2.setNome("Cicrano");
        cliente2.setSexo(TipoSexo.F);

        listaClientes.add(cliente);
        listaClientes.add(cliente2);

        for (Cliente c : listaClientes ){
            System.out.println(c);
        }

        //Essa lista contem esse cliente, por isso que está dando como resultado true.
        //boolean contem = listaClientes.contains(cliente);
        //System.out.println("Contem? " + contem);

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
