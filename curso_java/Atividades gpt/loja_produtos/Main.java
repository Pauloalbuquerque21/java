package loja_produtos;

public class Main {
    public static void main(String[] args){

        Produto[] produtos = new Produto[10];

        produtos[0] = new Alimento("Banana",100);
        produtos[1] = new Alimento("Maça",100);
        produtos[2] = new Livro("Harry Potter",55.00);
        produtos[3] = new Livro("Percy jackson",60.00);
        produtos[4] = new Livro("Legend",70.00);
        produtos[5] = new Livro("Coração de vanpiro",80.00);
        produtos[6] = new Eletronico("Teclado",25.00);
        produtos[7] = new Eletronico("Computador",35.00);
        produtos[8] = new Eletronico("Tv",1000.00);
        produtos[9] = new Eletronico("Rádio",50.00);

        for(Produto ps: produtos){
            System.out.println("Nome do produto: "+ps.getNome()+"\nValor normal: "+ps.getPreco()+" Valor apois o desnconto: "+ps.calcularDesconto());
        }

    }
}
