package neverCalculadora;

import java.util.Scanner;

public class Testes {
	
	public static void main (String[] args){
		
		Scanner in = new Scanner (System.in);
		
		Influenciaveis violeta = new Influenciaveis();
		
		
		violeta.setCrit(0);
		
		
		violeta.ccrit();
		
		
		System.out.println("Digite o valor: (Chance critica)");
		double critico = in.nextDouble();
		teste_Conta(critico);
		
		System.out.println(violeta.ccrit());
	}

	
	public static void teste_Conta(double valor){
		double fixo = 28.8;
		double resultado;
		
		resultado = fixo*(valor*(1*2))/(10186+(valor*(1*2)));
		
		System.out.println(resultado);
	}
}
