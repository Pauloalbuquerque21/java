package cadastro_cliente;

public class cliente {
    public String nome;
    public String cpf;
    public TipoSexo sexo;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }

    public void setSexo(TipoSexo sexo){
        this.sexo = sexo;
    }

    @Override
    public String toString(){
        return "Nome: "+nome+"\nCpf: "+cpf+"\nSexo: "+sexo;
    }



}
