package br.com.fiap.banco;

public class App {
    public static void main(String[] args) throws ArgumentoInvalidoException, OperacaoNaoSuportadaException {
        ContaPoupanca contaPoupanca = new ContaPoupanca(1234);
        ContaCorrente contaCorrente = new ContaCorrente(5678);

        contaPoupanca.depositar(1030);
        System.out.println("Saldo da Conta Poupanca: " + contaPoupanca.getSaldo());

        contaCorrente.depositar(4200);
        System.out.println("Saldo da Conta Corrente: " + contaCorrente.getSaldo());

        double saquePoupanca = contaPoupanca.realizarSaque(50);
        double saqueCorrente = contaCorrente.realizarSaque(300);

        double novoSaldoPoupanca = (saquePoupanca != -1) ? saquePoupanca : contaPoupanca.getSaldo();
        double novoSaldoCorrente = (saqueCorrente != -1) ? saqueCorrente : contaCorrente.getSaldo();

        System.out.println("Saldo da Conta Poupanca: " + novoSaldoPoupanca);
        System.out.println("Saldo da Conta Corrente: " + novoSaldoCorrente);

        contaCorrente.realizarTransferencia(1234, 150);
		System.out.println("Saldo da Conta Corrente: " + contaCorrente.getSaldo());
    }
}
