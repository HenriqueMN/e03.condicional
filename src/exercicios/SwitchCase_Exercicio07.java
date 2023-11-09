package exercicios;

import java.util.Scanner;

public class SwitchCase_Exercicio07 {

	public static void main(String[] args) {
		// Um algoritmo que recebe dois números float, um número inteiro referente ao código de uma operação matemática, e retorna a conta  matemática
		
		/*
		 * 1	| Soma
		 * 2	| Subtração
		 * 3	| Multiplicação
		 * 4	| Divisão
		 */
		
		// Criação das variáveis e do Scanner
		float num1, num2, resultado;
		int codigo;
		Scanner input = new Scanner(System.in);
		
		// Leitura dos inputs
		System.out.print("1º Número: ");
		num1 = input.nextFloat();
		System.out.print("2º Número: ");
		num2 = input.nextFloat();
		
		System.out.print("Operação(use o código numérico: 1|Soma; 2|Subtração; 3|Multiplicação; 4|Divisão: ");
		codigo = input.nextInt();
		
		//Switch...Case
		switch(codigo) {
		case 1:
			resultado = num1 + num2;
			System.out.printf("\n" + num1 + " + " + num2 + " = %.2f", resultado);
			break;
		case 2:
			resultado = num1 - num2;
			System.out.printf("\n" + num1 + " - " + num2 + " = %.2f", resultado);
			break;
		case 3:
			resultado = num1 * num2;
			System.out.printf("\n" + num1 + " * " + num2 + " = %.2f", resultado);
			break;
		case 4:
			resultado = num1 / num2;
			System.out.printf("\n" + num1 + " / " + num2 + " = %.2f", resultado);
			break;
			
			default: System.out.print("\nInsira um código válido.");
		}
		

	}

}
