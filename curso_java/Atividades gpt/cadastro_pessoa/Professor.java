package cadastro_pessoa;

public class Professor extends Pessoa{
    public double salario;

    //Construtor
    public Professor(String nome, int idade, double salario){
        super(nome, idade);
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }

    @Override
    public String getDescricao(){
        return super.getDescricao()+" - Professor - Salário: "+ salario;
    }
}
