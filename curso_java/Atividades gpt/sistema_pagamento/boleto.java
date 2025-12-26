package sistema_pagamento;

public class boleto implements pagamento{

    public double pagar(double valor){
        double valor_acrescimo = valor * 0.03;
        return valor + valor_acrescimo;
    }
}
