package Aulas;

import java.util.Random;
import java.util.Scanner;

public class Aula035 {
	
	public static void main (String [] args ){
		Scanner in = new Scanner (System.in);
		Random r = new Random();
		
		  //Operação tenaria
		/*
		 * Definição
		 * <Variavel> = (Condição) ? <Valor1> : <Valor2>;
		 * 
		 * Lê-se
		 * <Variavel> = (True) se <Valor1> Senão <Valor2>
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
		
		//brincadeira com o conceito de geração de numeros e operações tenarias
		
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
