package relatorio_financeiros;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Escrita_arquivo {

    public void criarPasta(){
        File file = new File("C:\\Users\\paulo\\OneDrive\\Documentos\\pastaTest\\sistema");
        boolean criou = file.mkdir();
        System.out.println("Pasta croiada" + criou);
    }

    public void criarArquivo(){
        File arquivo = new File("C:\\Users\\paulo\\OneDrive\\Documentos\\pastaTest\\vendou_do_dia.txt");
        try {
            FileWriter filewriter = new FileWriter(arquivo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
