class ContaPoupanca extends Conta {
    private static final double TAXA_JUROS = 0.05;

    public ContaPoupanca(String titular, double saldoInicial){
        super(titular, saldoInicial);
    }

    public void renderJuros(){
        double rendimento = saldo * TAXA_JUROS;
        saldo += rendimento;
        System.out.println(titular + "recebeu R$" + rendimento + " de juros");
    }
}
