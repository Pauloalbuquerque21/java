package conteudo_streaming;

import java.util.List;
import java.util.ArrayList;

public class PlataformaStreaming {
    private List<Conteudo> conteudo;

    public PlataformaStreaming() {
        conteudo = new ArrayList<>();
    }

    public void AddConteudo(Conteudo filme_serie){
        conteudo.add(filme_serie);
    }

    public void ShouwConteudoList(){
        for (Conteudo n : conteudo){
            System.out.println(n);
        }
    }



}
