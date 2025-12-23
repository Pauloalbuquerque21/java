package loja_produtos;

public class Eletronico extends Produto{

    public Eletronico(String nome, double preco){
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(){
        double desconto = (super.preco * 8) / 100;
        return super.preco - desconto;
    }
}
