package Aulas;

import java.util.Arrays;
import java.util.Scanner;

public class Aula050 {
	
	public static void main (String[] args){
		//Atividade! aula 50/51
		/* Peca para um usuario informar 7 numeros e armazeneos em um array.
		 * na sequencia 
		 * 
		 * 1) some todos os numeros e exiba na tela
		 * 2) Multipplique o indice pelo seu valor
		 * 3) calcule a media aritimetia 
		 */
		
		Scanner in = new Scanner (System.in);
		
		int [] vet = new int [7];
		
		System.out.println("Digite os 7 valores desejados: ");
			for (int a = 0 ; a < vet.length ; a++){
				System.out.printf("º%d = ", a+1);
				vet[a]= in.nextInt();
		}
		
			// uso classe array
			System.out.println(Arrays.toString(vet));
			
		    int soma = 0;
			  for (int b = 0 ; b < vet.length ; b++){	
			  soma += vet[b];
			  }
			  System.out.println("\nA soma dos valos no array é: "+soma+"\n");
		 	  
		System.out.println("Multiplicando indice pelo valor: \n");
		  for (int c = 0 ; c < vet.length ; c++){
			  int multi = c * vet[c];	  
			  	System.out.printf("%d * %2d = %2d\n",c,vet[c], multi);
		  } 
		  
		     double media = 0;
		    	 media = soma / vet.length;
		    	 System.out.println("\nA media é: "+media);


 }
}

