package Aulas;

import java.util.Scanner;

public class Aula026 {

	
	public static void main (String [] args){
		//Operadores de incremento I
		
		int i = 0,
			y = 0;
		
		
		// ++i operador de pre-incremento 
		// Ex: i += 1;
		//é incrementado +1 antes da instrução ond a variavel estiver contida
        System.out.println( ++i  + " (Pré-decremento)");
		
        //y++ Operador de pos-incremento
     	// Ex: 1 += y;
     	//é incrementado +1 depois da instrução ond a variavel estiver contida
		System.out.println( y++ + " (pos-decremento)");
		
		System.out.println("---------------------");
		
		int a = 0,
			b = 0;
		
		System.out.println( --a + " (Pré-decremento)");
        System.out.println( b-- + " (pos-decremento)");		
        
        System.out.println("------------------");
        
        int u = 0;
        
        u = u + 10; // Forma tradicional
         System.out.println(u);
        
         u=0;
        u += 10; // Operador de Atribuição
         System.out.println(u);
         
         u=0;
        ++u; // operador de incremento (Dividido entre Pré e pós incremento)
        System.out.println(u);
	}  
}
