package cadastro_cliente_arraylist;

public class Main {
    public static void main(String[] args){
        cliente cli = new cliente("Paulo","12345678930");
        cliente cli2 = new cliente("Carlos","12345678931");
        cadastroCliente cadastrar = new cadastroCliente();

        //cadastrar
        cadastrar.adicionarCliente(cli);
        cadastrar.adicionarCliente(cli2);

        //Show de list
        cadastrar.listarCliente();

        //verificar se exite o cpf

        System.out.println(cadastrar.buscarPorCpf("12345678930"));

        //Remover a lista
        cadastrar.removerPorCpf("12345678931");
        System.out.println("Resultado da remoção do cpf"+ cadastrar.removerPorCpf("12345678931"));

        //Mostrar novamente
        cadastrar.listarCliente();

    }
}
