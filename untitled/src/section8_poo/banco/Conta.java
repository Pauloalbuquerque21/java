package section8_poo.banco;

public class Conta {
     public Cliente titular;
     public int numero;
     private double saldo;

    public Conta(){}

    public Conta (Cliente titular, int numero, double saldo){
        this.titular = titular;
        this.numero = numero;
        //this.saldo = saldo;
        if(saldo >= 0){
            this.saldo = saldo;
        }
    }
    //Método com o void, logo concluimos que não retorná nada.
    public void modificarSaldo(double valor){
        if(valor > 0){
            this.saldo = valor;
        }else{
            System.out.println("Saldo para deposito é menor que zero.");
        }

    }
    //Esse é um método que não tem um void, pois ele retorna um valor. Por esse motivo temos que colocar o tipo, nesse caso
    //usamos o double.
    public double obterSaldo(){
        return this.saldo;
    }


    public void imprimirSaldo(){
        //Imprimir o saldo, dessa conta. Por isso que usei esse "this."
        System.out.println(this.saldo);
    }

}
