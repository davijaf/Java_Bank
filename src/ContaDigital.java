
public class ContaDigital extends Conta{
	
		
	public ContaDigital(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("*** Extrato Conta Digital***");
		super.imprimirInfos();
		
	}

}