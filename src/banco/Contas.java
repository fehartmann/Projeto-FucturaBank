package banco;

import java.util.Random;

public abstract class Contas {
	//Atributos
	public int numConta;
	protected String titular;
	private double saldo;
	public int conta;
		
	//Métodos especiais
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	//Métodos da classe
	public abstract void exibirDados ( );
	public abstract void depositar (double valor);
	public abstract void exibirSaldo ( );

}
