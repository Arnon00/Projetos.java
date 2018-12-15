package Aulas;

import java.util.Scanner;

public class Aula008 {
	
	public static void main (String [] args){

		
		/* Todo programa tem 3 caracteristicas 
		 * 1) Entrada de dados
		 * 2) Processamento de dados 
		 * 3) Saida dos dados
		 */
		
		int idade,
		    calc;
		
		System.out.println("Digite a idade do seu cachorro: ");
		Scanner n = new Scanner ( System.in );
		
		idade = n.nextInt(); 
		calc = (idade * 7);
	
		System.out.println("Seu cachorro em idade humana tem: "+calc+" anos.");
	}

}
