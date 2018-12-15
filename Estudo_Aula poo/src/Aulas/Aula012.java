package Aulas;

import java.util.Scanner;

public class Aula012 {

	public static void main (String[] args){
		
		Scanner in = new Scanner (System.in);
		
		double num1,
		       num2,
		       num3,
		       num4,
		       soma;
		
		System.out.println("Digite sua primeira nota: ");
		 num1 = in.nextDouble();
		
		System.out.println("Digite sua segunda nota: ");
		 num2 = in.nextDouble();
		
		System.out.println("Digite sua terceira nota: ");
		 num3 = in.nextDouble();

		System.out.println("Digite sua quarta nota: ");
		 num4 = in.nextDouble();
		
		 soma = num1+num2+num3+num4;
		 soma = soma / 4;
				 
		 System.out.println("A media das suas notas foram: "+soma);
		 
		 if (soma >= 7){
			 System.out.println("Você conseguiu as notas suficientes para passar");
		 }else{
			 System.out.println("Voce não conseguiu passar de ano.");
		 }
	}
}
