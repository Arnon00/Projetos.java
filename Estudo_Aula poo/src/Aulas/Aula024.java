package Aulas;

import java.util.Scanner;

public class Aula024 {
	
	public static void main (String [] args){
		
		Scanner in = new Scanner (System.in);
		
		// Preced�ncia de operadores;
		
		/*
		 * +
		 * -
		 * *
		 * /
		 * % - resto da divis�o (Modulo)
		 * 
		 */
		
		int a,
		    b,
	     	c,
	     	y;
		
		a = 15;
		b = 10;
		c = 5; 
		
		y= a + b; //soma 
		y= a - b; //subtra��o
		y= a * b; //multiplica��o
		y= a / b; //divis�o
		
		y= a % b; //modulo
		
		//System.out.println(a * (b - c));
		//System.out.println( (a + b) / a - b);
		
		
	}

}
