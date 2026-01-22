package clientes.logicanegocio;

import clientes.dominio.Cliente;
import estudo.exceptions.CpfInvalidoException;
import estudo.exceptions.DadoObrigatorioException;

public class ValidadoCliente {
    //O throws tem como objetivo criar regras, ou seja, quem chamar esse método validar,
    //vai ter que tratar, pois vai lançar esse CpfInvalidoException
    //throw lança a exceção, throws avisa que ela pode acontecer
    public static void validar(Cliente cliente) throws CpfInvalidoException {
        //Esse length mostra o valor da variavel
        if(cliente.getCpf().length() != 11){
            throw new CpfInvalidoException("Cpf Inválido!");
        }

        validarDadosObrigarotios(cliente);

    }

    private static void validarDadosObrigarotios(Cliente cliente){
        if(cliente.getNome() == null || cliente.getNome().isBlank()) {
            throw new DadoObrigatorioException("Campo nome é obrigatório");
        }
        if(cliente.getSexo() == null){
            throw new DadoObrigatorioException("Campo sexo é obrigatório");
        }
    }

}
