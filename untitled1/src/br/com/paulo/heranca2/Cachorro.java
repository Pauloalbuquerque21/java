package br.com.paulo.heranca2;

import br.com.paulo.heranca.Animal;

public class Cachorro extends Animal {
    private String cor;
    private String temperamento;

    public Cachorro(String nome,int idade,String cor, String temperamento){
        //Super é usado, pois a class pai tem um construtor, então a class filho é obrigado definir os paramentos
        //do construtor da class pai, usamos o super para isso
        super(nome,idade);
        this.cor = cor;
        this.temperamento = temperamento;


    }

    public Cachorro(String cor,String temperamento){
        this.cor = cor;
        this.temperamento = temperamento;
    }

    public void caracteristica(String qual){
        if(qual == "cor"){
            System.out.println("A cor é:"+cor);
    }else if(qual == "temperamento"){
            System.out.println("O temporamento é:"+temperamento);
        }

    }
}
