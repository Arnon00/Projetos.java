
import java.util.*;

public class Ativ2 {
	
public static void main (String[] args){
		
		Scanner in = new Scanner(System.in);
		Random rad = new Random();
		
		int [] vet = new int [11];
		
		for (int i = 0 ; i < vet.length ; i++){
			
			vet[i] = rad.nextInt((10) +100);

			
		}
		//para ver os numeros gerados no vetor
		//System.out.println("Os numeros inicias no vertor são :\n");	
		 //for (int imp1 = 0 ; imp1 <  vet.length ; imp1++){
			//System.out.println("Posição: "+imp1+" - valor:"+vet[imp1]);
		//}
		    //System.out.println("\n----------------------");
		
		for(int i = 0 ; i < vet.length; i++){ 
            for(int j = 0; j < vet.length; j++){
            	
               if(vet[i] < vet[j]){
            	   
            	   int aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;    	                    
                } 
              }
            }
		
		//Para verificar se os numeros estão organizados
          //System.out.println("Os numeros no vertor organizados são : \n");	
		    //for (int imp2 = 0 ; imp2 < vet.length ; imp2++){
			   //System.out.println("Posição: "+imp2 +" - Valor: "+vet[imp2]);
		    //}
		       System.out.println("\nOs numeros do vetor são: \n");
		        
		       int soma = 0; 
		       	for (int a = 0 ; a < vet.length; a++)
                  soma += vet[a];

		       //para conferir se o laço esta funcionando como idealizado
		       //System.out.println("A soma dos numeros no vetor é: \n"+soma);
		       
		       vet[vet.length-1] = (soma / vet[vet.length-1]);
		       
		       for (int k = 0 ; k <= vet.length-2 ; k++)
		         System.out.println("Posição: "+k +" - valor: "+ vet[k]);
		       
		       System.out.println("\nE divisão dos valores presentes no vetor pelo maior numero no mesmo é: "+vet[vet.length-1]);
		   
   }

}
