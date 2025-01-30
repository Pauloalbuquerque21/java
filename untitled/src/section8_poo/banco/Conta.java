package section8_poo.banco;

public class Conta {
     public Cliente titular;
     public int numero;
     public double saldo;

    public Conta(){}

    public Conta (Cliente titular, int numero, double saldo){
        this.titular = titular;
        this.numero = numero;
        if(saldo >= 0){
            this.saldo = saldo;
        }
    }

    public void imprimirSaldo(){
        //Imprimir o saldo, dessa conta. Por isso que usei esse "this."
        System.out.println(this.saldo);
    }

}
