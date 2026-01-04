package cadastro_cliente;

public enum TipoSexo {
    M("Masculino"),
    F("Feminino"),
    O("Outros");

    private String descricao;

    TipoSexo(String descricao) {
        this.descricao = descricao;
    }
}
