package sistema_pagamento;

public class Main {
    public static void main(String[] args){
        pagamento[] pagamentos = new pagamento[6];

        //Processo de incluir as classes no array

        pagamentos[0] = new cartaoCredito();
        pagamentos[1] = new pix();
        pagamentos[2] = new boleto();
        pagamentos[3] = new cartaoCredito();
        pagamentos[4] = new pix();
        pagamentos[5] = new boleto();


        double valor = 100;

        for (pagamento p : pagamentos) {
            System.out.println("Tipo: " + p.getClass().getSimpleName());
            System.out.println("Valor original:" + valor);
            System.out.println("Valor final: " + p.pagar(valor));
            System.out.println("_______________________");
        }
    }
}
