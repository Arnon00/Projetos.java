
import java.util.*;

public class Ativ3 {

	public static void main (String[] args){
		
		Scanner in = new Scanner(System.in);
		Random rad = new Random();
		
		int [] gabarito = new int [10];
		
		for (int i = 0 ; i < gabarito.length ; i++){
			
			gabarito[i] = rad.nextInt((5)*1);
			 if (gabarito[i] == 0){
				 gabarito[i] += 1;
			 }
			 
			 //Para ver os valores no gabarito;
			 System.out.println("Respostas gabarito: "+gabarito[i]);
		}

		//Gerando os alunos, total de 15 (Não consegui por enquanto... )...
		              System.out.println("\n -------------------------------- \n");
		              System.out.println("Aluno: |               Respostas ");
		       		int [] [] alunos = new int [15] [11]; 
		       		
		       		for (int a = 0 ; a < 15 ; a++){
		       			alunos [a] [0] = a+1;
		       			System.out.printf("%6s |", a+1 );
		       			for(int b = 1 ; b < 11 ; ++b){
		       				alunos [a] [b] = rad.nextInt((5)*1);
		       						if (alunos[a] [b] == 0){
		       					        alunos[a] [b] += 1;
		       			                               }
		       						System.out.printf("%4s", alunos [a][b]);		
		       						                     } //aqui!!	
		       			System.out.print("  |"); //Ate aqui
		       			System.out.println(""); 
	                                                        }
		       		System.out.println("\n -------------------------------- \n");
		       		
		       		int acertos = 0;
					int erros = 0;
		       			for (int c = 0 ; c < 15 ; c++){
			       			alunos [c] [0] = c+1;
			       			System.out.printf("%6sº |", c+1 );
			       			for(int d = 1 ; d < 11 ; ++d){
		       		 if (alunos[c][d] == gabarito[d-1]){
							acertos = acertos+1;
						    }else{
						    erros = erros+1; 
						         }
					         }
			       			System.out.printf(" aluno teve %2s Acertos. e %2s Erros ",acertos, erros);
			       			System.out.println((""));
			       			acertos = 0;
			       			erros = 0;
		       		}
	 }
}

