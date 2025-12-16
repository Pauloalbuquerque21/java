package imprementando_heranca_na_pratica;


/**
 *Public -> Visivel em qualquer lugar
 *Private -> Visivel openas na propria classe
 *package ou default -> Somente dentro do pacote
 *protected -> Dentros das classes filhas ou pacotes
 */

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

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void andar(){
        System.out.println("Andando...");
    }

    public void comer(){
        System.out.println("Comendo...");
    }

    public void dormir(){
        System.out.println("ZZZZZZ");
    }

    protected void imprimirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }
}
