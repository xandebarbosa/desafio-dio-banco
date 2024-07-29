public class Main {
    public static void main(String[] args) {
		Cliente alexandre = new Cliente();
		alexandre.setNome("Alexandre");
        
		Conta cc = new ContaCorrente(alexandre);
		Conta poupanca = new ContaPoupanca(alexandre);

		cc.depositar(2000);
		cc.transferir(1000, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
