package exercicios;

import java.util.Scanner;

public class IfElse_Exercicio01 {

	public static void main(String[] args) {
		// Algoritmo que lê três valores inteiros (A, B e C) e retorna se a soma de A e B é maior, menor ou igual a C
		
		// Criação das variáveis e do Scanner
		int a, b, c, somaAB;
		
		Scanner input = new Scanner(System.in);
		
		// Leitura dos inputs
		System.out.print("Digite o número A: ");
		a = input.nextInt();
		
		System.out.print("Digite o número B: ");
		b = input.nextInt();
		
		System.out.print("Digite o número C: ");
		c = input.nextInt();
		
		somaAB = a + b;
		
		// Laço condicional IF
		if(somaAB > c) {
			System.out.print("\nA soma de A + B é maior que C.");
		}else if(somaAB < c) {
			System.out.print("\nA soma de A + B é menor que C.");	
		}else {
			System.out.print("\nA soma de A + B é igual a C.");
		}

	}

}
