package estudo.colecoes;

import clientes.dominio.Cliente;

public class RepositorioClientes {

    private Cliente[] arrayClientes;
    private int posicaoAtual;

    public RepositorioClientes(){
        this.arrayClientes = new Cliente[1000];
        posicaoAtual = 0;
    }

    public void adicionar(Cliente cliente){
        this.arrayClientes[posicaoAtual] = cliente;
        posicaoAtual++;
    }

    public void imprimirClientes(){
        for(Cliente cliente : this.arrayClientes){
            System.out.println(cliente);
        }
    }


}
