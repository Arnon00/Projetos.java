package Aps;

// -------------------  Importa�oes

import java.util.Scanner;

// -------------------  Come�o da clase

public class Segunda {
	
// -------------------  Main
	
	public static void main (String[] args){

// -------------------  Criando o vetor 
		
		int vet [] = new int [1700000];

// -------------------  Instanciando a Primeira classe - Cria��o do numeros
// -------------------  Instanciando Entrada de dados
		
		Primeira p = new Primeira();
		Scanner in = new Scanner(System.in);
		
// -------------------  La�o for		
		for (int a = 0; a < vet.length; a++){
// -------------------  Seguran�a		
		try{
// -------------------  Chamando o metodo gerador der numeros
			vet[a] = p.gerador();
// -------------------  Inprimindo na tela posi��o e conteudo do vetor
			System.out.println("Posi��o: "+a+" Valor: "+vet[a]);
			
			
// -------------------  Tratamento		
			}catch(Exception e){
//  ------------------- Menssagens 
				System.out.println("algo deu errado na impressao do seu vetor.");
				System.out.println(e);
			}
		}
// ------------------- Mensagem final com o tamanho do vetor.  		
		System.out.println("\n Seu vetor de "+vet.length+" posi��es esta pronto");
		
	}
	
	

}
