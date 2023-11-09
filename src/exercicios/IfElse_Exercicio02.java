package exercicios;

import java.util.Scanner;

public class IfElse_Exercicio02 {

	public static void main(String[] args) {
		// Algoritmo que lê um valor inteiro e retorna se o número é par ou ímpar e positivo ou negativo
		
		// Criação das variáveis e do Scanner
		int numero;
		String parImpar, posiNeg;
		Scanner input = new Scanner(System.in);
		
		// Leitura do input
		System.out.print("Digite um número inteiro: ");
		numero = input.nextInt();
		
		// Laços condicionais
		if(numero%2 == 0) { //Verifica se o número é par ou ímpar
			parImpar = "par";
		}else {
			parImpar = "ímpar";
		}
		
		if(numero > 0) { //Verifica se o número é positivo, negativo ou nenhum dos dois
			posiNeg = "positivo";
		}else if(numero < 0) {
			posiNeg = "negativo";
		}else {
			posiNeg = "nem positivo nem negativo";
		}
		
		// Output
		System.out.print("\nO número " + numero + " é " + parImpar + " e " + posiNeg + "!");
		
	}

}
