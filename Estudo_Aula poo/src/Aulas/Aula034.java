package Aulas;

import java.util.Random;
import java.util.Scanner;

public class Aula034 {

	public static void main (String [] args){
		
		Scanner in = new Scanner (System.in);
		Random num = new Random();
		
		System.out.println(num.nextInt(19)+1);
		
		//chamando a impressão do numero aleatorio,  como parametro 19 determina que o numero sera
		//escolhido no intervalo de 0 .. 19, como não queremos o numero 0 colocamos o +1, assim 
		//todo numero escolhido sera somado mais uma unidade nele 
		//Ex: random escolheu o numero 1 sera somado mais 1, e xibido na tela o numero 2
		// assim teremos então numeros randomicos de 1 a 20
	
		System.out.println("");
		System.out.println(" ----- ");
		System.out.println("");
		
		//aqui usamos o laço for para gerar uma sequencia de 10 numeros aleatorios 
		
		for(int i = 0 ; i <= 10 ; i++){
			System.out.println(num.nextInt(19)+1);
			//nextInt gera valores com int
			
			System.out.println(num.nextDouble()*19+1);
			//nextDouble gera valores com double
			//importante, sem o sinal de multiplicação, os valores são gerados entre 0 e 1
			//com o mesmo, garantimos que os numeros ficarão entre 1 e 19, com uma multiplicação pela 
			//quantidade max do sorteio.
			
			System.out.println(num.nextBoolean());
			//aqui ja entendemos o funcionamento do mesmo.
			
		}
	}
}
