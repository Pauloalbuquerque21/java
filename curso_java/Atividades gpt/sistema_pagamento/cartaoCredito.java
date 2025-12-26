package sistema_pagamento;

public class cartaoCredito implements pagamento {

    public double pagar(double valor){
        double valor_acrescimo = valor * 0.05;
        return valor + valor_acrescimo;
    }
}
