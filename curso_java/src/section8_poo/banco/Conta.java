package section8_poo.banco;

public class Conta {
     private Cliente titular;
     private int numero;
     private double saldo;

     // Esse construtor está vazio, para existir a possibilidade de atribuir valores nas propriedades(colocar parametros), sem está instânciando o objeto
    public Conta(){}

    // Segue o construtor, lembre que ele tem que ter o mesmo nome da class.
    // Com ele, você quando instancia um objeto você já pode definir as proriedades(colocar os parametros)
    public Conta (Cliente titular, int numero, double saldo){
        this.titular = titular;
        this.numero = numero;
        //this.saldo = saldo;
        if(saldo >= 0){
            this.saldo = saldo;
        }
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return this.numero;
    }

    //Método com o void, logo concluimos que não retorná nada.
    public void setValor(double valor){
        if(valor > 0){
            this.saldo = valor;
        }else{
            System.out.println("Saldo para deposito é menor que zero.");
        }

    }
    //Esse é um método que não tem um void, pois ele retorna um valor. Por esse motivo temos que colocar o tipo, nesse caso
    //usamos o double.
    public double getValor(){
        return this.saldo;
    }


    public void imprimirSaldo(){
        //Imprimir o saldo, dessa conta. Por isso que usei esse "this."
        System.out.println(this.saldo);
    }

}
