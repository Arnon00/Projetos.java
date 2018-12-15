package Aulas;

import java.util.Scanner;

public class Aula025 {

	public static void main (String [] args){
		//operadores de atribuição 
		
		int i = 0;
	    
		// i = i + 1;
		
		// adiciona o valor a direita do operador ao valor a esquerda do operador  
		// e adiciona o resultado a variavel mais a esquerda dos operadores;
		
		/*
		i += 9;
		 System.out.println( i );
		
		i=i + 1;
		 System.out.println( i );		
		*/
		
		 /*
		  * x += y;
		  * x -= y;
		  * 
		  * x *= y;
		  * x /= y;
		  * 
		  * x %= y;
		  * 
		  */
		
		 int x = 12, y = 4;
		  x = 12;
		 System.out.println(x += y);
		  
		  x = 12;
		 System.out.println(x *= y);
		 
		 x = 12;
		 System.out.println(x /= y);
		 
		 x = 12;
		 System.out.println(x %= y);

		 
	}
	
}
