package Sistema_gestao_jiu_jitsu;

public abstract class Praticante{
    public String nome;
    public int idade;
    public String faixa;

    public void exibirDetalhes(){
        System.out.print("Nome:"+nome+"\nIdade:"+idade+"Faixa:"+faixa);
    }

    //Get e Set do nome
    public void getNome(String nome){
        this.nome = nome;
    }
    public String setNome(){
        return nome;
    }

    //Get e Set da idade
    public void getIdade(int idade) throws IdadeInvalidaException {
        if( idade < 18 || idade >18){
            //O 'throw' (sem o s)  é o que efetivamente dispara o erro
            throw new IdadeInvalidaException("Idade Inválida para praticar Jiu-jitsu");
        }
        this.idade = idade;
    }
    public int setIdade(){
        return idade;
    }

    //Get e Set da Faixa
    public void getFaixa(String faixa){
        this.faixa = faixa;
    }
    public String setFaixa(){
        return faixa;
    }

    public static void Idadeinvalida(int idade) throws Exception {
        if (idade < 18){
            throw new Exception("idade inválida");
        }
    }
}