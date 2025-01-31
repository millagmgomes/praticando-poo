
class ContaCorrente extends Conta {
    private static final double TAXA_SAQUE = 2.50;

    public ContaCorrente(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        double valorComTaxa = valor + TAXA_SAQUE;
        if (saldo >= valorComTaxa) {
            saldo -= valorComTaxa;
            System.out.println(titular + " sacou R$" + valor + " (Taxa de R$" + TAXA_SAQUE + " aplicada");
            return true;
        } else {
            System.out.println("Saldo insuficiente para saque com taxa.");
            return false;
        }
    }
}
