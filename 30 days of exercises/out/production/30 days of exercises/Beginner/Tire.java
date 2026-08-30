import java.io.IOException;
import java.util.Scanner;

public class Tire {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int valorOne = scanner.nextInt();
        int valorTwe = scanner.nextInt();
        if ((1 >= valorOne && 40  <= valorOne)  || (1 >= valorTwe && 40 <= valorTwe)){
            throw new IllegalArgumentException("Erro, favor preencher os valores entre 1 e 40");

    }else{
            int resultValor = Math.abs(valorTwe - valorOne);
            System.out.println(resultValor);
        }
    }

}
