package Aulas;

import java.util.Scanner;

public class Aula017 {
	
	public static void main (String [] args){
		//introd��o aos valores logicos 
		
		int ij, 
		    id,
		    iv;
		
		ij = 17;
		iv = 60;
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Digite sua idade");
		 id = in.nextInt();
		
		 if (id <= ij && id > 0){
			 System.out.println("Voce ainda e jovem!");
		   }if (id >= ij && id <= 59 ){
			 System.out.println("Voce n�o e mais t�o jovem, porem n�o e velho");
			
		     }if (id >= iv && id <= 119){
		    	 System.out.println("Voce ja e um senhor de idade");
		       }if (id <= 0){
		    	   System.out.println("Essa idade n�o existe!");
		         }if (id >= 120){
		        	System.out.println("Verifique que a idade foi digitada correramente"); 
		         }
		
		
	}

}
