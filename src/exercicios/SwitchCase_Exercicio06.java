package exercicios;

import java.util.Scanner;

public class SwitchCase_Exercicio06 {

	public static void main(String[] args) {
		// Algoritmo que recebe o nome do colaborador (String), o código do seu cargo (int) e o seu salário (float) e retorna o salário reajustado
		/*
		 * Reajuste:
		 * 1 - Gerente 		| 10%
		 * 2 - Vendedor		| 7%
		 * 3 - Supervisor	| 9%
		 * 4 - Motorista 	| 6%
		 * 5 - Estoquista 	| 5%
		 * 6 - Técnico de TI| 8% 
		 */
		
		// Criação das variáveis e do Scanner
		String nome;
		int codigo;
		float salario, salarioReajustado;
		Scanner input = new Scanner(System.in);
		
		// Leitura dos inputs
		System.out.print("Digite o nome: ");
		nome = input.nextLine();
		
		System.out.print("Digite o código do cargo: ");
		codigo = input.nextInt();
		
		System.out.print("Digite o salário: ");
		salario = input.nextFloat();
		
		// Switch...Case
		
		switch(codigo) {
		case 1:
			salarioReajustado = salario + (salario*0.10f); // Cálculo do reajuste
			System.out.printf("Nome do Colaborador: " + nome + "\n" +
							"Cargo: Gerente" + "\n" +
							"Salário: %.2f", salarioReajustado);
			break;
		case 2:
			salarioReajustado = salario + (salario*0.07f);
			System.out.printf("Nome do Colaborador: " + nome + "\n" +
							"Cargo: Vendedor" + "\n" +
							"Salário: %.2f", salarioReajustado);
			break;
		case 3:
			salarioReajustado = salario + (salario*0.09f);
			System.out.printf("Nome do Colaborador: " + nome + "\n" +
							"Cargo: Supervisor" + "\n" +
							"Salário: %.2f", salarioReajustado);
			break;
		case 4:
			salarioReajustado = salario + (salario*0.06f);
			System.out.printf("Nome do Colaborador: " + nome + "\n" +
							"Cargo: Motorista" + "\n" +
							"Salário: %.2f", salarioReajustado);
			break;
		case 5:
			salarioReajustado = salario + (salario*0.05f);
			System.out.printf("Nome do Colaborador: " + nome + "\n" +
							"Cargo: Estoquista" + "\n" +
							"Salário: %.2f", salarioReajustado);
			break;
		case 6:
			salarioReajustado = salario + (salario*0.08f);
			System.out.printf("Nome do Colaborador: " + nome + "\n" +
							"Cargo: Técnico de TI" + "\n" +
							"Salário: %.2f", salarioReajustado);
			break;
			
			default: System.out.print("Código inválido.");
		}
		
	}

}
