package Aulas;

import java.util.Scanner;

public class Aula028 {
	
	public static void main (String[] args){
		
		Scanner in = new Scanner (System.in);
		
		//looping Do/While II
		
		int x = 0;
		double num1, num2, resultado;
		
		do{
			
		System.out.println("Digite o codigo da operação desejada");
		System.out.println("1) somar");
		System.out.println("2) subtrair");
		System.out.println("3) multiplicar");
		System.out.println("4) dividir");
		System.out.println("0) sair");
		
		x = in.nextInt();
		
		 if (x!=0){
		
		System.out.println("Digite o primeiro numero");
		 num1 = in.nextDouble();
		 
		System.out.println("Digite o segundo numero");
		 num2 = in.nextDouble();
		 
		 if(x == 1){
			 resultado = (num1 + num2);
			 System.out.println("o resultado é: "+resultado);
		   }if (x == 2){
			     resultado = (num1 - num2);
			     System.out.println("o resultado é: "+resultado);
		     }if (x == 3){
		    	   resultado = (num1 * num2);
		    	   System.out.println("o resultado é: "+resultado);
		       }if (x == 4){ 
		    	     resultado = (num1 / num2);
		    	     System.out.println("o resultado é: "+resultado);
	                       } 
	                 }
		}while (x != 0);
		
		System.out.println("Até logo!");
   }

}
