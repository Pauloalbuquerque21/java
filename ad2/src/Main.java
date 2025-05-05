import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        //Instanciei a variavel LeituraTeclado, para poder inputs
        Scanner leituraTeclado = new Scanner(System.in);

        //objeto catalogo sendo instânciando com a class Catalogo
        Catalogo catalogo = new Catalogo();

        //Entrada para quantas plataformas
        System.out.print("Quantas plataformas serão cadastradas?");
        int quantidade_catalogo = leituraTeclado.nextInt();

        //resolver o problema, pois quando tem um input de o int depois um input de string, o de string pula
        leituraTeclado.nextLine();

        //Array com os arquvis
        String[] streamer = new String[quantidade_catalogo];

        //Class Filme instãnciar a variavel filmes

        Filme filmes = new Filme();

        //Entrada do nome do arquivo no vetor streamer[]
        for(int i = 0;i < streamer.length; i++) {
            System.out.print("Qual o nome do arquivo:");
            String nomeArquivo = leituraTeclado.nextLine();
            streamer[i] = nomeArquivo;
        }


        BufferedReader plataformaTodo = null;

        try {
            for (int i = 0; i < streamer.length; i++) {
                //Abre o arquivo e prepara para leitura
                FileReader arquivoPlataforma = new FileReader(streamer[i]);

                plataformaTodo = new BufferedReader(arquivoPlataforma);


                String linhaPlataforma = plataformaTodo.readLine();
                System.out.println(linhaPlataforma);
                //Filme objStrime = new Filme(linhaPlataforma);
                System.out.println("--");
                //int processo = 0;
                //while (linhaPlataforma != null) {
                    //if (processo == 0) {
                        //linhaPlataforma = plataformaTodo.readLine();
                        catalogo.adicionarCatalogo(linhaPlataforma);


                    int vezesFilmes = 0;

                do{
                    linhaPlataforma = plataformaTodo.readLine();

                    //criando um arrary, para dividir as informações em cada linha
                    String[] dadosLinha = new String[3];

                    //Condição para quando for null, não ler
                    if(linhaPlataforma != null){
                        //Somar o número de vezes de filmes
                        vezesFilmes+=1;


                        System.out.println(linhaPlataforma);
                        dadosLinha = linhaPlataforma.split(";");

                        //Usar os métodos das class
                        System.out.println(Integer.parseInt(dadosLinha[2].trim()));
                        filmes.adicionarDuracao(Integer.parseInt(dadosLinha[2].trim()));
                        System.out.println(dadosLinha[1]);
                        filmes.adicionarGenero(dadosLinha[1]);
                        System.out.println(dadosLinha[0]);
                        filmes.adicionarTitulo(dadosLinha[0]);



                    }
                }while (linhaPlataforma != null);

                //Adicionar a quantidade de vezes do filme
                catalogo.adicionarnumeroFilmes(vezesFilmes);

                //*****printar o vetor duração
                System.out.print("Numero de durações:");
                filmes.imprimirVetorDuracao();

                //****imprimir o número de filmes
                System.out.print("Números de filmes:");
                catalogo.imprimirVetornumeroFilmes();



                //fechamento do arquivo
                plataformaTodo.close();

            }
            } catch(Exception erro){
                //Vai tratar o erro.
                System.out.print("Deu ruim");
                System.out.println(erro.getMessage());
            }

        //inicar a proxima parte que é ver

        String opcaoDeGenero = "";
        while(!opcaoDeGenero.equals("0")){
            System.out.print("Escolha um gênero, ou digite “0” para encerrar:");
            opcaoDeGenero = leituraTeclado.nextLine();
            catalogo.mostrarFilmesGenero(opcaoDeGenero);


        }
        //Mostrar filmes:

        leituraTeclado.close();

        }









}