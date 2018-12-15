package Aulas;

import java.util.Scanner;

public class Aula031 {
	
	public static void main(String[] args){
		
		Scanner in = new Scanner (System.in);
		
		// for III
		/*
		for (
				int i = 0; // inicialização
				i <= 10;  //expressão
				i++ //atualização
				){
			
			System.out.println(i);
		}
		
		 * for (parte 1; parte 2; parte 3)
		 * 
		 * parte 1, onde a variavel e declarada 
		 * parte 2, onde colocamos as condiçoes para o laço
		 * parte 3, onde escolhemos se o laço sera crecente ou decrecente
		 * 
		
		
		
		 * int j = 0; //definido
		 * /
		 * while (j <=10){//expressao		
		 * ++j;//incremento 
		  
		* Iint x = 0;
		* for (; x <= 10;){
		*	++x;
		*	System.out.println(x);
		* }
		
		
		*int y = 0;
		*for (; y<=10; ++y){
		*	System.out.println( y );
		*}
		*/
		
		for (int a=0, b=10; a<=10; ++a, --b){
			System.out.print(a); // a - b
			System.out.print(" - ");
			System.out.print(b);
			System.out.println();
		}
		
	}
	

}