package Aulas;

import java.util.Scanner;

public class Aula027 {

	public static void main(String [] args) {
		//laço de repetição do/while
		//executara o bloco pelo menos 1 vez (o faça enquanto) 
		
		int i = 0;
		
		/*do{
			System.out.println(i);
			 ++i;
			
		}while (i <= 10);
		*/
		
		do{ //entra no laço, e so depois faz o teste
			System.out.println("do/while");
		}while (i != 0);
		
		if (i != 0){ //faz o teste antes de entrar no laço
			System.out.println("if");
		 }
		  
		while (i != 0){ //faz o teste antes de entrar no laço
			System.out.println("while");	
		}
		
		
	}
}
