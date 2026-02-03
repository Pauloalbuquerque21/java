package relatorio_financeiros;

import java.io.*;

public class Escrita_arquivo {

    public void criarPasta(){
        File file = new File("C:\\Users\\paulo\\OneDrive\\Documentos\\pastaTest\\sistema");
        boolean criou = file.mkdir();
        System.out.println("Pasta criada " + criou);
    }

    public void criarArquivo(){
        File arquivo = new File("C:\\Users\\paulo\\OneDrive\\Documentos\\pastaTest\\sistema\\vendas_do_dia.txt");
        try {
            FileWriter filewriter = new FileWriter(arquivo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void escreverNoArquivo(int id,String produto,double preco_unitario,int quantidade){

        File arquivo = new File("C:\\Users\\paulo\\OneDrive\\Documentos\\pastaTest\\sistema\\vendas_do_dia.txt");

        try {
            FileWriter fileWriter = new FileWriter(arquivo);

            BufferedWriter writer = new BufferedWriter(fileWriter);

            writer.write(id + "," + produto +  "," + preco_unitario + "," + quantidade);

            writer.flush();
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public void lerArquivo(){
        File arquivo = new File("C:\\Users\\paulo\\OneDrive\\Documentos\\pastaTest\\sistema\\vendas_do_dia.txt");
        try {

            FileReader fileReader = new FileReader(arquivo);

            BufferedReader reader = new BufferedReader(fileReader);

            String linha;
            String[] listaDeinformacao;
            double resultadoSoma = 0;

            while ( (linha = reader.readLine()) != null ){
                System.out.print(linha);
                listaDeinformacao = linha.split(",");
                double resultadoDouble = Double.parseDouble(listaDeinformacao[2]);
                resultadoSoma = resultadoSoma + resultadoDouble;
            }
            System.out.print("\n");
            System.out.println(resultadoSoma);

            reader.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }




}
