package Aulas;

import java.util.Scanner;

public class Aula009 {
	
	public static void main (String [] args){
		
		Scanner in = new Scanner ( System.in);
		
		double num1, 
		       num2,
		       soma,
		       subtra��o,
	           multiplicacao,
	           divisao,
		       potenciacao;
		System.out.println("Insira um n�mero: ");		
		num1 = in.nextDouble();
		
		System.out.println("Insira outro numero: ");
		num2 = in.nextDouble();
		
		soma = num1 + num2;
				
			System.out.println("O resultado da soma �: "+soma+".");
		
		subtra��o = num1 - num2;
		
		    System.out.println("O resultado da subtra��o �: "+subtra��o+".");
		    
		multiplicacao = num1 * num2;
		
		    System.out.println("O resultado da multiplica��o de "+num1+" por "+num2+" �: "+multiplicacao );
				
		divisao = num1 / num2;     
				
			System.out.println("O resultado da divis�o de "+num1+" por "+num2+" �: "+divisao);	
			
			
			/* Ver depois como usa la�o em java! 
			 * 
			 * switch (int i = 0;i = double.num2; i++);
			 * potenciacao = num1 * num2;
			 * 
			 */

					
		
		    
	}

}
