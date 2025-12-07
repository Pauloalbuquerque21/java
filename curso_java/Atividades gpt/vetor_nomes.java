import java.util.Scanner;

public class vetor_nomes {
    public static void main(String[] args){
        String[] nome = {"Maria","Carlos","Adriane","Matheos","Paulo"};

        Scanner scanner = new Scanner(System.in);

        //Parte que o usuário coloca as informações
        System.out.println("Digite a palavra:");
        String inform_user = scanner.nextLine();

        System.out.println("Segue a informação digitada do usuário: "+inform_user);

        System.out.println(inform_user.length);


        int tamanho = nome.length;

        System.out.println(tamanho);

        System.out.println(nome[0].charAt(0));

        

    }
    
}
