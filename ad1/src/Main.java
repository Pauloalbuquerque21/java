import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leituraTeclado = new Scanner(System.in);


        //Definir o tamanho do vetor horários, que sera das 8 até as 22
        //Instanciando os vetorres
        Bloco vetorHorariosBlocos = new Bloco(14);

        //Instânciar O Folião
        Foliao foliao = new Foliao();

        //Instanciando os blocos
        BlocoInfantil infantil = new BlocoInfantil(14);
        BlocoTematico tematico = new BlocoTematico(14);
        BlocoTradicional tradicional = new BlocoTradicional(14);
        int opcaoTipoUsuario;

        // Analisar o tipo de usuário que vai acessar o sistema.
        do {
            System.out.println("Carnaval Rio de janeiro\nEscolha uma da opções[0,1 ou 2]:\n[0] Organização dos blocos\n[1] Informações e recomendações para curti o carnaval.\n[2]Sair do Sistema");
            System.out.println("Qual opção:");
            opcaoTipoUsuario = leituraTeclado.nextInt();

            //declarar a variavel
            int opcao_sobre_organizar_bloco;
            int opcao_sobre_tema;


            //Condição de cada usuário
            if (opcaoTipoUsuario == 0) {
                do {
                    System.out.print("Organização dos blocos no Centro do Rio.\n");
                    System.out.print("[Os horários diponíveis são de 8 até as 21]\nFavor escolha o horário que será o bloco:");
                    //pega o horário
                    int horario_evento = leituraTeclado.nextInt();
                    // posição que será salvo, -8 pois a posição que será salvo no vetor tem que começa no 0.
                    int posicao = horario_evento - 8;

                    //Condição do horário, se já ou não cadastrado
                    if (vetorHorariosBlocos.getHorarios(posicao) == 0) {
                        vetorHorariosBlocos.setHorarios(horario_evento, posicao);
                        System.out.println("Horário cadastrado");
                        vetorHorariosBlocos.Horarios();

                        // Definir o tema que seria o bloco;
                        System.out.println("Favor selecionar o tipo de bloco, para cadastrar:\nInfantil[0]\nTradicional[1]\nTemático[2]");
                        opcao_sobre_tema = leituraTeclado.nextInt();

                        if (opcao_sobre_tema == 0) {
                            System.out.println("Tema Intantil:");
                            System.out.println("Favor digite a faixa etária");

                            //colhendo informações
                            System.out.print("Inicio da idade:");
                            int inicio_etaria_idade = leituraTeclado.nextInt();
                            System.out.print("Até que idade:");
                            int fim_etaria_idade = leituraTeclado.nextInt();

                            //Input de uma String você usa o nextLine
                            System.out.print("Digite o nome do bloco:");

                            //Fiz isso para evitar de pular o próximo input
                            leituraTeclado.nextLine();

                            String infantil_nome_bloco = leituraTeclado.nextLine();

                            //Salvando a faixa etária
                            infantil.setFaixaEtaria(inicio_etaria_idade, fim_etaria_idade);

                            //Inserindo informações no vetor bloco
                            vetorHorariosBlocos.setBlocos(infantil_nome_bloco, posicao);

                        } else if (opcao_sobre_tema == 1) {

                            System.out.println("Tema Tradicional escolhido:");

                            System.out.println("Favor digite os anos que o bloco Existe:");

                            //Anos que o bloco existe
                            int anos_tradicional = leituraTeclado.nextInt();
                            tradicional.setAnos(anos_tradicional);

                            //Fiz isso para evitar de pular o próximo input
                            leituraTeclado.nextLine();

                            //Digite o nome do bloco
                            System.out.print("Digite o nome do bloco:");
                            String nome_bloco = leituraTeclado.nextLine();
                            vetorHorariosBlocos.setBlocos(nome_bloco, posicao);


                        } else if (opcao_sobre_tema == 2) {
                            System.out.println("Tema Temático:");
                            System.out.print("Qual é o tema do desfile:");

                            //Informa o tema do desfile
                            String tema_desfile = leituraTeclado.nextLine();
                            //Atribuiando aos atrivutos da class Bloco Tematico
                            tematico.setDesfile(tema_desfile);

                            //Fiz isso para evitar de pular o próximo input
                            leituraTeclado.nextLine();

                            //Cadastrar o nome do bloco
                            System.out.print("Digite o nome do bloco:");
                            String nome_bloco = leituraTeclado.nextLine();
                            vetorHorariosBlocos.setBlocos(nome_bloco, posicao);


                        }
                    } else {
                        System.out.println("Horário Indisponível");
                        System.out.println("Segue os horários já marcados:");
                        vetorHorariosBlocos.Horarios();
                    }

                    System.out.println("[0]Adicionar novo bloco\n[1]Deixar de Organizar bloco");
                    opcao_sobre_organizar_bloco = leituraTeclado.nextInt();
                } while (opcao_sobre_organizar_bloco != 1);

            }else if(opcaoTipoUsuario == 1){
                System.out.println("Vamos curti o Carnaval");
                System.out.println("Favor difite o seu nome:");

                //impedi que pule
                leituraTeclado.nextLine();
                String nome_foliao = leituraTeclado.nextLine();
                foliao.setNome(nome_foliao);

                System.out.println("Favor difite o sua idade:");
                int idade_foliao = leituraTeclado.nextInt();
                foliao.setIdade(idade_foliao);

                //impedi que pule
                leituraTeclado.nextLine();

                //Parte que escolhe o estilo musical
                System.out.println("Favor digite o seu estilo musical:");
                String estilo_foliao = leituraTeclado.nextLine();
                foliao.setEstilo(estilo_foliao);

                //Mosta os blocos e horários cadastrados
                vetorHorariosBlocos.cadastrados_blocos();

                System.out.println("Favor digite o horário que você vai curti o bloco\n[8 até 22, favor digitar em o ':00', apenas o número]:");
                int horario_escolhido = leituraTeclado.nextInt();

                // Posta o horário e bloco que o usuário seleciono.
                System.out.println("Bloco selecionado é "+vetorHorariosBlocos.getBlocos(horario_escolhido-8)+" do horário de "+vetorHorariosBlocos.getHorarios(horario_escolhido-8)+" horas");

            }


            } while(opcaoTipoUsuario !=2 );
        leituraTeclado.close();
        }

    }