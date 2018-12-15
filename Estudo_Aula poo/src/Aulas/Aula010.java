package Aulas;

import java.util.Scanner;

public class Aula010 {

	public static void main (String [] args){
		
		int num;

		
		System.out.println("Digite algum numero: ");
		Scanner in = new Scanner (System.in);
		
		num=in.nextInt();
		
		if(num==10){
			System.out.println("Numero é igual a 10! ");
		}else{
			System.out.println("Numero não é igual a 10! ");
		}
		
	}
}
