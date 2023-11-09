package exercicios;

import java.util.Scanner;

public class SwitchCase_Exercicio08 {

	public static void main(String[] args) {
		// Algoritmo que simula uma transação bancária. Recebe um número inteiro de 1 a 3 (saldo|deposito|saque) como código para uma operação e, caso seja 2 ou 3, recebe também o valor da transação. Retorna a operação feita e o saldo da conta
		
		// Criação das variáveis e do scanner
		int codigo;
		float saldo = 1000.00f;
		Scanner input = new Scanner(System.in);
		
		// Leitura dos inputs
		System.out.print("Operação (use o código número: 1|Saldo; 2|Depósito; 3| Saque): ");
		codigo = input.nextInt();
		
		// Switch...Case
		switch(codigo) {
		case 1:
			System.out.printf("\nOperação: Visualizar saldo. \nSaldo: R$ %.2f", saldo);
			break;
		case 2:
			System.out.print("Insira o valor da transação: ");
			float valorDeposito = input.nextFloat();
			saldo += valorDeposito;
			System.out.printf("\nOperação: Efetuar um depósito. \nNovo saldo: R$ %.2f", saldo);
			break;
		case 3:
			System.out.print("Insira o valor da transação: ");
			float valorSaque = input.nextFloat();
			if(valorSaque < saldo) {
				saldo -= valorSaque;
				System.out.printf("\nOperação: Efetuar um saque. \nNovo saldo: R$ %.2f", saldo);
			}else {
				System.out.print("\nSaldo insuficiente!");
			}
			break;
			
			default: System.out.print("\nOperação inválida!");
		}

	}

}
