package banco;

public class ContaCorrente extends Contas {
	
	//Método construtor
	ContaCorrente () {
	}
	
	ContaCorrente (String titular, int conta) {
		this.setTitular(titular);
		this.numConta = conta;
	}
		
	//Métodos herdados
	@Override
	public void exibirDados() {
		System.out.println("----------Conta Corrente----------");
		System.out.println("Número da conta corrente: " + this.numConta);
		System.out.println("Titular da conta: " + this.getTitular());
		System.out.println("Saldo da conta corrente: R$" + this.getSaldo());
	}

	@Override
	public void depositar(double valor) {
		this.setSaldo(getSaldo() + valor);
		System.out.println("Depósito realizado com sucesso! Saldo da conta corrente: R$" + this.getSaldo());
	}

	@Override
	public void exibirSaldo() {
		System.out.println("Saldo da conta corrente: R$" + this.getSaldo());
	}

	//Métodos da classe
	public void sacar (double valor) {
		if (this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Saque bem sucedido! Seu novo saldo é R$" + this.getSaldo());
		} else {
			System.out.println("Seu saldo é de R$" + this.getSaldo() + ". Não foi possível seguir com sua solicitação");
		}
	}
	
	public void aplicar (double valor, ContaPoupanca destino) {
		if (this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
			destino.depositar(valor);
			System.out.println("Aplicação realizada com sucesso! Saldo da conta poupança: R$" +destino.getSaldo());
		} else {
			System.out.println("Não é possível concluir a transação, seu saldo é insuficiente.");
		}
	}
	
	//public void criarConta() {
	//	int numConta = new Random();
	//	this.conta = numConta.nextInt(99999);
		
}
	

