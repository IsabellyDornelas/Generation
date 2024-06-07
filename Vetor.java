package Turma75;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int [] vetor = new int [10]; 
		int x=0;
		int NumeroPesquisado;
		boolean encontrado = false;
		
		System.out.println("\nentre com os 10 numeros inteiros: ");
		
		for (x = 0; x < 10; x++) {
			System.out.println("\nNumero" + (x+1));
			vetor[x] = leia.nextInt();
		}
		
		 System.out.print("Digite um número para pesquisar no vetor: ");
	         NumeroPesquisado = leia.nextInt();
	        
	        
	        for (x = 0; x < 10; x++) {
	        	if (vetor[x] == NumeroPesquisado) {
	        		encontrado = true;
	        		System.out.println("O número " + 	NumeroPesquisado + " está na posição " + x + " do vetor.");	
	        		break;
	        	}
	        }
	        
	        if (!encontrado) {
	        	System.out.println("\nnumero " + NumeroPesquisado + "\nnão esta no vetor");
	        	
	        }
	        
	        
	        
	        leia.close();
	}
}
	        	
	        	
	        
	        
		
		
		
		