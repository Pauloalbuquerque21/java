package sobrescrita_de_metodos_nas_subclasses;

public class Funcionario{
    private String nome;
    private String cpf;
    private double salario;

    public double bonificacao(){
        return ( salario / 10 ) + 50;
    }

    public void imprimirRemuneracao(){
        double bonificacao = this.bonificacao();
        double remuneracao = salario + this.bonificacao();
        System.out.println("Remuneração do funcionario "+ nome + "é: "+remuneracao);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

}