package cadastro_cliente_arraylist;

import java.util.UUID;

public class cliente {
    public UUID codigo;
    public String nome;
    public String cpf;

    public cliente(String nome, String cpf){
        this.codigo = UUID.randomUUID();
        this.nome = nome;
        this.cpf = cpf;
    }


    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public UUID getCodigo(){
        return codigo;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ",CPF: "+ cpf + ",Código:"+ codigo;
    }






}
