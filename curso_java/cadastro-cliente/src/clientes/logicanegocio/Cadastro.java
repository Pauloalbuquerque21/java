package clientes.logicanegocio;

import estudo.exceptions.CpfInvalidoException;

import java.util.UUID;
//nome corretode chama esse "TIPO" é tipo parametrizado
//O nome disse "<TIPO>" é GENERIC e tem como objetivo permitir que quem foi
// implementar defina o tipo, desse método salvar e atualizar
public interface Cadastro<TIPO> {
    void salvar(TIPO objetoCadastrar) throws Exception;
    TIPO buscar(UUID codigo);
    void deletar(UUID codigo);
    void atualizar(TIPO objetoAtualizar);
    void imprimirRegistros();

}
