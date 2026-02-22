package estudo.funcional;


//Quando colocamos essa anotação, mostra erro se colocar outro método.
//Pois a anotação informa que é uma interface funcional.
@FunctionalInterface
public interface Calculadora {
    int calcular(int x, int y);

    default void fazAlgo(){

    }

    static void fazAlgoStatic(){

    }
}
