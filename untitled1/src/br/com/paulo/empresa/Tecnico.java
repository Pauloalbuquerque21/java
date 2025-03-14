package br.com.paulo.empresa;

//Está herdando da class Funcionário, ou seja, Tecnico é uma class filho de Funcionario
public class Tecnico extends Funcionario {

    private String especialidade;

    public String getEspecialidade(){
        return especialidade;
    }

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
}
