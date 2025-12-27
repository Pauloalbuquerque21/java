package clientes;

import clientes.dominio.Cliente;
import clientes.apresentacao.TelaCadastro;

public class Main {
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        TelaCadastro telaCadastro = new TelaCadastro();
        telaCadastro.setVisible(true);

    }
}
