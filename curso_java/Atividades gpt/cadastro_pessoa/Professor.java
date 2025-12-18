package cadastro_pessoa;

public class Professor extends Pessoa{
    public double salario;
    public Professor(String nome, int idade, double salario){
        super(nome, idade);
        this.salario = salario;
    }
}
