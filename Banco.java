public class Banco {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Mila", 1000);
        ContaPoupanca cp = new ContaPoupanca("Gomes", 500);

        cc.exibirSaldo();
        cc.sacar(200);
        cc.exibirSaldo();
        cc.depositar(500);
        cc.exibirSaldo();

        System.out.println("-------------");

        cp.exibirSaldo();
        cp.depositar(200);
        cp.renderJuros();
        cp.exibirSaldo();
    }
}
