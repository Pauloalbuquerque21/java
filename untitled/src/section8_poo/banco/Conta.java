package section8_poo.banco;

public class Conta {
    Cliente titular;
    int numero;
    double saldo;

    Conta(){}

    Conta (Cliente titular, int numero, double saldo){
        this.titular = titular;
        this.numero = numero;
        if(saldo >= 0){
            this.saldo = saldo;
        }
    }

    void imprimirSaldo(){
        //Imprimir o saldo, dessa conta. Por isso que usei esse "this."
        System.out.println(this.saldo);
    }

}
