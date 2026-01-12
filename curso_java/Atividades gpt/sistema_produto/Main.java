package sistema_produto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto(3,"Teclado",120.00));
        produtos.add(new Produto(1,"Mouse",80.00));
        produtos.add(new Produto(5,"Monitor",900.00));
        produtos.add(new Produto(5,"Cadeira",300.00));
        produtos.add(new Produto(4,"Notebook",3500.00));


    }
}
