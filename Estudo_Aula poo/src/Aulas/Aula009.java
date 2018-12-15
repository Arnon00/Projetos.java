package Aulas;

import java.util.Scanner;

public class Aula009 {
	
	public static void main (String [] args){
		
		Scanner in = new Scanner ( System.in);
		
		double num1, 
		       num2,
		       soma,
		       subtração,
	           multiplicacao,
	           divisao,
		       potenciacao;
		System.out.println("Insira um número: ");		
		num1 = in.nextDouble();
		
		System.out.println("Insira outro numero: ");
		num2 = in.nextDouble();
		
		soma = num1 + num2;
				
			System.out.println("O resultado da soma é: "+soma+".");
		
		subtração = num1 - num2;
		
		    System.out.println("O resultado da subtração é: "+subtração+".");
		    
		multiplicacao = num1 * num2;
		
		    System.out.println("O resultado da multiplicação de "+num1+" por "+num2+" é: "+multiplicacao );
				
		divisao = num1 / num2;     
				
			System.out.println("O resultado da divisão de "+num1+" por "+num2+" é: "+divisao);	
			
			
			/* Ver depois como usa laço em java! 
			 * 
			 * switch (int i = 0;i = double.num2; i++);
			 * potenciacao = num1 * num2;
			 * 
			 */

					
		
		    
	}

}
