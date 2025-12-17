package sobrescrita_de_metodos_nas_subclasses;

public class Tecnico extends Funcionario {
    private String especialidade;

    public String getEspecialidade(){
        return especialidade;
    }

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
}
