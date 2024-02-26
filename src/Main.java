
public class Main {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		
		//vamos testar o deposito
		cc.depositar(100);;
		
		
		Conta poupanca = new ContaPoupanca();
		
		//vamos testar o transferir
		
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
