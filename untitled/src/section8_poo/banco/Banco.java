package section8_poo.banco;

public class Banco {
    void depositar(Conta conta, double valor){
        double saldoAtual = conta.saldo;
        double novoSaldo = saldoAtual + valor;
        conta.saldo = novoSaldo;

    }

    void sacar(Conta conta, double valor){
        double saldoAtual = conta.saldo;
        double novoSaldo = saldoAtual - valor;

        if(novoSaldo <0){
            System.out.println("Não foi possível sacar, o saldo ficará negativo!");
        } else {
            conta.saldo = novoSaldo;
        }
    }

    void transferir(Cliente nome1, Conta origem, Cliente nome2, Conta destino, double valor){
        double saldoAtualOrigem = origem.saldo;
        double novoSaldoOrigem = saldoAtualOrigem - valor;
        if(novoSaldoOrigem < 0){
            System.out.println("Transferencia não realizada! Saldo insuficiente");
        } else {
            origem.saldo = novoSaldoOrigem;
            double novoSaldoDestino = destino.saldo + valor;
            destino.saldo = novoSaldoDestino;
            System.out.println("A conta "+nome1.nome+" tranferido "+valor+" para conta "+nome2.nome);
        }

    }
}
