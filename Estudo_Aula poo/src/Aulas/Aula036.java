package Aulas;

import java.util.Scanner;

public class Aula036 {
	
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		//Opera��o tenaria II
		
		int num;
		String dia;
		
		System.out.println("Qual o seu dia da semana preferido?");
		System.out.println("Coma�ando a segunda com 1, e o domingo com 7.");
		
		num = in.nextInt();
		
		dia = (num==1) ? "Segunda" : 
			  (num==2) ? "Ter�a" :
			  (num==3) ? "Quarta" :
			  (num==4) ? "Quinta" :
			  (num==5) ? "Sexta" :
			  (num==6) ? "Sabado" :
			  (num==7) ? "Domingo" :
			             "Dia invalido";
		
		System.out.println("O dia escolhido foi: "+dia);
		
		// switch(num){
		// case 1 : dia = "segunda";
		// case 2 : dia = "ter�a"
		//		default : dia = "Dia invalido"; 
		//		
		// }
	}

}
