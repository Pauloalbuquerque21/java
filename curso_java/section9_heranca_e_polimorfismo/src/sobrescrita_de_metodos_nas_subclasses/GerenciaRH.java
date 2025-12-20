package sobrescrita_de_metodos_nas_subclasses;

public class GerenciaRH {

    private ConexaoBancaria conexaoBancaria;

    public GerenciaRH(ConexaoBancaria conexaoBancaria){
        this.conexaoBancaria = conexaoBancaria;
    }

    //sobrecarga, pois é remete a um método já existe, porém
    //com parâmetros
    public void bonificacaoAnual(Gerente gerente){
        double bonificacao = gerente.bonificacaoAnual();
        conexaoBancaria.enviarPagamento(gerente.getCpf(), bonificacao);
        enviarEmail();
    }

    //sobrecarga
    public void bonificacaoAnual(Tecnico tecnico){
        double bonificacao = tecnico.bonificacaoAnual();
        conexaoBancaria.enviarPagamento(tecnico.getCpf(), bonificacao);
        enviarEmail();
    }

    /*
    Esse método faz o mesmo que os outros, porém usamos o polimorfismo que seria
    um método que trabalha tanto com uma instãncia gerente e tecnico. o importante
    é que esses métodos sejam filhas do Funcionário



    public void bonificacaoAnual(Funcionario funcionario){
        double bonificacao = funcionario.calcularBonificacaoAnual();
        conexaoBancaria.enviarPagamento(funcionario.getCpf(), bonificacao);
        enviarEmail();
    }

     */





    private void enviarEmail(){
        System.out.println("Email enviado!");
    }
}
