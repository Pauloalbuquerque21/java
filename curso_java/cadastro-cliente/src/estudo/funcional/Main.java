package estudo.funcional;

public class Main {
    public static void main(String[] args){
        Calculadora soma = new Calculadora(){
            @Override
            public int calcular(int x, int y){
                return x + y;
            }
        };
        //No lugar de fazer todo esse codigo acima,podemos fazer essa forma
        //soma = (x, y) -> x + y;

        System.out.println(soma.calcular(1,1));

        //Forma mais simples
        Calculadora substracao = (num, num2) -> num - num2;

        System.out.println("Subtracao");
        System.out.println(substracao.calcular(20,10));
    }
}
