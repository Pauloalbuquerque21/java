package br.com.paulo.heranca;

public class Animal {
    private String nome;
    private int idade;

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
    protected void latir(String som){
            System.out.println("O som desse animal é :"+som);
        }
}
