package sobrescrita_de_metodos_nas_subclasses;

public class GerenciaRH {

    private ConexaoBancaria conexaoBancaria;

    public GerenciaRH(ConexaoBancaria conexaoBancaria){
        this.conexaoBancaria = conexaoBancaria;
    }

    @Override
    public void bonificacaoAnual(Gerente gerente){
        double bonificacao = gerente.bonificacaoAnual();
        conexaoBancaria.enviarPagamento(gerente.getCpf(), bonificacao);
        enviarEmail();
    }

    @Override
    public void bonificacaoAnual(Tecnico tecnico){
        double bonificacao = tecnico.bonificacaoAnual();
        conexaoBancaria.enviarPagamento(tecnico.getCpf(), bonificacao);
        enviarEmail();
    }

    private void enviarEmail(){
        System.out.println("Email enviado!");
    }
}
