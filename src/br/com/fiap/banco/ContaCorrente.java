package br.com.fiap.banco;

public class ContaCorrente extends Conta {
    private double tarifa;

    public ContaCorrente(int numero) {
        super(numero);
        this.tarifa = 0.0;
    }

    @Override
    public double realizarSaque(double valor) throws ArgumentoInvalidoException {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            throw new ArgumentoInvalidoException("Saldo insuficiente para realizar o saque.");
        }
        return saldo;
    }

    @Override
    public void realizarTransferencia(int numeroContaDestino, double valor) {
        throw new UnsupportedOperationException("Nao e permitido realizar transferencias em conta corrente.");
    }
}
