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
		
		// Verifica se o animal é vertebrado ou invertebrado
		if(vertInvert.equalsIgnoreCase("vertebrado")) {
			
			//Caso positivo, pergunta entre ave e mamífero
			System.out.print("\tAve ou Mamífero: "); 
			classe = input.next();
			
			//Se for ave, pergunta entre carnívoro e onívoro
			if(classe.equalsIgnoreCase("ave")) { 
				System.out.print("\tCarnívoro ou Onívoro: ");
				dieta = input.next();
				
				//Se for carnívoro, retorna águia, se não, retorna pomba
				if(dieta.equalsIgnoreCase("carnívoro")) {
					System.out.print("\n\t\tÁguia");
				}else {
					System.out.print("\n\t\tPomba");
				}
			
			//Se for mamífero, pergunta entre onívoro e herbívoro
			}else { 
				System.out.print("\tOnívoro ou Herbívoro: ");
				dieta = input.next();				
				
				//Se for onívoro, retorna homem, se não, retorna vaca
				if(dieta.equalsIgnoreCase("onívoro")) {
					System.out.print("\n\t\tHomem");
				}else {
					System.out.print("\n\t\tVaca");
				}
			}
		}else { 
			
			//Se for invertebrado, pergunta entre inseto ou anelídeo
			System.out.print("\tInseto ou Anelídeo: ");
			classe = input.next();
			
			//Se for inseto, pergunta entre hematófago e herbívoro
			if(classe.equalsIgnoreCase("inseto")) {
				System.out.print("\tHematófago ou Herbívoro: ");
				dieta = input.next();
				
				//Se for hematófago, retorna pulga, se não, lagarta
				if(dieta.equalsIgnoreCase("hematófago")) {
					System.out.print("\n\t\tPulga");
				}else {
					System.out.print("\n\t\tLagarta");
				}
				
			//Se for anelídeo, pergunta entre hematófago e onívoro
			}else {
				System.out.print("\tHematófago ou Onívoro: ");
				dieta = input.next();
				
				//Se for hematófago retorna sanguessuga, se não, minhoca
				if(dieta.equalsIgnoreCase("hematófago")) {
					System.out.print("\n\t\tSanguessuga");
				}else {
					System.out.print("\n\t\tMinhoca");
				}
			}
		}

	}
}
