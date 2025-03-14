package br.com.paulo.empresa;

public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    //método que sera override.
    public double calcularBonificacao(){
        return (salario / 10) + 50;
    }

    public void imprimirRemuneracao(){
        double remuneracao = salario + this.calcularBonificacao();
        System.out.println("Remuneração do funcionario "+nome+" é "+remuneracao);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
