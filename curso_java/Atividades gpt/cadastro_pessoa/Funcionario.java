package cadastro_pessoa;

public class Funcionario extends Pessoa {
    public String setor;


    public Funcionario(String nome, int idade, String setor){
        super(nome,idade);
        this.setor = setor;
    }

    public String getSetor(){
        return setor;
    }
}
