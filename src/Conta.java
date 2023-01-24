
public abstract class Conta implements IConta{
	
	protected int agencia;
	protected int numeroConta;
	protected double saldo;
	protected Cliente cliente;
	protected static final int  AGENCIA_PADRAO = 1;
	protected static int SEQUENCIAL = 1;
	
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numeroConta = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	protected void imprimirInfos() {
		System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numeroConta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	@Override
	public void sacar(double valor) {
		if (saldo < valor) {
			System.out.println("Nao foi possivel realizar a operacao, saldo indisponivel!");
		}
		else
			this.saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		if (saldo < valor) {
			System.out.println("Transferencia nao realizada");
		}
		else
			contaDestino.depositar(valor);
	}
	

	
}
