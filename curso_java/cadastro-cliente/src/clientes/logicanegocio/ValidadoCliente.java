package clientes.logicanegocio;

import clientes.dominio.Cliente;
import estudo.exceptions.CpfInvalidoException;

public class ValidadoCliente {
    //
    public static void validar(Cliente cliente) throws CpfInvalidoException{
        //Esse length mostra o valor da variavel
        if(cliente.getCpf().length() != 11){
            throw new CpfInvalidoException("Cpf Inválido!");
        }

    }
}
