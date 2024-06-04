package contaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		// Scanner
		Scanner banco = new Scanner(System.in); // Abrindo Scanner
		
		// Pegando os valores
		System.out.println("Por favor, digite o número da conta!");
		String numero = banco.nextLine();
		
		System.out.println("Por favor, digite o número da agência!");
		String agencia = banco.nextLine();
		
		System.out.println("Por favor, digite o seu nome!");
		String nomeCliente = banco.nextLine();
		
		System.out.println("Por favor, digite o saldo!");
		String saldoS = banco.nextLine();
		
		banco.close(); // Fechando Scanner
		// Convertendo
		int conta = Integer.parseInt(numero);
		int saldo = Integer.parseInt(saldoS);
		
		// Exibindo mensagem
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
	}
}
