package Aulas;

import java.util.Scanner;

public class Aula024 {
	
	public static void main (String [] args){
		
		Scanner in = new Scanner (System.in);
		
		// Precedência de operadores;
		
		/*
		 * +
		 * -
		 * *
		 * /
		 * % - resto da divisão (Modulo)
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
		y= a - b; //subtração
		y= a * b; //multiplicação
		y= a / b; //divisão
		
		y= a % b; //modulo
		
		//System.out.println(a * (b - c));
		//System.out.println( (a + b) / a - b);
		
		
	}

}
