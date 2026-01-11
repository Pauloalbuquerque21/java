package clientes.dominio;

import clientes.dominio.enums.TipoSexo;

import java.util.UUID;

public class Cliente implements Comparable<Cliente> {

    private UUID codigo;
    private String nome;
    private String cpf;
    private TipoSexo sexo;
    private byte[] foto;

    public Cliente(){
        this.codigo = UUID.randomUUID();
    }

    public UUID getCodigo(){
        return codigo;
    }

    public void setCodigo(UUID codigo){
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public TipoSexo getSexo() {
        return sexo;
    }

    public void setSexo(TipoSexo sexo) {
        this.sexo = sexo;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public String toString() {
        return "Cliente - Código:" + codigo + " - Nome: " + nome + " - CPF: " + cpf + " - Sexo: " + sexo;
    }
    /*
    *@param o the objecto to be compared.
    *@return
    *valor -> exemplo
    * 0 -> São iguais -> 1 == 1
    * 1 -> é maior -> 2 > 1
    * -1 -> é menor -> 1 < 2
    * Usado para inteiros.
    *
    */
    @Override
    public int compareTo(Cliente o){
        /*
        *É um critério por nome, logo nesse caso será diferente.
        * Se for o mesmo nome, o resultado será 0
        * Sé for diferente e a primeira letra do primeiro nome for "a" então é maior que a segunda.
        * Sé for diferente e a primeira letra do segundo nome for "a" então é maior que a segunda.
         */
        int fator = this.nome.compareTo(o.getNome());
        if(fator == 0){
            fator = this.sexo.equals(TipoSexo.F) ? -1 : 1 ;
        }
        return fator;
    }




}
