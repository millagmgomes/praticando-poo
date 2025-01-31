class Conta {
    protected String titular;
    protected double saldo;

    public Conta(String titular, double saldoInicial){
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println(titular + " depositou R$" + valor);
    }

    public boolean sacar(double valor){
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println(titular + " sacou R$" + valor);
            return true;
        } else {
            System.out.println("Saldo insuficiente para saque");
            return false;
        }
    }

    public void exibirSaldo(){
        System.out.println("Saldo de " + titular + ": R$" + saldo);
    }
}
