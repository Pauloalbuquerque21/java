package relatorio_financeiros;

import java.io.File;
import java.io.FileWriter;

public class Escrita_arquivo {

    public void criarPasta(){
        File file = new File("C:\\Users\\paulo\\OneDrive\\Documentos\\pastaTest\\sistema")
        boolean criou = file.mkdir();
        System.out.println("Pasta croiada" + criou);
    }

    public void criarArquivo(){
        File arquivo = new File("C:\\Users\\paulo\\OneDrive\\Documentos\\pastaTest\\vendou_do_dia.txt");

        FileWriter filewriter = new FileWrite
    }


}
