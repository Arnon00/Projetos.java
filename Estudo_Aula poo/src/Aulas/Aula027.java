package Aulas;

import java.util.Scanner;

public class Aula027 {

	public static void main(String [] args) {
		//la�o de repeti��o do/while
		//executara o bloco pelo menos 1 vez (o fa�a enquanto) 
		
		int i = 0;
		
		/*do{
			System.out.println(i);
			 ++i;
			
		}while (i <= 10);
		*/
		
		do{ //entra no la�o, e so depois faz o teste
			System.out.println("do/while");
		}while (i != 0);
		
		if (i != 0){ //faz o teste antes de entrar no la�o
			System.out.println("if");
		 }
		  
		while (i != 0){ //faz o teste antes de entrar no la�o
			System.out.println("while");	
		}
		
		
	}
}
