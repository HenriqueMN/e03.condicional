package exercicios;

import java.util.Scanner;

public class IfElse_Exercicio03 {

	public static void main(String[] args) {
		// Algoritmo que recebe uma string de nome, um inteiro de idade e um boolean (significando sim ou não) e com base nesses dados retorna o nome da pessoa e se ela está apta ou não para doar sangue
		
		// Criação das variáveis e do Scanner
		String nome;
		int idade;
		boolean primeiraVez;
		Scanner input = new Scanner(System.in);
		
		// Leitura dos inputs
		System.out.print("Digite o nome do doador: ");
		nome = input.nextLine();
		
		System.out.print("Digite a idade do doador: ");
		idade = input.nextInt();
		
		System.out.print("Primeira doação de sangue?(true/false): ");
		primeiraVez = input.nextBoolean();
		
		// Laços condicionais
		if(idade >= 18 && idade <= 69) { //Critério: ter entre 18 e 69 anos
			if((idade >= 60 && idade <= 69) && primeiraVez == true) { //Critério: se tem entre 60 e 69 anos, só pode doar se não for a primeira doação
				System.out.print("\n" + nome + " não está apto(a) para doar!");
			}else {
				System.out.print("\n" + nome + " está apto(a) para doar!");
			}
		}else {
			System.out.print("\n" + nome + " não está apto(a) para doar!");
		}

	}
	
}
