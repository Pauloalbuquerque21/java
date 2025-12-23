package loja_produtos;

public class Alimento extends Produto{

    @Override
    public float calcularDesconto(){
        float desconto = (super.preco * 5) / 100;
        return super.preco - desconto;
    }


}
