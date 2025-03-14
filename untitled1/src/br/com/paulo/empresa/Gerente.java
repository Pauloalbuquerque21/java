package br.com.paulo.empresa;

public class Gerente extends Funcionario {
    //Isso é uma sobescrita, pegamos um método da Class Funcionário e modificamos para essa class
    //usamos o @everride, porém não é obrigatório.
    // Não pode ter parametro, se não, deixa de ser uma subescrita.
    @Override
    public double calcularBonificacao(){
        double bonificacaoPadrao = super.calcularBonificacao();
        double remuneracaoGerente = bonificacaoPadrao + 500;
        return remuneracaoGerente;
    }
}
