package DesafioDeBanco;

public class ContaMain {

	public static void main(String[] args) {
		
		Cliente Nilson = new Cliente();
		Nilson.setNome("Nilson");
		
		IConta cc = new ContaCorrente(Nilson);
		IConta poupanca = new ContaPoupanca(Nilson);
		
		cc.depositar(100);
		cc.transferir(100,poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
