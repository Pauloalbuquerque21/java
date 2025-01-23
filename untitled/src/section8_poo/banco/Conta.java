package section8_poo.banco;

public class Conta {
    Cliente titular;
    int numero;
    double saldo;

    void imprimirSaldo(){
        //Imprimir o saldo, dessa conta. Por isso que usei esse "this."
        System.out.println(this.saldo);
    }

}
