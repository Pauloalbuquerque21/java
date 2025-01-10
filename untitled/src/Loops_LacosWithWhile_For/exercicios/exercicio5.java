package Loops_LacosWithWhile_For.exercicios;
public class exercicio5 {
    public static void main(String[] args) {

        int valor = 0;
        while(valor <= 100) {
            valor += 1;
            //condição de and no java é &&
            if ((valor % 3 == 0) && (valor % 5 !=0)){
                System.out.println("Fizz");
            }else if((valor % 5 == 0) && (valor % 3 != 0)){
                System.out.println("Buzz");
            }else if ((valor % 5 == 0) && (valor % 3 == 0)){
                System.out.println("FizzBuzz");
            }else{
                System.out.println(valor);
            }

        }
    }
}
