package exercicios;

import java.util.Scanner;

public class IfElse_Exercicio04 {

	public static void main(String[] args) {
		// Algoritmo que recebe três strings, cada uma com uma característica animal, e retorna um animal que encaixe nas três
		
		// Criação das variáveis e do Scanner
		String vertInvert, classe, dieta;
		Scanner input = new Scanner(System.in);
		
		// Leitura dos dados e laços condicionais
		System.out.println("Escolha uma das características: ");
		System.out.print("\tVertebrado ou Invertebrado: ");
		vertInvert = input.next();
		
		if(vertInvert.equalsIgnoreCase("vertebrado")) { //Verifica se o animal é vertebrado ou invertebrado
			System.out.print("\tAve ou Mamífero: "); //Caso positivo, pergunta entre ave e mamífero
			classe = input.next();
			
			if(classe.equalsIgnoreCase("ave")) { //Se for ave, pergunta entre carnívoro e onívoro
				System.out.print("\tCarnívoro ou Onívoro: ");
				dieta = input.next();
				
				if(dieta.equalsIgnoreCase("carnívoro")) {//Se for carnívoro, retorna águia, se não, retorna pomba
					System.out.print("\n\t\tÁguia");
				}else {
					System.out.print("\n\t\tPomba");
				}
			}else { //Se for mamífero, pergunta entre onívoro e herbívoro
				System.out.print("\tOnívoro ou Herbívoro: ");
				dieta = input.next();
				
				if(dieta.equalsIgnoreCase("onívoro")) {//Se for onívoro, retorna homem, se não, retorna vaca
					System.out.print("\n\t\tHomem");
				}else {
					System.out.print("\n\t\tVaca");
				}
			}
		}else if(vertInvert.equalsIgnoreCase("invertebrado")) { //Se for invertebrado, pergunta entre inseto ou anelídeo
			System.out.print("\tInseto ou Anelídeo: ");
			classe = input.next();
			
			if(classe.equalsIgnoreCase("inseto")) { //Se for inseto, pergunta entre hematófago e herbívoro
				System.out.print("\tHematófago ou Herbívoro: ");
				dieta = input.next();
				
				if(dieta.equalsIgnoreCase("hematófago")) { //Se for hematófago, retorna pulga, se não, lagarta
					System.out.print("\n\t\tPulga");
				}else {
					System.out.print("\n\t\tLagarta");
				}
			}else { //Se for anelídeo, pergunta entre hematófago e onívoro
				System.out.print("\tHematófago ou Onívoro: ");
				dieta = input.next();
				
				if(dieta.equalsIgnoreCase("hematófago")) { //Se for hematófago retorna sanguessuga, se não, minhoca
					System.out.print("\n\t\tSanguessuga");
				}else {
					System.out.print("\n\t\tMinhoca");
				}
			}
		}else { //Se entrar uma palavra diferente de vertebrado ou invertebrado, dispara essa mensagem
			System.out.print("\nPor favor, insira uma característica válida.");
		}

	}
}
