package section8_poo.banco;

public class Main {
    public static void main(String[] args) {

        //Instanciando a variavel fulano, criar um objeto de uma class em java
        //você está criando uma instância da class Cliente e armazenando-a na variavel fulano
        Cliente fulano = new Cliente("123.456.789.30","carlos");
        //Atribuindo o valor "carlos" no atribudo nome
        //fulano.nome = "carlos";
        //fulano.cpf = "123.456.789.30";

        Conta contaFulano = new Conta();
        contaFulano.numero = 100;
        contaFulano.saldo = 150.50;

        System.out.println("Saldo atual do "+fulano.nome);
        contaFulano.imprimirSaldo();
        // Quando a class tem um construtor, só colocamos o parametro
        Cliente fulano2 = new Cliente("321.654.987.20","Paulo");
        //fulano2.nome = "Paulo";
        //fulano2.cpf = "321.654.987.20";

        Conta contaFulano2 = new Conta();
        contaFulano2.numero = 101;
        contaFulano2.saldo = 200;


        System.out.println("Saldo atual do "+fulano2.nome);
        contaFulano2.imprimirSaldo();

        Banco sistemaBancario = new Banco();
        sistemaBancario.depositar(contaFulano,100);

        System.out.println("Saldo do "+fulano.nome+" após o deposito é igual: "+contaFulano.saldo);

        sistemaBancario.sacar(contaFulano2,50);
        System.out.println("Saldo do "+fulano2.nome+" apos o saque: "+contaFulano2.saldo);

        //Tranferência entre contas:
        sistemaBancario.transferir(fulano,contaFulano,fulano2,contaFulano2,100);

        contaFulano.imprimirSaldo();
    }
}
