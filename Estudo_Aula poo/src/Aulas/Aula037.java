package Aulas;

import java.util.Scanner;
import java.util.Random;

public class Aula037 {
	// Aulas 37/38/39/40 juntas!
	public static void main (String [] args){
		// estrutura Breack e continue I - II - III
		
		/* Exemplo 1
			  
			  for (teste){
			    if() {
			    execução 
			    break;,
		    
		 
		   Exemplo 2 
		    int i = 10;
		     while (i<100){
			  i++;
			  System.out.println(i);
			   if (true)
					break;
                          }			
                          
           Exemplo 3
            int dia = 2;
             switch (dia){
              case 1:
               Sys.Out ("Domingo")
                Breack;
                }                
		*/
		
		//função "Label", nomina algum laço.
		
		/* labelForlc1: for (int i = 0; i<10; i++){
			if (i==5)
				break;
			System.out.println(i);
			
			labelForlc2: for (int j = 0; j<10; j++){
				System.out.println("O valor de J é: "+j+" e o de I é: "+i);
				 if (j == 9 && i == 3)
					  break labelForlc1;
			}
			*/
		
			label1:{
				
				System.out.println("Label 1 ini");
				
			                                  
				label2: {
					System.out.println("Label 2 ini");
					
			                                      
					label3:{
						System.out.println("Label 3 ini");
						 if (true)
							 break label2;
													  
					}
					System.out.println("Label 3 fim");
				}
				System.out.println("Label 1 fim");
			}
		
		// continue!
	    
	 for (int i = 0 ; i < 100; i++){
		 if (i%2 == 0){ //formula basica para descobrir numeors pares
			 System.out.println("Par: "+i);
			 
			 
		 //}if (i%2 != 0){
		 //	 System.out.println("Impar: "+i);
		 // }
	 } else 
		 continue;
		 //System.out.println("-");
		 int a = 0, soma = 0;
		 
		  while (a < i){
			  a++;
			  soma +=a; 
			  System.out.println("A soma é: "+soma);
		                }
	 }
   }
}

