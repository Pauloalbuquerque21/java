package br.com.paulo.heranca;

public class Hipopotamo extends Animal {

    private int forcaMordida;

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
