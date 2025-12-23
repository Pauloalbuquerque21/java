package loja_produtos;

public class Alimento extends Produto{

    public Alimento(String nome, double preco){
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(){
        double desconto = (super.preco * 5) / 100;
        return super.preco - desconto;
    }


}
