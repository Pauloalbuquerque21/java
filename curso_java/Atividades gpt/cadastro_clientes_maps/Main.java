package cadastro_clientes_maps;

public class Main {
    public static void main(String[] args) {
        //instanciando o controla_maps
        Controla_maps cadastro = new Controla_maps();

        //Instanciando o cliente
        Cliente cliente = new Cliente("12345678901","Paulo");
        //Adicionar o cliente
        cadastro.adicionarCliente(cliente);

        Cliente cliente2 = new Cliente("12345678902","Carlos");
        cadastro.adicionarCliente(cliente2);

        cadastro.removerPorCpf("12345678903");
        cadastro.removerPorCpf("12345678902");







    }
}
