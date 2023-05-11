package banco;

import java.util.Random;
import java.util.Scanner;

public class ContaPoupanca extends Contas {

	Scanner dados = new Scanner(System.in);
//Método construtor
	ContaPoupanca () {
	}
			
	ContaPoupanca (String titular, int conta) {
			this.setTitular(titular);
			this.numConta = conta;
	}
			
	//Métodos herdados	
	@Override
	public void exibirDados() {
		System.out.println("-----------Conta Poupança-----------");
		System.out.println("Número da conta poupança: " + this.numConta + "-1");
		System.out.println("Titular da conta: " + this.getTitular());
		System.out.println("Saldo da conta poupança: R$" + this.getSaldo());
	}

	@Override
	public void depositar(double valor) {
		this.setSaldo(this.getSaldo() + valor);	
	}

	@Override
	public void exibirSaldo() {
		System.out.println("Saldo da conta poupança: R$" + this.getSaldo());
		
	}

	//Métodos da classe
	public void resgatar (double valor, ContaCorrente destino) {
		if (this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
			destino.depositar(valor);
			System.out.println("Resgate feito com sucesso, seu novo saldo é R$" + this.getSaldo());
		} else {
			System.out.println("O saldo da conta corrente é insuficiente para completar a transação");
		}
	}
	
	public void criarConta() {
		Random numConta = new Random();
		int conta = numConta.nextInt(99999);
			}
}