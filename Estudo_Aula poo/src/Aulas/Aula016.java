package Aulas;

import java.util.Scanner;

public class Aula016 {
	
	public static void main (String [] args){
		
		Scanner in = new Scanner (System.in);
		
		final double vsom = 340.28; // m/s
		int tempo;
		
		System.out.println("Digite o espaço de tempo em segundos: ");
		 tempo = in.nextInt();
		 
		 System.out.println("A distancia percorrida foi: "+ tempo*vsom+" Metros");
		 
		 System.out.println("A distancia percorrida foi: "+ (tempo*vsom)/1000+" Kms");
		
	}

}
