package relatorio_financeiros;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

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

            writer.write("Id: " + id + " - Produto: " + produto +  " - Preço unitario: " + preco_unitario + " - Quantidade: " +quantidade);

            writer.flush();
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
