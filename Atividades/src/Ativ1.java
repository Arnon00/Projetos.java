
import java.util.*;

public class Ativ1 {

public static void main (String[] args){
		
		Scanner in = new Scanner(System.in);
		Random rad = new Random();

		int [] vet = new int [10];
			
			for (int i = 0 ; i < vet.length ; i++){
				vet[i] = rad.nextInt((5)+45);
				  if (vet[i] == 0){
		 			  vet[i] = rad.nextInt(5); }				
			                                      }
	 	 		//System.out.println("-----------------------------");
				
				for(int i = 0 ; i < vet.length; i++){ 
		                for(int j = 0; j < vet.length; j++){
		                	
		                   if(vet[i] < vet[j]){
		                	   
		                        int aux = vet[i];
		                        vet[i] = vet[j];
		                        vet[j] = aux;    	                    
		                    }
		                }
		         }
				
				 for (int i=0 ; i <= vet.length-1; i++){
			            System.out.println("Valor I: "+i+" , "+vet[i]);
					 }		
				 
				 //System.out.println("Os valores ja estão devidamente cadastrados, oque deseseja fazer agora?");
				  
				 int aux2 = 0, aux3 = 0, aux4 = 0, aux5 = 0;

					for (int item : vet){
						if (item < aux2 || aux2 == 0)			
							aux2 = item;
						if (item > aux3)
							aux3 = item;
					                    }
 				 System.out.println("--------------------");
				 System.out.println("");
				 System.out.println("O menor valor vendido em um dia foi: "+aux2);
	       		 System.out.println("O maior valor vendido em um dia foi: "+aux3);
	       		 System.out.println("");
	       		 System.out.println("--------------------");
	       		 
	       		 for (int i = 0 ; i < vet.length ; i++){ 
		             aux4 += vet[i];   	         
	       		        }
	       		 
	       		aux5 = (aux4/vet.length);
	       		System.out.println("");
	       		System.out.println("Media de vendas no ano foi de: "+aux5);
	       		
	       		System.out.println("");
	       		System.out.println("--------------------");
	            System.out.println("");
	            
	            int a = 0;
	            
                for (int i = 0 ; i < vet.length-1 ; i++)
       			if (vet[i] >= aux5){
       				
       				 a = a + 1;
       				               }
	       		System.out.println("A media foi ultrapassada em "+a+" dos 364 dias do ano");
 } 
}

