package br.com.paulo.heranca;
// A Class panda está herdando os métodos
public class Panda extends Animal{
    private String cor;
    private String corSecundaria;

    public Panda(String nome,int idade,String cor,String corSecundaria){
        //Super é usado, pois a class pai tem um construtor, então a class filho é obrigado definir os paramentos
        //do construtor da class pai, usamos o super para isso
        super(nome,idade);
        this.cor = cor;
        this.corSecundaria = corSecundaria;

    }
    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCorSecundaria(){
        return corSecundaria;
    }

    public void setCorSecundaria(String corSecundaria){
        this.corSecundaria = corSecundaria;

    }
}
