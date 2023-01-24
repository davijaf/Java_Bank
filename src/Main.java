
public class Main {

	public static void main(String[] args) {
		Cliente davijose = new Cliente();
		davijose.setNome("Davi Jose");
		Conta cc = new ContaCorrente(davijose);
		Conta pp = new ContaPoupanca(davijose);
		Conta cd = new ContaDigital(davijose);
		
		cc.depositar(10);
		pp.depositar(10);
		pp.transferir(10, cc);
		
		cc.imprimirExtrato();
		pp.imprimirExtrato();
		
		cc.sacar(30);
		cc.imprimirExtrato();
		pp.transferir(10, cc);
		
		cc.imprimirExtrato();
		pp.imprimirExtrato();
		
		cd.depositar(10);
		cd.imprimirExtrato();
	}

}
