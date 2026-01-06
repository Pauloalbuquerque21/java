package Sistema_funcionarios;

public class Funcionario {
    public String nome;
    public double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularPagamento(){
        return salarioBase;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase(){
        return salarioBase;
    }



}
