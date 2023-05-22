package br.com.fiap.banco;

public abstract class Conta {
    protected int numero;
    protected double saldo;

    public Conta(int numero) {
        this.numero = numero;
        this.saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) throws ArgumentoInvalidoException {
        if (valor >= 0) {
            saldo += valor;
        } else {
            throw new ArgumentoInvalidoException("Nao e permitido realizar depositos com valores negativos.");
        }
    }

    public abstract double realizarSaque(double valor) throws OperacaoNaoSuportadaException, ArgumentoInvalidoException;
    public abstract void realizarTransferencia(int numeroContaDestino, double valor) throws OperacaoNaoSuportadaException;
}
