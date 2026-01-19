package clientes.logicanegocio;

import clientes.dominio.Cliente;
import estudo.exceptions.CpfInvalidoException;

public class ValidadoCliente {
    //O throws tem como objetivo criar regras, ou seja, quem chamar esse método validar,
    //vai ter que tratar, pois vai lançar esse CpfInvalidoException
    //throw lança a exceção, throws avisa que ela pode acontecer
    public static void validar(Cliente cliente) throws CpfInvalidoException{
        //Esse length mostra o valor da variavel
        if(cliente.getCpf().length() != 11){
            throw new CpfInvalidoException("Cpf Inválido!");
        }

    }
}
