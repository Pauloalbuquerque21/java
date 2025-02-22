import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner leituraTeclado = new Scanner(System.in);

        //Definir o tamanho do vator horários
        Bloco vetorhorario = new Bloco(13);

        // Analisar o tipo de usuário que vai acessar o sistema.
        System.out.println("Carnaval Rio de janeiro\nEscolha uma da opções[0 ou 1]:\n[0] Organização dos blocos\n[1] Informações e recomendações para curti o carnaval.");
        System.out.println("Qual opção:");
        int opcaoTipoUsuario = leituraTeclado.nextInt();
        System.out.println(opcaoTipoUsuario);

        //Condição de cada usuário
        if(opcaoTipoUsuario == 0){
            System.out.print("Organização dos blocos, selecionado");
            System.out.print("Favor escolha o horário que será o bloco:");
            int horario_evento =leituraTeclado.nextInt();
            int posicao = horario_evento - 1;
            setHorarios(horario_evento,posicao);

        }
        }
    }