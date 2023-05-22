package br.com.fiap.banco;

public class ContaPoupanca extends Conta {
    private double taxa;

    public ContaPoupanca(int numero) {
        super(numero);
        this.taxa = 0.0;
    }

    @Override
    public double realizarSaque(double valor) throws OperacaoNaoSuportadaException {
        throw new OperacaoNaoSuportadaException("Nao e possivel realizar saques em conta poupanca.");
    }

    @Override
    public void realizarTransferencia(int numeroContaDestino, double valor) throws OperacaoNaoSuportadaException {
        throw new OperacaoNaoSuportadaException("Nao e permitido realizar transferencias em conta poupanca.");
    }
}
