package sistema_produto;

public class Produto implements Comparable<Produto>{
    public int codigo;
    public String nome;
    public double preco;

    public Produto(int codigo, String nome, double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;

    }

    public int getCodigo(){
        return this.codigo;
    }

    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public String toString() {
        return "Codigo: " + codigo + "\nNome: " + nome + "\n Preço:" + preco;
    }

    public int compareTo(Produto outro){
        return this.nome.compareTo(outro.nome);
    }



}
