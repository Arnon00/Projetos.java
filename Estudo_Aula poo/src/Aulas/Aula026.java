package Aulas;

import java.util.Scanner;

public class Aula026 {

	
	public static void main (String [] args){
		//Operadores de incremento I
		
		int i = 0,
			y = 0;
		
		
		// ++i operador de pre-incremento 
		// Ex: i += 1;
		//� incrementado +1 antes da instru��o ond a variavel estiver contida
        System.out.println( ++i  + " (Pr�-decremento)");
		
        //y++ Operador de pos-incremento
     	// Ex: 1 += y;
     	//� incrementado +1 depois da instru��o ond a variavel estiver contida
		System.out.println( y++ + " (pos-decremento)");
		
		System.out.println("---------------------");
		
		int a = 0,
			b = 0;
		
		System.out.println( --a + " (Pr�-decremento)");
        System.out.println( b-- + " (pos-decremento)");		
        
        System.out.println("------------------");
        
        int u = 0;
        
        u = u + 10; // Forma tradicional
         System.out.println(u);
        
         u=0;
        u += 10; // Operador de Atribui��o
         System.out.println(u);
         
         u=0;
        ++u; // operador de incremento (Dividido entre Pr� e p�s incremento)
        System.out.println(u);
	}  
}
