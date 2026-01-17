package estudo.colecoes;

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

        OrganizacaoClientes cadastro = new OrganizacaoClientes();

        Cliente cliente = new Cliente();
        cliente.setCpf("0123");
        cliente.setNome("Fulano");
        cliente.setSexo(TipoSexo.M);

        cadastro.adicionar(cliente);

        Cliente clienteRepetido = new Cliente();
        clienteRepetido.setCpf("0123");
        clienteRepetido.setNome("Fulano");
        clienteRepetido.setSexo(TipoSexo.M);

        cadastro.adicionar(clienteRepetido);

        System.out.print("Femininos:");
        cadastro.imprimirClientes(TipoSexo.M);

        System.out.println("Outros: ");
        cadastro.imprimirClientes(TipoSexo.O);
    }

    private static void exemplosMaps() {

        //iniciando uma coleção Map,a key é inteiro e o valor é string
        Map<Integer, String> mapa = new HashMap<>();

        //Colocando cada valor e associando a key.
        mapa.put(1,"Fulano");
        mapa.put(2,"Cicrano");
        mapa.put(3,"Maria");

        //pegando o valor que esteja associado a key 2.
        String nome = mapa.get(2);
        System.out.println(nome);

        //mapa.remove(1);

        System.out.println(mapa.get(1));

        // verificar se a chave key vai está no Map
        boolean contemChave = mapa.containsKey(2);

        System.out.println("Contem a chave 2: " + contemChave);

        //Verificar se contem o valor informado
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
