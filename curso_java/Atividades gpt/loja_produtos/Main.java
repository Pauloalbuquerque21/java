package loja_produtos;

public class Main {
    public static void main(String[] args){
        Alimento alimento = new Alimento("Banana", 100);

        System.out.println(alimento.calcularDesconto());

    }
}
