import java.util.Scanner;

public class media_with_condition {
    public static void main(String[] args) {
        Scanner leituraTeclado = new Scanner(System.in);

        //receber as informações
        System.out.println("Primeiro semestre:");
        float semestre1 = leituraTeclado.nextFloat();
        System.out.println("Segundo semestre:");
        float semestre2 = leituraTeclado.nextFloat();
        System.out.println("Terceiro semestre:");
        float semestre3 = leituraTeclado.nextFloat();

        //calculado as variaveis
        double resultado = (semestre1 + semestre2 + semestre3) / 3;

        //output
        System.out.println("A média: "+resultado);

        //Condição
        if(resultado >= 6){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }




    }
}
