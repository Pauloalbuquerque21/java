package cadastro_pessoa;

public class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(String nome,int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public String getDescricao(){
        return nome + "(" + idade + " anos)";
    }


}
