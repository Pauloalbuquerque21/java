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



    public void ShowConteudoList(){
        for (Conteudo n : conteudo){
            System.out.println(n);
        }
    }


    public void buscarPorTitulo(String titulo) throws ConteudoNaoEncontradoException {
        for (Conteudo m: conteudo){
            if (titulo.equals(m.getTitulo())){
                m.reproduzir();
                break;
            }else{
                throw new ConteudoNaoEncontradoException("Conteudo não encontrado");
            }
        }

    }




}
