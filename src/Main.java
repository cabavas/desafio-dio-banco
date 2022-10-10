public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Cliente caio = new Cliente();
        caio.setNome("Caio");

        Conta cc = new ContaCorrente(caio);
        Conta poupanca = new ContaPoupanca(caio);

        cc.depositar(250);
        cc.transferir(130, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}