package br.com.paulo.heranca;

public class Hipopotamo extends Animal {

    private int forcaMordida;

    public Hipopotamo(String nome,int idade,int forcaMordida){
        //Super é usado, pois a class pai tem um construtor, então a class filho é obrigado definir os paramentos
        //do construtor da class pai, usamos o super para isso
        super(nome,idade);
        this.forcaMordida = forcaMordida;

    }

    public void ficarNaAgua(){
        System.out.println("Estou na água...");
    }

    public int getForcaNordida(){
        return forcaMordida;
    }

    public void setForcaMordida(int forcaMordida){
        this.forcaMordida = forcaMordida;
    }

}
