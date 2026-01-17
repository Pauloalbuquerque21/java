package estudo.exceptions;

import clientes.dominio.Cliente;
import clientes.dominio.enums.TipoSexo;

public class Main {
    public static void main(String[] args) {
        try {
            Cliente cliente = new Cliente();
            cliente.setSexo(TipoSexo.F);
            String descricao = cliente.getSexo().getDescricao();
        } catch (NullPointerException e){
            System.out.println("O tipo sexo estava null!");
        } catch (Exception e){
            System.out.println("Ocorreu um erro invexperado!");
        }

    }
}
