package br.com.paulo.heranca;
// A Class panda está herdando os métodos
public class Panda extends Animal{
    private String cor;
    private String corSecundaria;

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
