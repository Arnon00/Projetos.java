package Aulas;

import java.util.Random;
import java.util.Scanner;

public class Aula035 {
	
	public static void main (String [] args ){
		Scanner in = new Scanner (System.in);
		Random r = new Random();
		
		  //Opera��o tenaria
		/*
		 * Defini��o
		 * <Variavel> = (Condi��o) ? <Valor1> : <Valor2>;
		 * 
		 * L�-se
		 * <Variavel> = (True) se <Valor1> Sen�o <Valor2>
		 * 
		 * Exemplo
		 * int num = (true) ? 20 : 10;
		 */
		
		String valor;
		
		/*
		int a, b;
		   a = 10;
	       b = 6;

		
		if (a==b){
			valor = "True";
		}else{
			valor = "False";
			
		}
		
	       
		valor = (a>b) ? "True" : "False";
		
		System.out.println(valor);
		*/	
		
		//brincadeira com o conceito de gera��o de numeros e opera��es tenarias
		
		int a, b;

		for (int i = 0 ; i <=20 ; i++){
			
			a = (r.nextInt(19)+1);		
			b = (r.nextInt(19)+1);
			
			valor = (a<=b)? "Bingo!" : "Tente de novo";
			
			System.out.println("No A temos: "+a+", No B temos: "+b+" ... "+valor);
			System.out.println("");
			
		}
	}

}
