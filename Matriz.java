package Turma75;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matrizInteiros = new int [3][3];
		int linha, coluna, somaPrincipal = 0, somaSecundaria = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
			System.out.println("\nentre com algum valor");
			matrizInteiros[linha][coluna] = leia.nextInt();
			
			}
		}
		
		

			somaPrincipal = matrizInteiros[0][0] + matrizInteiros[1][1] + matrizInteiros[2][2];
			somaSecundaria = matrizInteiros[0][2] + matrizInteiros[1][1] + matrizInteiros[2][0];
			System.out.println("\nElementos da Diagonal Principal: " + matrizInteiros[0][0] +", " +matrizInteiros[1][1] + ", " + matrizInteiros[2][2] + "\na soma da diagonal principal é: " + somaPrincipal);
			System.out.println("\nElementos da Diagonal Secundaria: " + matrizInteiros[0][2] +", " +matrizInteiros[1][1] + ", " + matrizInteiros[2][0] + "\na soma da diagonal secundaria é: " + somaSecundaria);
			

			
			
			
			}
			
			
			
	}



