package loja_produtos;

public class Livro extends Produto{


    public Livro(String nome, double preco){
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(){
        double desconto = (super.preco * 15) / 100;
        return super.preco - desconto;
    }
}
