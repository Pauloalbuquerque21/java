package section8_poo.banco;

public class Banco {
    public void depositar(Conta conta, double valor){
        double saldoAtual = conta.getValor();
        double novoSaldo = saldoAtual + valor;
        conta.setValor(novoSaldo);

    }

    public void sacar(Conta conta, double valor){
        double saldoAtual = conta.getValor();
        double novoSaldo = saldoAtual - valor;

        if(novoSaldo <0){
            System.out.println("Não foi possível sacar, o saldo ficará negativo!");
        } else {
            conta.setValor(novoSaldo);
        }
    }

    public void transferir(Cliente nome1, Conta origem, Cliente nome2, Conta destino, double valor){
        double saldoAtualOrigem = origem.getValor();
        double novoSaldoOrigem = saldoAtualOrigem - valor;
        if(novoSaldoOrigem < 0){
            System.out.println("Transferencia não realizada! Saldo insuficiente");
        } else {
            origem.setValor(novoSaldoOrigem);
            double novoSaldoDestino = destino.getValor() + valor;
            destino.setValor(novoSaldoDestino);
            System.out.println("A conta "+nome1.nome+" tranferido "+valor+" para conta "+nome2.nome);

        }

    }
}
