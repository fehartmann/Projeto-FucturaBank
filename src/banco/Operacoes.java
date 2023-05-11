package banco;

import java.util.Random;
import java.util.Scanner;

public class Operacoes {

	public static void main(String[] args) {
		int opmenu, opcao = 0, opcaocc, opcaocp;
		double valor;
		Random gerador = new Random();
				
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		Scanner dados = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		
			System.out.println("Olá, seja bem-vindo(a) ao FucturaBank");
			System.out.println("Se você ainda não é nosso cliente, digite 1");
			//System.out.println("Mas se você já é nosso cliente e quer ver as suas opções, digite 2");
			opmenu = scanner.nextInt();
			if (opmenu == 1) {
				System.out.println("Digite seu nome completo");
				String titular = dados.nextLine();
				int conta = gerador.nextInt(99999);
				cc = new ContaCorrente(titular, conta);
				cp = new ContaPoupanca(titular, conta);
				
					System.out.println("Sua conta corrente foi criada com sucesso, o número é: " + cc.numConta);
					System.out.println("Sua conta poupança foi criada com sucesso, o número é: " + cp.numConta + "-1");
					System.out.println("Como podemos te ajudar hoje?");
					System.out.println("Digite 1 - Conta Corrente ou 2- Conta Poupança");
					opcao = scanner.nextInt( );
			//} else {
				if (opcao == 1) {
				do {
					System.out.println("_____Menu Conta Corrente_____");
					System.out.println("     1- Exibir dados da conta        ");
					System.out.println("   2- Fazer depósito em conta    ");
					System.out.println("     3- Fazer saque em conta      ");
					System.out.println("    4- Mostrar saldo em conta    ");
					System.out.println("    5- Ir para Conta Poupança     ");
					System.out.println("                  0 - Sair                       ");
					System.out.println("_________________________________");
					opcaocc = scanner.nextInt();
			
				switch (opcaocc) {
				case 1: //Exibir dados
					cc.exibirDados();
				break;
								
				case 2: //Fazer depósito
					System.out.println("Qual o valor que você quer depositar?");
					valor = dados.nextDouble();
					cc.depositar(valor);
				break;	
					
				case 3: //Fazer saque
					System.out.println("Qual o valor que você quer sacar?");
					valor= dados.nextDouble();
					cc.sacar(valor);
				break;
				
				case 4:	 //Mostrar saldo
					cc.exibirSaldo();
				break;
				
				case 5: //Conta Poupança
					int resposta;
					do {
						System.out.println("_______Menu Conta Poupança______");
						System.out.println("          1- Exibir dados da conta         ");
						System.out.println("       2- Fazer aplicação em conta     ");
						System.out.println("         3- Fazer resgate em conta       ");
						System.out.println("        4- Mostrar saldo em conta       ");
						System.out.println("                       0 - Sair                          ");
						System.out.println("______________________________________");
						Scanner scanner2 = new Scanner(System.in);
						resposta = scanner2.nextInt();
				
					if (resposta == 1) {
						cp.exibirDados();
									
					} else if (resposta == 2) { //Fazer aplicação
						System.out.println("Qual o valor que você quer aplicar?");
						valor = dados.nextDouble();
						cc.aplicar(valor,cp);
														
					} else if (resposta == 3) {//Fazer resgate
						System.out.println("Qual o valor que você quer resgatar?");
						valor= dados.nextDouble();
						cp.resgatar(valor, cc);
									
					} else if (resposta == 4) {	 //Mostrar saldo
						cp.exibirSaldo();
					} else {
						System.out.println("Obrigada por fazer parte do FucturaBank!"); 
						} //else				
					} while (resposta != 0);	
												
				default: 
					System.out.println("Agradecemos o seu contato");
				}//switch1
				} while (opcaocc != 0); 
			
				} else if (opcao == 2) { //Conta Poupança
						do {
							System.out.println("_______Menu Conta Poupança______");
							System.out.println("          1- Exibir dados da conta         ");
							System.out.println("       2- Fazer aplicação em conta     ");
							System.out.println("         3- Fazer resgate em conta       ");
							System.out.println("        4- Mostrar saldo em conta       ");
							System.out.println("                       0 - Sair                         ");
							System.out.println("______________________________________");
						opcaocp = scanner.nextInt();
				
					switch (opcaocp) {
					case 1: //Exibir dados
						cp.exibirDados();
					break;
					
					case 2: //Fazer aplicação
						System.out.println("Qual o valor que você quer aplicar?");
						valor = dados.nextDouble();
						cc.aplicar(valor,cp);
					break;	
										
					case 3: //Fazer resgate
						System.out.println("Qual o valor que você quer resgatar?");
						valor= dados.nextDouble();
						cp.resgatar(valor, cc);
					break;
					
					case 4:	 //Mostrar saldo
						cp.exibirSaldo();
					break;
					
					default: 
						System.out.println("Agradecemos o seu contato");
					} //switch2
						} while (opcaocp != 0);	
						} else {
						System.out.println("Agradecemos o seu contato"); 
						} //else
			} while (opcao != 0);	//do

			
	}
}