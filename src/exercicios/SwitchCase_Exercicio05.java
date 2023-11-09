package exercicios;

import java.util.Scanner;

public class SwitchCase_Exercicio05 {

	public static void main(String[] args) {
		// Algoritmo que mostra um menu e recebe o código do item comprado e a quantidade de items e retorna o nome do item e o valor total da compra
		
		// Criação das variáveis e do Scanner
		int codigo, quantidade;
		float valorTotal;
		Scanner input = new Scanner(System.in);
		
		// Menu e Leitura do input
		System.out.print("\t\tMenu" + "\n\n"+
		"Código\t|\tNome\t|\tPreço" + "\n" +
		"1\t|Cachorro Quente|R$ 10.00" + "\n" +
		"2\t|X-Salada\t|R$ 15.00" + "\n" +
		"3\t|X-Bacon\t|R$ 18.00" + "\n" +
		"4\t|Bauru\t\t|R$ 12.00" + "\n" +
		"5\t|Refrigerante\t|R$ 8.00" + "\n" +
		"6\t|Suco de laranja|R$ 13.00");
		
		System.out.print("\n\nDigite o código do produto: ");
		codigo = input.nextInt();
		
		System.out.print("Digite a quantidade do produto: ");
		quantidade = input.nextInt();
		
		//Switch...Case
		switch(codigo) {
		case 1:
			valorTotal = 10*quantidade;
			System.out.printf("\nProduto: Cachorro Quente\nValor total: R$%.2f", valorTotal);
			break;
		case 2:
			valorTotal = 15*quantidade;
			System.out.printf("\nProduto: X-Salada\nValor total: R$%.2f", valorTotal);
			break;
		case 3:
			valorTotal = 18*quantidade;
			System.out.printf("\nProduto: X-Bacon\nValor total: R$%.2f", valorTotal);
			break;
		case 4:
			valorTotal = 12*quantidade;
			System.out.printf("\nProduto: Bauru\nValor total: R$%.2f", valorTotal);
			break;
		case 5:
			valorTotal = 8*quantidade;
			System.out.printf("\nProduto: Refrigerante\nValor total: R$%.2f", valorTotal);
			break;
		case 6:
			valorTotal = 13*quantidade;
			System.out.printf("\nProduto: Suco de laranja\nValor total: R$%.2f", valorTotal);
			break;
		default: System.out.print("\nInsira um código válido");
			
		}

	}

}
