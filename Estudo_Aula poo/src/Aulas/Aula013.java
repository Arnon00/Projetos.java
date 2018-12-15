package Aulas;

import java.util.Scanner;

public class Aula013 {
	
	public static void main (String [] args ){
		
		Scanner in = new Scanner (System.in);
		
		int i;
		double num1,
		       num2,
		       resultado;
		
		System.out.println("Digite 1 para somar");
		System.out.println("Digite 2 para subtrair");
		System.out.println("Digite 3 para multiplicar");
		System.out.println("Digite 4 para dividir");
		
	    i = in.nextInt();
		
		System.out.println("Digite o primeiro numero: ");
		 num1 = in.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		 num2 = in.nextDouble();
		
		if (i == 1){
			resultado = num1 + num2; 
			 System.out.println("O resultado foi: "+resultado);
			
		 }if(i == 2){ 
			resultado = num1 = num2;
			 System.out.println("O resultado da subtração foi: "+resultado);
			
		  }if (i == 3){
			  resultado = num1 * num2;
			  System.out.println("O resultado da multiplicação foi: "+resultado);
			  
		   }if( i == 4){
			   resultado = num1/num2;
			   System.out.println("o resultado da divisão é: "+resultado);
			      
		    }
		
	}

}
