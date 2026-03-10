package Sistema_gestao_jiu_jitsu;


public class Professor extends Praticante{
    private int grauNaFaixaPreta;

    public void getGrauNaFaixaPreta(int grau){
        grauNaFaixaPreta = grau;
    }

    @Override
    public void exibirDetalhes(){
        System.out.print("Nome: "+nome+"\nIdade: "+idade+"\nFaixa: "+faixa+"\nGrau da Faixa: "+grauNaFaixaPreta);
    }
}
