package cadastro_clientes_maps;

public class Cliente {
    private String nome;
    private String cpf;

    public Cliente (String cpf,String nome){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf;
    }

}
