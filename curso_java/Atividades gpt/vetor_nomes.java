import java.util.ArrayList;
import java.util.Scanner;

public class vetor_nomes {
    public static void main(String[] args){
        String[] nome = {"Maria","Carlos","Adriane","Marheos","Paulo"};

        Scanner scanner = new Scanner(System.in);

        //Parte que o usuário coloca as informações
        System.out.println("Digite a palavra:");
        String inform_user = scanner.nextLine();

        System.out.println("Segue a informação digitada do usuário: "+inform_user);

        System.out.println(inform_user.length());

        ArrayList<String> nomes_lista = new ArrayList<>();

        for (int i=0;i<nome.length;i++){
            int accountant = 0;
            for (int e=0;e<inform_user.length();e++){
                if(nome[i].charAt(e)==inform_user.charAt(e)){
                    accountant = accountant + 1;
                }
            }
            if(inform_user.length()==accountant){
                nomes_lista.add(nome[i]);
            }
        }

        System.out.println(nomes_lista);



        int tamanho = nome.length;

        System.out.println(tamanho);

        System.out.println(nome[0].charAt(0));

        

    }
    
}
