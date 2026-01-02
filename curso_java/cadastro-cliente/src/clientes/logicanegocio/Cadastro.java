package clientes.logicanegocio;

import java.util.UUID;
//nome corretode chaam esse "TIPO" é tipo parametrizado
public interface Cadastro<TIPO> {
    void salvar(TIPO objetoCadastrar);
    TIPO buscar(UUID codigo);
    void deletar(UUID codigo);
    void atualizar(TIPO objetoAtualizar);

}
