package br.com.paulo.heranca;

public class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade) {

        this.idade = idade;
    }
    // como é protedcte, só quem pode usar esse são as classes que herdam os métodos da class animal e que esteja no mesmo pacote
    protected void latir(String som){
            System.out.println("O som desse animal é :"+som);
        }
}
